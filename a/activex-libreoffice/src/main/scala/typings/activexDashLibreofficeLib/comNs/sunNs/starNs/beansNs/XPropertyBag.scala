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
    PropertyValues: stdLib.SafeArray[PropertyValue],
    acquire: () => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getPropertyValues: () => stdLib.SafeArray[PropertyValue],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeProperty: java.lang.String => scala.Unit,
    removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setPropertyValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PropertyValue] => scala.Unit
  ): XPropertyBag = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, PropertyValues = PropertyValues, acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
  
    __obj.asInstanceOf[XPropertyBag]
  }
}

