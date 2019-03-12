package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Method to convert text from one type to another
  * @since OOo 1.1.2
  */
trait XTextConversion
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    aText: java.lang.String,
    nStartPos: scala.Double,
    nLength: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nTextConversionType: scala.Double,
    nTextConversionOptions: scala.Double
  ): java.lang.String
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
    aText: java.lang.String,
    nStartPos: scala.Double,
    nLength: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nTextConversionType: scala.Double,
    nTextConversionOptions: scala.Double
  ): TextConversionResult
  /**
    * Method to query if the conversion type should be interactive or non-interactive mode.
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns `TRUE` if the entry is a valid entry for the dictionary `FALSE` otherwise.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def interactiveConversion(
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nTextConversionType: scala.Double,
    nTextConversionOptions: scala.Double
  ): scala.Boolean
}

object XTextConversion {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getConversion: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => java.lang.String,
    getConversions: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => TextConversionResult,
    interactiveConversion: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTextConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getConversion = js.Any.fromFunction6(getConversion), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextConversion]
  }
}

