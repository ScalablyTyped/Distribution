package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs

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
trait XCopyTableWizard
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
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
  var CreatePrimaryKey: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
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
  var DestinationTableName: java.lang.String
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
  var Operation: scala.Double
  /**
    * specifies that the first row should be used to identify column names.
    *
    * This attribute is ignored when the source defines the column names which isn't the case when only a part of a table should be copied e.g. in the RTF
    * format or in the HTML format.
    */
  var UseHeaderLineAsColumnNames: scala.Boolean
  /** adds a listener which is to be notified of progress in the copy operation */
  def addCopyTableListener(Listener: XCopyTableListener): scala.Unit
  /** removes a listener */
  def removeCopyTableListener(Listener: XCopyTableListener): scala.Unit
}

