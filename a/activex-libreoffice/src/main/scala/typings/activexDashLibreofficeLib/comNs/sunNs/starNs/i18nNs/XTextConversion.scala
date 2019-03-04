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
    acquire: js.Function0[scala.Unit],
    getConversion: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      scala.Double, 
      java.lang.String
    ],
    getConversions: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      scala.Double, 
      TextConversionResult
    ],
    interactiveConversion: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      scala.Double, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextConversion = {
    val __obj = js.Dynamic.literal(acquire = acquire, getConversion = getConversion, getConversions = getConversions, interactiveConversion = interactiveConversion, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextConversion]
  }
}

