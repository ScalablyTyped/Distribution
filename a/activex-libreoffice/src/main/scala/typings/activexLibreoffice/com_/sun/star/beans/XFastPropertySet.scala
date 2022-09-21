package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a fast way of accessing and changing property values.
  *
  * This interface is an extension to the {@link XPropertySet} interface. The get and set methods use handles to access the property values instead of
  * character strings.
  */
trait XFastPropertySet
  extends StObject
     with XInterface {
  
  /**
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @returns the value of the property with the name PropertyName.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getFastPropertyValue(nHandle: Double): Any
  
  /**
    * sets the value to the property with the specified name.
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @param aValue contains the new value of the property.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws PropertyVetoException if a vetoable listener does not approve the change of a property value.
    * @throws IllegalArgumentException if the new value cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setFastPropertyValue(nHandle: Double, aValue: Any): Unit
}
object XFastPropertySet {
  
  inline def apply(
    acquire: () => Unit,
    getFastPropertyValue: Double => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    setFastPropertyValue: (Double, Any) => Unit
  ): XFastPropertySet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
    __obj.asInstanceOf[XFastPropertySet]
  }
  
  extension [Self <: XFastPropertySet](x: Self) {
    
    inline def setGetFastPropertyValue(value: Double => Any): Self = StObject.set(x, "getFastPropertyValue", js.Any.fromFunction1(value))
    
    inline def setSetFastPropertyValue(value: (Double, Any) => Unit): Self = StObject.set(x, "setFastPropertyValue", js.Any.fromFunction2(value))
  }
}
