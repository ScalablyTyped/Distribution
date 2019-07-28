package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XHyphenatedWord extends XInterface {
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  val Word: String
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): Double
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): String
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): Double
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was hyphenated. */
  def getWord(): String
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): Boolean
}

object XHyphenatedWord {
  @scala.inline
  def apply(
    HyphenPos: Double,
    HyphenatedWord: String,
    HyphenationPos: Double,
    Locale: Locale,
    Word: String,
    acquire: () => Unit,
    getHyphenPos: () => Double,
    getHyphenatedWord: () => String,
    getHyphenationPos: () => Double,
    getLocale: () => Locale,
    getWord: () => String,
    isAlternativeSpelling: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHyphenatedWord = {
    val __obj = js.Dynamic.literal(HyphenPos = HyphenPos, HyphenatedWord = HyphenatedWord, HyphenationPos = HyphenationPos, Locale = Locale, Word = Word, acquire = js.Any.fromFunction0(acquire), getHyphenPos = js.Any.fromFunction0(getHyphenPos), getHyphenatedWord = js.Any.fromFunction0(getHyphenatedWord), getHyphenationPos = js.Any.fromFunction0(getHyphenationPos), getLocale = js.Any.fromFunction0(getLocale), getWord = js.Any.fromFunction0(getWord), isAlternativeSpelling = js.Any.fromFunction0(isAlternativeSpelling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHyphenatedWord]
  }
}

