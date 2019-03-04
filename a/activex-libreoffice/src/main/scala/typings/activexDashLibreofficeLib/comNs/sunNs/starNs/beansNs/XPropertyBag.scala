package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XPropertyBag
  extends XPropertySet
     with XPropertyContainer
     with XPropertyAccess

object XPropertyBag {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: activexDashInteropLib.SafeArray[PropertyValue],
    acquire: js.Function0[scala.Unit],
    addProperty: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    addPropertyChangeListener: js.Function2[java.lang.String, XPropertyChangeListener, scala.Unit],
    addVetoableChangeListener: js.Function2[java.lang.String, XVetoableChangeListener, scala.Unit],
    getPropertySetInfo: js.Function0[XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function0[activexDashInteropLib.SafeArray[PropertyValue]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeProperty: js.Function1[java.lang.String, scala.Unit],
    removePropertyChangeListener: js.Function2[java.lang.String, XPropertyChangeListener, scala.Unit],
    removeVetoableChangeListener: js.Function2[java.lang.String, XVetoableChangeListener, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue], scala.Unit]
  ): XPropertyBag = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, PropertyValues = PropertyValues, acquire = acquire, addProperty = addProperty, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, queryInterface = queryInterface, release = release, removeProperty = removeProperty, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[XPropertyBag]
  }
}

