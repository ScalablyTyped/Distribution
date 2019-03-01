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
    acquire: js.Function0[scala.Unit],
    compareString: js.Function2[java.lang.String, java.lang.String, scala.Double],
    compareSubstring: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ],
    equals: js.Function8[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[scala.Double], 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[scala.Double], 
      scala.Boolean
    ],
    folding: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      java.lang.String
    ],
    getAvailableModules: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    loadModule: js.Function2[
      TransliterationModules, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModuleByImplName: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModuleNew: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TransliterationModulesNew], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModulesByImplNames: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    transliterate: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      java.lang.String
    ],
    transliterateChar2Char: js.Function1[java.lang.String, java.lang.String],
    transliterateChar2String: js.Function1[java.lang.String, java.lang.String],
    transliterateRange: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    transliterateString2String: js.Function3[java.lang.String, scala.Double, scala.Double, java.lang.String]
  ): XExtendedTransliteration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compareString")(compareString)
    __obj.updateDynamic("compareSubstring")(compareSubstring)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("folding")(folding)
    __obj.updateDynamic("getAvailableModules")(getAvailableModules)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("loadModule")(loadModule)
    __obj.updateDynamic("loadModuleByImplName")(loadModuleByImplName)
    __obj.updateDynamic("loadModuleNew")(loadModuleNew)
    __obj.updateDynamic("loadModulesByImplNames")(loadModulesByImplNames)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("transliterate")(transliterate)
    __obj.updateDynamic("transliterateChar2Char")(transliterateChar2Char)
    __obj.updateDynamic("transliterateChar2String")(transliterateChar2String)
    __obj.updateDynamic("transliterateRange")(transliterateRange)
    __obj.updateDynamic("transliterateString2String")(transliterateString2String)
    __obj.asInstanceOf[XExtendedTransliteration]
  }
}

