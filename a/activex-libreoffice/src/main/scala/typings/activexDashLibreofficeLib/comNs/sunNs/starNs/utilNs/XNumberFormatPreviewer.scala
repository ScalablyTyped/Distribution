package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a number formatter which can preview number formats without inserting them.
  * @see NumberFormatter
  */
trait XNumberFormatPreviewer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * formats a value using a format string, without inserting a number format into the list.
    * @param aFormat is the format string that is used for formatting.
    * @param fValue is the value that is formatted.
    * @param nLocale is the locale that is used to interpret the format string.
    * @param bAllowEnglish specifies if English language number format strings are accepted in addition to those from the selected locale.
    * @returns the formatted string.
    * @throws com::sun::star::util::MalformedNumberFormatException if the format string is invalid.
    */
  def convertNumberToPreviewString(
    aFormat: java.lang.String,
    fValue: scala.Double,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bAllowEnglish: scala.Boolean
  ): java.lang.String
  /**
    * returns the color which is to be used for a number.
    * @param aFormat is the format string that is used for formatting.
    * @param fValue is the value that is formatted.
    * @param nLocale is the locale that is used to interpret the format string.
    * @param bAllowEnglish specifies if English language number format strings are accepted in addition to those from the selected locale.
    * @param aDefaultColor is the color that should be returned if no color is set by the number format.
    * @returns the color that should used to output the formatted string.
    * @throws com::sun::star::util::MalformedNumberFormatException if the format string is invalid.
    */
  def queryPreviewColorForNumber(
    aFormat: java.lang.String,
    fValue: scala.Double,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bAllowEnglish: scala.Boolean,
    aDefaultColor: Color
  ): Color
}

object XNumberFormatPreviewer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    convertNumberToPreviewString: js.Function4[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryPreviewColorForNumber: js.Function5[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      Color, 
      Color
    ],
    release: js.Function0[scala.Unit]
  ): XNumberFormatPreviewer = {
    val __obj = js.Dynamic.literal(acquire = acquire, convertNumberToPreviewString = convertNumberToPreviewString, queryInterface = queryInterface, queryPreviewColorForNumber = queryPreviewColorForNumber, release = release)
  
    __obj.asInstanceOf[XNumberFormatPreviewer]
  }
}

