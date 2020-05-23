package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
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
trait PropertyBag
  extends XPropertySet
     with XPropertyContainer
     with XPropertyAccess {
  def createDefault(): Unit
  def createWithTypes(AllowedTypes: SeqEquiv[`type`], AllowEmptyPropertyName: Boolean, AutomaticAddition: Boolean): Unit
}

object PropertyBag {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: SafeArray[PropertyValue],
    acquire: () => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDefault: () => Unit,
    createWithTypes: (SeqEquiv[`type`], Boolean, Boolean) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeProperty: String => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: SeqEquiv[PropertyValue] => Unit
  ): PropertyBag = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDefault = js.Any.fromFunction0(createDefault), createWithTypes = js.Any.fromFunction3(createWithTypes), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
    __obj.asInstanceOf[PropertyBag]
  }
}

