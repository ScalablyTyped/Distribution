package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementation of this service can keep any properties and is useful when an {@link XPropertySet} is to be used, for example, as parameters for a
  * method call.
  *
  * Scripting engines might not be able to use such objects as normal property sets, giving direct access to the properties. In this case, use the methods
  * like {@link XPropertySet.getPropertyValue()} .
  */
trait PropertyBag extends XPropertyBag {
  def createDefault(): scala.Unit
  def createWithTypes(
    AllowedTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`],
    AllowEmptyPropertyName: scala.Boolean,
    AutomaticAddition: scala.Boolean
  ): scala.Unit
}

object PropertyBag {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: stdLib.SafeArray[PropertyValue],
    acquire: () => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => scala.Unit,
    createDefault: () => scala.Unit,
    createWithTypes: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`], scala.Boolean, scala.Boolean) => scala.Unit,
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
  ): PropertyBag = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, PropertyValues = PropertyValues, acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDefault = js.Any.fromFunction0(createDefault), createWithTypes = js.Any.fromFunction3(createWithTypes), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
  
    __obj.asInstanceOf[PropertyBag]
  }
}

