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

