package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to specify the index for a database table. It refers to one or more columns of a table.
  *
  * ** Note: ** All properties and columns of an index could by modified before they are appended to a table. In that case the service is a data
  * descriptor.
  */
trait Index
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name of the index catalog, may be empty. */
  var Catalog: java.lang.String
  /** indicates that the index is clustered. */
  var IsClustered: scala.Boolean
  /** indicates that the index is used for the primary key. */
  var IsPrimaryKeyIndex: scala.Boolean
  /** indicates that the index allow only unique values. */
  var IsUnique: scala.Boolean
  /** is the name of the index. */
  var Name: java.lang.String
}

object Index {
  @scala.inline
  def apply(
    Catalog: java.lang.String,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    IsClustered: scala.Boolean,
    IsPrimaryKeyIndex: scala.Boolean,
    IsUnique: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
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
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
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
  ): Index = {
    val __obj = js.Dynamic.literal(Catalog = Catalog, Columns = Columns, IsClustered = IsClustered, IsPrimaryKeyIndex = IsPrimaryKeyIndex, IsUnique = IsUnique, Name = Name, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getColumns = getColumns, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Index]
  }
}

