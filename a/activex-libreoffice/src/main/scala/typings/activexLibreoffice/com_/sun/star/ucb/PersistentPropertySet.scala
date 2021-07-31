package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service contains the interfaces to implement by objects returned by {@link XPropertySetRegistry.openPropertySet()} . */
trait PersistentPropertySet
  extends StObject
     with XPersistentPropertySet
     with XNamed
     with XPropertyContainer
     with XPropertyAccess
object PersistentPropertySet {
  
  @scala.inline
  def apply(
    Key: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    PropertyValues: SafeArray[PropertyValue],
    Registry: XPropertySetRegistry,
    acquire: () => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getKey: () => String,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: () => SafeArray[PropertyValue],
    getRegistry: () => XPropertySetRegistry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeProperty: String => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: SeqEquiv[PropertyValue] => Unit
  ): PersistentPropertySet = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any], Registry = Registry.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getKey = js.Any.fromFunction0(getKey), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction0(getPropertyValues), getRegistry = js.Any.fromFunction0(getRegistry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
    __obj.asInstanceOf[PersistentPropertySet]
  }
}
