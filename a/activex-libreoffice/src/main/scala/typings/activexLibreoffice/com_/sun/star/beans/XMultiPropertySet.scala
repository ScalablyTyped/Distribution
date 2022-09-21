package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to multiple properties with a single call. */
trait XMultiPropertySet
  extends StObject
     with XInterface {
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  val PropertySetInfo: XPropertySetInfo
  
  /**
    * adds an {@link XPropertiesChangeListener} to the specified property with the specified names.
    *
    * The implementation can ignore the names of the properties and fire the event on all properties.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param aPropertyNames specifies the names of the properties.
    * @param xListener contains the listener for the property change events.
    * @see removePropertiesChangeListener
    */
  def addPropertiesChangeListener(aPropertyNames: SeqEquiv[String], xListener: XPropertiesChangeListener): Unit
  
  /**
    * fires a sequence of PropertyChangeEvents to the specified listener.
    * @param aPropertyNames specifies the sorted names of the properties.
    * @param xListener contains the listener for the property change events.
    */
  def firePropertiesChangeEvent(aPropertyNames: SeqEquiv[String], xListener: XPropertiesChangeListener): Unit
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  def getPropertySetInfo(): XPropertySetInfo
  
  /**
    * @param aPropertyNames specifies the names of the properties. This sequence must be alphabetically sorted.
    * @returns a sequence of all values of the properties which are specified by their names.  The order of the values in the returned sequence will be the same
    */
  def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[Any]
  
  /**
    * removes an {@link XPropertiesChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param xListener contains the listener to be removed.
    * @see addPropertiesChangeListener
    */
  def removePropertiesChangeListener(xListener: XPropertiesChangeListener): Unit
  
  /**
    * sets the values to the properties with the specified names.
    *
    * The values of the properties must change before the bound events are fired. The values of the constrained properties should change after the vetoable
    * events are fired and only if no exception occurred. Unknown properties are ignored.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @param aValues contains the new values of the properties. The order is the same as in **aPropertyNames** .
    * @throws IllegalArgumentException if one of the new values cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang:WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception i
    */
  def setPropertyValues(aPropertyNames: SeqEquiv[String], aValues: SeqEquiv[Any]): Unit
}
object XMultiPropertySet {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit
  ): XMultiPropertySet = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValues = js.Any.fromFunction1(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[XMultiPropertySet]
  }
  
  extension [Self <: XMultiPropertySet](x: Self) {
    
    inline def setAddPropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = StObject.set(x, "addPropertiesChangeListener", js.Any.fromFunction2(value))
    
    inline def setFirePropertiesChangeEvent(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = StObject.set(x, "firePropertiesChangeEvent", js.Any.fromFunction2(value))
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setGetPropertyValues(value: SeqEquiv[String] => SafeArray[Any]): Self = StObject.set(x, "getPropertyValues", js.Any.fromFunction1(value))
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
    
    inline def setRemovePropertiesChangeListener(value: XPropertiesChangeListener => Unit): Self = StObject.set(x, "removePropertiesChangeListener", js.Any.fromFunction1(value))
    
    inline def setSetPropertyValues(value: (SeqEquiv[String], SeqEquiv[Any]) => Unit): Self = StObject.set(x, "setPropertyValues", js.Any.fromFunction2(value))
  }
}
