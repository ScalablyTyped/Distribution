package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a number formatter which can preview number formats without inserting them.
  * @see NumberFormatter
  */
trait XNumberFormatPreviewer
  extends StObject
     with XInterface {
  
  /**
    * formats a value using a format string, without inserting a number format into the list.
    * @param aFormat is the format string that is used for formatting.
    * @param fValue is the value that is formatted.
    * @param nLocale is the locale that is used to interpret the format string.
    * @param bAllowEnglish specifies if English language number format strings are accepted in addition to those from the selected locale.
    * @returns the formatted string.
    * @throws com::sun::star::util::MalformedNumberFormatException if the format string is invalid.
    */
  def convertNumberToPreviewString(aFormat: String, fValue: Double, nLocale: Locale, bAllowEnglish: Boolean): String
  
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
  def queryPreviewColorForNumber(aFormat: String, fValue: Double, nLocale: Locale, bAllowEnglish: Boolean, aDefaultColor: Color): Color
}
object XNumberFormatPreviewer {
  
  inline def apply(
    acquire: () => Unit,
    convertNumberToPreviewString: (String, Double, Locale, Boolean) => String,
    queryInterface: `type` => js.Any,
    queryPreviewColorForNumber: (String, Double, Locale, Boolean, Color) => Color,
    release: () => Unit
  ): XNumberFormatPreviewer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertNumberToPreviewString = js.Any.fromFunction4(convertNumberToPreviewString), queryInterface = js.Any.fromFunction1(queryInterface), queryPreviewColorForNumber = js.Any.fromFunction5(queryPreviewColorForNumber), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatPreviewer]
  }
  
  extension [Self <: XNumberFormatPreviewer](x: Self) {
    
    inline def setConvertNumberToPreviewString(value: (String, Double, Locale, Boolean) => String): Self = StObject.set(x, "convertNumberToPreviewString", js.Any.fromFunction4(value))
    
    inline def setQueryPreviewColorForNumber(value: (String, Double, Locale, Boolean, Color) => Color): Self = StObject.set(x, "queryPreviewColorForNumber", js.Any.fromFunction5(value))
  }
}
