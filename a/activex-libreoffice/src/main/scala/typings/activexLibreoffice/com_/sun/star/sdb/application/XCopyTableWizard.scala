package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a wizard which can be used to copy table like data from one database to another.
  *
  * Copying table data between databases can be a complex task. Especially when it comes to matching field types in the source and in the target database,
  * some heuristics, and sometimes support from the user doing the operation, are required.
  *
  * The `copy table wizard` described by this interfaces cares for those, and other, settings.
  * @since OOo 2.4
  */
@js.native
trait XCopyTableWizard extends XExecutableDialog {
  /**
    * specifies that a new primary key is to be created in the target database
    *
    * At initialization time, you can specify the initial settings for the primary key in the UI.
    *
    * You cannot use this attribute to determine the primary key, possibly created by the wizard, after it finished. The reason is that during the wizard
    * run, the user can define an arbitrarily complex primary key, e.g. including multiple columns, which cannot be represented in this simple attribute
    * anymore.
    *
    * This attribute is ignored if {@link Operation} is {@link CopyTableOperation.AppendData} .
    *
    * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
    *
    * When a primary key is to be created by the wizard, it will be an auto-increment column, if possible.
    * @throws com::sun::star::lang::IllegalArgumentException if the target database does not support primary keys
    */
  var CreatePrimaryKey: Optional[String] = js.native
  /**
    * specifies the name of the table in the destination database.
    *
    * At initialization time, you can use this attribute to control the initial table name as suggested to the user.
    *
    * After the wizard has finished, you can use this attribute to determine what table was actually created resp. to which existing table the source
    * table's data was appended.
    *
    * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
    */
  var DestinationTableName: String = js.native
  /**
    * specifies the basic operation for the wizard to execute.
    *
    * This must be one of the {@link CopyTableOperation} constants.
    *
    * At initialization time, you can use this attribute to control the initial operation in the wizard.
    *
    * After the wizard has finished, you can use this attribute to determine what operation was actually executed.
    *
    * Changing this attribute while the dialog is running is not supported, the result of such an attempt is undefined.
    * @throws IllegalArgumentException if you attempt to set an invalid operation, or if the given operation is not supported by the target database type, e.g.
    */
  var Operation: Double = js.native
  /**
    * specifies that the first row should be used to identify column names.
    *
    * This attribute is ignored when the source defines the column names which isn't the case when only a part of a table should be copied e.g. in the RTF
    * format or in the HTML format.
    */
  var UseHeaderLineAsColumnNames: Boolean = js.native
  /** adds a listener which is to be notified of progress in the copy operation */
  def addCopyTableListener(Listener: XCopyTableListener): Unit = js.native
  /** removes a listener */
  def removeCopyTableListener(Listener: XCopyTableListener): Unit = js.native
}

object XCopyTableWizard {
  @scala.inline
  def apply(
    CreatePrimaryKey: Optional[String],
    DestinationTableName: String,
    Operation: Double,
    UseHeaderLineAsColumnNames: Boolean,
    acquire: () => Unit,
    addCopyTableListener: XCopyTableListener => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCopyTableListener: XCopyTableListener => Unit,
    setTitle: String => Unit
  ): XCopyTableWizard = {
    val __obj = js.Dynamic.literal(CreatePrimaryKey = CreatePrimaryKey.asInstanceOf[js.Any], DestinationTableName = DestinationTableName.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], UseHeaderLineAsColumnNames = UseHeaderLineAsColumnNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addCopyTableListener = js.Any.fromFunction1(addCopyTableListener), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCopyTableListener = js.Any.fromFunction1(removeCopyTableListener), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XCopyTableWizard]
  }
  @scala.inline
  implicit class XCopyTableWizardOps[Self <: XCopyTableWizard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatePrimaryKey(value: Optional[String]): Self = this.set("CreatePrimaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationTableName(value: String): Self = this.set("DestinationTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: Double): Self = this.set("Operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseHeaderLineAsColumnNames(value: Boolean): Self = this.set("UseHeaderLineAsColumnNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddCopyTableListener(value: XCopyTableListener => Unit): Self = this.set("addCopyTableListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveCopyTableListener(value: XCopyTableListener => Unit): Self = this.set("removeCopyTableListener", js.Any.fromFunction1(value))
  }
  
}

