package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
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
     with XPropertySet {
  /** is the name of the index catalog, may be empty. */
  var Catalog: String
  /** indicates that the index is clustered. */
  var IsClustered: Boolean
  /** indicates that the index is used for the primary key. */
  var IsPrimaryKeyIndex: Boolean
  /** indicates that the index allow only unique values. */
  var IsUnique: Boolean
  /** is the name of the index. */
  var Name: String
}

object Index {
  @scala.inline
  def apply(
    Catalog: String,
    Columns: XNameAccess,
    IsClustered: Boolean,
    IsPrimaryKeyIndex: Boolean,
    IsUnique: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
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
  ): Index = {
    val __obj = js.Dynamic.literal(Catalog = Catalog, Columns = Columns, IsClustered = IsClustered, IsPrimaryKeyIndex = IsPrimaryKeyIndex, IsUnique = IsUnique, Name = Name, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Index]
  }
}

