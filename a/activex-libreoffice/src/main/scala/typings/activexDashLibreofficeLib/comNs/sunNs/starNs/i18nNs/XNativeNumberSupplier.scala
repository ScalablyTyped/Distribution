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
    acquire: js.Function0[scala.Unit],
    convertFromXmlAttributes: js.Function1[NativeNumberXmlAttributes, scala.Double],
    convertToXmlAttributes: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      NativeNumberXmlAttributes
    ],
    getNativeNumberString: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      java.lang.String
    ],
    isValidNatNum: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNativeNumberSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, convertFromXmlAttributes = convertFromXmlAttributes, convertToXmlAttributes = convertToXmlAttributes, getNativeNumberString = getNativeNumberString, isValidNatNum = isValidNatNum, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNativeNumberSupplier]
  }
}

