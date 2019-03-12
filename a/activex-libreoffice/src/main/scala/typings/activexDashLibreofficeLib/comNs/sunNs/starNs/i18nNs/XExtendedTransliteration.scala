package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides character conversions like case folding or Hiragana to Katakana.
  *
  * It is derived from {@link com.sun.star.i18n.XTransliteration} and provides additional functionality for character to character and string to string
  * without offset parameter transliteration. These should be used for performance reason if their full-blown counterparts aren't needed.
  * @since OOo 1.1.2
  */
trait XExtendedTransliteration extends XTransliteration {
  /**
    * Transliterate a character to a character.
    *
    * If the output contains multiple characters, for example when transliterating German sharp "s" (the one that looks like a Greek Beta) to upper case
    * "SS", {@link MultipleCharsOutputException} will be thrown, the caller must catch the exception and then call
    * XTransliteration::transliterateChar2String() to obtain the correct result.
    * @param cChar The input character.
    */
  def transliterateChar2Char(cChar: java.lang.String): java.lang.String
  /**
    * Transliterate a character to a string.
    * @param cChar The input character.
    */
  def transliterateChar2String(cChar: java.lang.String): java.lang.String
  /**
    * Transliterate a substring. The functionality is the same as {@link com.sun.star.i18n.XTransliteration.transliterate()} but omits the offset parameter
    * to improve performance.
    * @param aStr The input string.
    * @param nStartPos Start position within aStr from where transliteration starts.
    * @param nCount Number of code points to be transliterated.
    */
  def transliterateString2String(aStr: java.lang.String, nStartPos: scala.Double, nCount: scala.Double): java.lang.String
}

object XExtendedTransliteration {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Type: scala.Double,
    acquire: () => scala.Unit,
    compareString: (java.lang.String, java.lang.String) => scala.Double,
    compareSubstring: (java.lang.String, scala.Double, scala.Double, java.lang.String, scala.Double, scala.Double) => scala.Double,
    equals: (java.lang.String, scala.Double, scala.Double, js.Array[scala.Double], java.lang.String, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Boolean,
    folding: (java.lang.String, scala.Double, scala.Double, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => java.lang.String,
    getAvailableModules: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => stdLib.SafeArray[java.lang.String],
    getName: () => java.lang.String,
    getType: () => scala.Double,
    loadModule: (TransliterationModules, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    loadModuleByImplName: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    loadModuleNew: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TransliterationModulesNew], activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    loadModulesByImplNames: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    transliterate: (java.lang.String, scala.Double, scala.Double, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => java.lang.String,
    transliterateChar2Char: java.lang.String => java.lang.String,
    transliterateChar2String: java.lang.String => java.lang.String,
    transliterateRange: (java.lang.String, java.lang.String) => stdLib.SafeArray[java.lang.String],
    transliterateString2String: (java.lang.String, scala.Double, scala.Double) => java.lang.String
  ): XExtendedTransliteration = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), equals = js.Any.fromFunction8(equals), folding = js.Any.fromFunction4(folding), getAvailableModules = js.Any.fromFunction2(getAvailableModules), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), loadModule = js.Any.fromFunction2(loadModule), loadModuleByImplName = js.Any.fromFunction2(loadModuleByImplName), loadModuleNew = js.Any.fromFunction2(loadModuleNew), loadModulesByImplNames = js.Any.fromFunction2(loadModulesByImplNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transliterate = js.Any.fromFunction4(transliterate), transliterateChar2Char = js.Any.fromFunction1(transliterateChar2Char), transliterateChar2String = js.Any.fromFunction1(transliterateChar2String), transliterateRange = js.Any.fromFunction2(transliterateRange), transliterateString2String = js.Any.fromFunction3(transliterateString2String))
  
    __obj.asInstanceOf[XExtendedTransliteration]
  }
}

