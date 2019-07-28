package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to define a new key for a table.
  * @see com.sun.star.sdbcx.Key
  */
trait KeyDescriptor
  extends Descriptor
     with XColumnsSupplier {
  /**
    * is the rule which is applied for deletions; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var DeleteRule: Double
  /** is the name of the referenced table, only used for foreign keys. */
  var ReferencedTable: String
  /**
    * indicates the type of the key.
    * @see com.sun.star.sdbcx.KeyType
    */
  var Type: Double
  /**
    * is the rule which is applied for updates; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var UpdateRule: Double
}

object KeyDescriptor {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    DeleteRule: Double,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    ReferencedTable: String,
    Type: Double,
    UpdateRule: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): KeyDescriptor = {
    val __obj = js.Dynamic.literal(Columns = Columns, DeleteRule = DeleteRule, Name = Name, PropertySetInfo = PropertySetInfo, ReferencedTable = ReferencedTable, Type = Type, UpdateRule = UpdateRule, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[KeyDescriptor]
  }
}

