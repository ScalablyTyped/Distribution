package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Methods to convert between strings of ASCII Arabic digits and native numeral strings.
  * @since OOo 1.1.2
  */
trait XNativeNumberSupplier
  extends StObject
     with XInterface {
  
  /**
    * Convert XML attributes to a NatNum value.
    * @returns One of {@link NativeNumberMode}
    */
  def convertFromXmlAttributes(aAttr: NativeNumberXmlAttributes): Double
  
  /**
    * Convert a specific NatNum/Locale combination to attributes used in the XML file format.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def convertToXmlAttributes(aLocale: Locale, nNativeNumberMode: Double): NativeNumberXmlAttributes
  
  /**
    * Returns native number string for given number string.
    * @param aNumberString The input string.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def getNativeNumberString(aNumberString: String, aLocale: Locale, nNativeNumberMode: Double): String
  
  /**
    * Check if the NatNum is valid for the given locale.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def isValidNatNum(aLocale: Locale, nNativeNumberMode: Double): Boolean
}
object XNativeNumberSupplier {
  
  inline def apply(
    acquire: () => Unit,
    convertFromXmlAttributes: NativeNumberXmlAttributes => Double,
    convertToXmlAttributes: (Locale, Double) => NativeNumberXmlAttributes,
    getNativeNumberString: (String, Locale, Double) => String,
    isValidNatNum: (Locale, Double) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XNativeNumberSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertFromXmlAttributes = js.Any.fromFunction1(convertFromXmlAttributes), convertToXmlAttributes = js.Any.fromFunction2(convertToXmlAttributes), getNativeNumberString = js.Any.fromFunction3(getNativeNumberString), isValidNatNum = js.Any.fromFunction2(isValidNatNum), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNativeNumberSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XNativeNumberSupplier] (val x: Self) extends AnyVal {
    
    inline def setConvertFromXmlAttributes(value: NativeNumberXmlAttributes => Double): Self = StObject.set(x, "convertFromXmlAttributes", js.Any.fromFunction1(value))
    
    inline def setConvertToXmlAttributes(value: (Locale, Double) => NativeNumberXmlAttributes): Self = StObject.set(x, "convertToXmlAttributes", js.Any.fromFunction2(value))
    
    inline def setGetNativeNumberString(value: (String, Locale, Double) => String): Self = StObject.set(x, "getNativeNumberString", js.Any.fromFunction3(value))
    
    inline def setIsValidNatNum(value: (Locale, Double) => Boolean): Self = StObject.set(x, "isValidNatNum", js.Any.fromFunction2(value))
  }
}
