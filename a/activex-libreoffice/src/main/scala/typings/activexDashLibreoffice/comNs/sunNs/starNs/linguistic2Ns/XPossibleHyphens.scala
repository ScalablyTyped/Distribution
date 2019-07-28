package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives information about a word's possible hyphenation points.
  *
  * Example: In German pre-spelling-reform you may have the following: getWord: Dampfschiffahrt getPossibleHyphens: Dampf=schiff=fahrt
  * getOrigHyphensPositions: 4, 9 That is "Dampfschiffahrt" can be hyphenated after the "pf" (4) and between the double "ff" (9). And if you are going to
  * hyphenate it at position 9 you will get an additional "f" before the hyphen character.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XPossibleHyphens extends XInterface {
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  val HyphenationPositions: SafeArray[Double]
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  val PossibleHyphens: String
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  val Word: String
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  def getHyphenationPositions(): SafeArray[Double]
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  def getPossibleHyphens(): String
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  def getWord(): String
}

object XPossibleHyphens {
  @scala.inline
  def apply(
    HyphenationPositions: SafeArray[Double],
    Locale: Locale,
    PossibleHyphens: String,
    Word: String,
    acquire: () => Unit,
    getHyphenationPositions: () => SafeArray[Double],
    getLocale: () => Locale,
    getPossibleHyphens: () => String,
    getWord: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal(HyphenationPositions = HyphenationPositions, Locale = Locale, PossibleHyphens = PossibleHyphens, Word = Word, acquire = js.Any.fromFunction0(acquire), getHyphenationPositions = js.Any.fromFunction0(getHyphenationPositions), getLocale = js.Any.fromFunction0(getLocale), getPossibleHyphens = js.Any.fromFunction0(getPossibleHyphens), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPossibleHyphens]
  }
}

