package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods to convert between strings of ASCII Arabic digits and native numeral strings.
  * @since OOo 1.1.2
  */
trait XNativeNumberSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Convert XML attributes to a NatNum value.
    * @returns One of {@link NativeNumberMode}
    */
  def convertFromXmlAttributes(aAttr: NativeNumberXmlAttributes): scala.Double
  /**
    * Convert a specific NatNum/Locale combination to attributes used in the XML file format.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def convertToXmlAttributes(
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nNativeNumberMode: scala.Double
  ): NativeNumberXmlAttributes
  /**
    * Returns native number string for given number string.
    * @param aNumberString The input string.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def getNativeNumberString(
    aNumberString: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nNativeNumberMode: scala.Double
  ): java.lang.String
  /**
    * Check if the NatNum is valid for the given locale.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def isValidNatNum(
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nNativeNumberMode: scala.Double
  ): scala.Boolean
}

object XNativeNumberSupplier {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    convertFromXmlAttributes: NativeNumberXmlAttributes => scala.Double,
    convertToXmlAttributes: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => NativeNumberXmlAttributes,
    getNativeNumberString: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => java.lang.String,
    isValidNatNum: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNativeNumberSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertFromXmlAttributes = js.Any.fromFunction1(convertFromXmlAttributes), convertToXmlAttributes = js.Any.fromFunction2(convertToXmlAttributes), getNativeNumberString = js.Any.fromFunction3(getNativeNumberString), isValidNatNum = js.Any.fromFunction2(isValidNatNum), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNativeNumberSupplier]
  }
}

