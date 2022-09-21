package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an enum type. */
trait XEnumTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  val DefaultEnumValue: Double
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  val EnumNames: SafeArray[String]
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: SafeArray[Double]
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): Double
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): SafeArray[String]
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): SafeArray[Double]
}
object XEnumTypeDescription {
  
  inline def apply(
    DefaultEnumValue: Double,
    EnumNames: SafeArray[String],
    EnumValues: SafeArray[Double],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultEnumValue: () => Double,
    getEnumNames: () => SafeArray[String],
    getEnumValues: () => SafeArray[Double],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue.asInstanceOf[js.Any], EnumNames = EnumNames.asInstanceOf[js.Any], EnumValues = EnumValues.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultEnumValue = js.Any.fromFunction0(getDefaultEnumValue), getEnumNames = js.Any.fromFunction0(getEnumNames), getEnumValues = js.Any.fromFunction0(getEnumValues), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnumTypeDescription]
  }
  
  extension [Self <: XEnumTypeDescription](x: Self) {
    
    inline def setDefaultEnumValue(value: Double): Self = StObject.set(x, "DefaultEnumValue", value.asInstanceOf[js.Any])
    
    inline def setEnumNames(value: SafeArray[String]): Self = StObject.set(x, "EnumNames", value.asInstanceOf[js.Any])
    
    inline def setEnumValues(value: SafeArray[Double]): Self = StObject.set(x, "EnumValues", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultEnumValue(value: () => Double): Self = StObject.set(x, "getDefaultEnumValue", js.Any.fromFunction0(value))
    
    inline def setGetEnumNames(value: () => SafeArray[String]): Self = StObject.set(x, "getEnumNames", js.Any.fromFunction0(value))
    
    inline def setGetEnumValues(value: () => SafeArray[Double]): Self = StObject.set(x, "getEnumValues", js.Any.fromFunction0(value))
  }
}
