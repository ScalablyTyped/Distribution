package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a table of a database. A table is described by its name and one or more columns and the keys for semantic rules.
  *
  * In addition, it may contain keys, and to define semantic rules for the table. ** Note: ** Indexes can only be appended when the table is already
  * appended at the database.
  * @see com.sun.star.sdbcx.Table
  */
trait TableDescriptor
  extends Descriptor
     with XColumnsSupplier
     with XKeysSupplier {
  /** is the name of the table catalog. */
  var CatalogName: String
  /** supplies a comment on the table, Could be empty if not supported by the driver. */
  var Description: String
  /** is the name of the table schema. */
  var SchemaName: String
}

object TableDescriptor {
  @scala.inline
  def apply(
    CatalogName: String,
    Columns: XNameAccess,
    Description: String,
    Keys: XIndexAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SchemaName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumns: () => XNameAccess,
    getKeys: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableDescriptor = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, Columns = Columns, Description = Description, Keys = Keys, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumns = js.Any.fromFunction0(getColumns), getKeys = js.Any.fromFunction0(getKeys), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TableDescriptor]
  }
}

