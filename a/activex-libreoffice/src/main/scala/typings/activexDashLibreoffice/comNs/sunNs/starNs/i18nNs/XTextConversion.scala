package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Method to convert text from one type to another
  * @since OOo 1.1.2
  */
trait XTextConversion extends XInterface {
  /**
    * Method to search dictionaries for the conversion candidate, if there are multiple candidates, it will return first one. This is for the conversion in
    * non-interactive mode.
    * @param aText Text string to be converted.
    * @param nStartPos The start position in aText for the conversion
    * @param nLength The length of the portion in aText for the conversion
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns Converted text
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def getConversion(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    Locale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double
  ): String
  /**
    * Method to search dictionaries for the conversion candidates.
    * @param aText Text string to be converted.
    * @param nStartPos The start position in aText for the conversion
    * @param nLength The length of the portion in aText for the conversion
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns {@link TextConversionResult}
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def getConversions(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    Locale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double
  ): TextConversionResult
  /**
    * Method to query if the conversion type should be interactive or non-interactive mode.
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns `TRUE` if the entry is a valid entry for the dictionary `FALSE` otherwise.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def interactiveConversion(Locale: Locale, nTextConversionType: Double, nTextConversionOptions: Double): Boolean
}

object XTextConversion {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getConversion: (String, Double, Double, Locale, Double, Double) => String,
    getConversions: (String, Double, Double, Locale, Double, Double) => TextConversionResult,
    interactiveConversion: (Locale, Double, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getConversion = js.Any.fromFunction6(getConversion), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextConversion]
  }
}

