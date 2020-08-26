package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.sdbcx.Descriptor
import typings.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XDataDescriptorFactory
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stored definition of a SQL "Select statement".
  *
  * It can be used, if there is a need to execute SQL statement more than once or if you want to format the query result fields different from the
  * underlying table definitions.
  */
@js.native
trait QueryDescriptor
  extends Descriptor
     with XDataDescriptorFactory
     with DataSettings
     with XColumnsSupplier {
  /** is the command of the query, this is typically a select statement. */
  var Command: String = js.native
  /** should we use escape processing for the query. */
  var EscapeProcessing: Boolean = js.native
  /** is the name of the update table catalog. */
  var UpdateCatalogName: String = js.native
  /** is the name of the update table schema. */
  var UpdateSchemaName: String = js.native
  /** is the name of the table which should be updated. This is usually used for queries which relate on more than one table. */
  var UpdateTableName: String = js.native
}

object QueryDescriptor {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Columns: XNameAccess,
    Command: String,
    EscapeProcessing: Boolean,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Name: String,
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RowHeight: Double,
    TextColor: Color,
    UpdateCatalogName: String,
    UpdateSchemaName: String,
    UpdateTableName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): QueryDescriptor = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], UpdateCatalogName = UpdateCatalogName.asInstanceOf[js.Any], UpdateSchemaName = UpdateSchemaName.asInstanceOf[js.Any], UpdateTableName = UpdateTableName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[QueryDescriptor]
  }
  @scala.inline
  implicit class QueryDescriptorOps[Self <: QueryDescriptor] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeProcessing(value: Boolean): Self = this.set("EscapeProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateCatalogName(value: String): Self = this.set("UpdateCatalogName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateSchemaName(value: String): Self = this.set("UpdateSchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTableName(value: String): Self = this.set("UpdateTableName", value.asInstanceOf[js.Any])
  }
  
}

