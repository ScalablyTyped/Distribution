package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XHyphenatedWord
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: scala.Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: java.lang.String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: scala.Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  val Word: java.lang.String
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): scala.Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): java.lang.String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): scala.Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  def getWord(): java.lang.String
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): scala.Boolean
}

object XHyphenatedWord {
  @scala.inline
  def apply(
    HyphenPos: scala.Double,
    HyphenatedWord: java.lang.String,
    HyphenationPos: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Word: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getHyphenPos: js.Function0[scala.Double],
    getHyphenatedWord: js.Function0[java.lang.String],
    getHyphenationPos: js.Function0[scala.Double],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getWord: js.Function0[java.lang.String],
    isAlternativeSpelling: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHyphenatedWord = {
    val __obj = js.Dynamic.literal(HyphenPos = HyphenPos, HyphenatedWord = HyphenatedWord, HyphenationPos = HyphenationPos, Locale = Locale, Word = Word, acquire = acquire, getHyphenPos = getHyphenPos, getHyphenatedWord = getHyphenatedWord, getHyphenationPos = getHyphenationPos, getLocale = getLocale, getWord = getWord, isAlternativeSpelling = isAlternativeSpelling, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XHyphenatedWord]
  }
}

