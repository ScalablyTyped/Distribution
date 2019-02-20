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

