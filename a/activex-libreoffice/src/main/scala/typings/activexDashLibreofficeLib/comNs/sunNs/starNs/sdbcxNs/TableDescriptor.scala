package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

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
  var CatalogName: java.lang.String
  /** supplies a comment on the table, Could be empty if not supported by the driver. */
  var Description: java.lang.String
  /** is the name of the table schema. */
  var SchemaName: java.lang.String
}

object TableDescriptor {
  @scala.inline
  def apply(
    CatalogName: java.lang.String,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Description: java.lang.String,
    Keys: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SchemaName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getKeys: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableDescriptor = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, Columns = Columns, Description = Description, Keys = Keys, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getColumns = getColumns, getKeys = getKeys, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TableDescriptor]
  }
}

