package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service contains the interfaces to implement by objects returned by XPropertySetRegistryFactory::createRegistry(). */
trait PropertySetRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with XPropertySetRegistry

object PropertySetRegistry {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    openPropertySet: js.Function2[java.lang.String, scala.Boolean, XPersistentPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertySet: js.Function1[java.lang.String, scala.Unit]
  ): PropertySetRegistry = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, openPropertySet = openPropertySet, queryInterface = queryInterface, release = release, removePropertySet = removePropertySet)
  
    __obj.asInstanceOf[PropertySetRegistry]
  }
}

