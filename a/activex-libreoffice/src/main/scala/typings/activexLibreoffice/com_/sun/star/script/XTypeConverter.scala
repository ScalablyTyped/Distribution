package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to provide standard type conversions.
  * @see Converter
  */
trait XTypeConverter
  extends StObject
     with XInterface {
  
  /**
    * Converts the value `aFrom` to the specified type `xDestinationType` . Throws an {@link CannotConvertException} if the conversion failed.
    * @param aFrom source value
    * @param xDestinationType destination type
    * @returns converted value (any carrying value of type `xDestinationType`
    */
  def convertTo(aFrom: Any, xDestinationType: `type`): Any
  
  /**
    * Converts the value `aFrom` to the specified simple type `aDestinationType` . Throws an {@link CannotConvertException} if the conversion failed and an
    * {@link com.sun.star.lang.IllegalArgumentException} if the destination {@link com.sun.star.uno.TypeClass} is not simple, e.g. not long or byte.
    * @param aFrom source value
    * @param aDestinationType destination type class
    * @returns converted value (any carrying value of type `aDestinationType`
    */
  def convertToSimpleType(aFrom: Any, aDestinationType: TypeClass): Any
}
object XTypeConverter {
  
  inline def apply(
    acquire: () => Unit,
    convertTo: (Any, `type`) => Any,
    convertToSimpleType: (Any, TypeClass) => Any,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTypeConverter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertTo = js.Any.fromFunction2(convertTo), convertToSimpleType = js.Any.fromFunction2(convertToSimpleType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeConverter]
  }
  
  extension [Self <: XTypeConverter](x: Self) {
    
    inline def setConvertTo(value: (Any, `type`) => Any): Self = StObject.set(x, "convertTo", js.Any.fromFunction2(value))
    
    inline def setConvertToSimpleType(value: (Any, TypeClass) => Any): Self = StObject.set(x, "convertToSimpleType", js.Any.fromFunction2(value))
  }
}
