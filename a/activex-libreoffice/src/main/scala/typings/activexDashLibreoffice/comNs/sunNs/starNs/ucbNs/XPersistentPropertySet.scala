package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A persistent property set, which can be saved in and restored from a {@link XPropertySetRegistry} .
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPersistentPropertySet extends XPropertySet {
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  val Key: String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  val Registry: XPropertySetRegistry
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  def getKey(): String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  def getRegistry(): XPropertySetRegistry
}

object XPersistentPropertySet {
  @scala.inline
  def apply(
    Key: String,
    PropertySetInfo: XPropertySetInfo,
    Registry: XPropertySetRegistry,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getKey: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRegistry: () => XPropertySetRegistry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XPersistentPropertySet = {
    val __obj = js.Dynamic.literal(Key = Key, PropertySetInfo = PropertySetInfo, Registry = Registry, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getKey = js.Any.fromFunction0(getKey), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRegistry = js.Any.fromFunction0(getRegistry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XPersistentPropertySet]
  }
}

