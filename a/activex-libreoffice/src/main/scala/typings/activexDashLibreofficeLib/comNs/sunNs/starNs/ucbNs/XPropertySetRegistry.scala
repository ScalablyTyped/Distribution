package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A registry (storage medium) for persistent property sets.
  * @author Kai Sommerfeld
  * @see XPersistentPropertySet
  * @version 1.0
  */
trait XPropertySetRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new or opens an existing property set in the registry.
    * @param key The key to use for addressing the property set.
    * @param create Indicates whether a new set shall be created in case there does not already exist one for the given key.
    * @returns The property set.
    */
  def openPropertySet(key: java.lang.String, create: scala.Boolean): XPersistentPropertySet
  /**
    * removes a property set from the registry.
    * @param key The key to use for addressing the property set.
    */
  def removePropertySet(key: java.lang.String): scala.Unit
}

object XPropertySetRegistry {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    openPropertySet: js.Function2[java.lang.String, scala.Boolean, XPersistentPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertySet: js.Function1[java.lang.String, scala.Unit]
  ): XPropertySetRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("openPropertySet")(openPropertySet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertySet")(removePropertySet)
    __obj.asInstanceOf[XPropertySetRegistry]
  }
}

