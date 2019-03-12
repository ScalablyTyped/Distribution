package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
trait XPossibleHyphens
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  val HyphenationPositions: stdLib.SafeArray[scala.Double]
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  val PossibleHyphens: java.lang.String
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  val Word: java.lang.String
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  def getHyphenationPositions(): stdLib.SafeArray[scala.Double]
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  def getPossibleHyphens(): java.lang.String
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  def getWord(): java.lang.String
}

object XPossibleHyphens {
  @scala.inline
  def apply(
    HyphenationPositions: stdLib.SafeArray[scala.Double],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    PossibleHyphens: java.lang.String,
    Word: java.lang.String,
    acquire: () => scala.Unit,
    getHyphenationPositions: () => stdLib.SafeArray[scala.Double],
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getPossibleHyphens: () => java.lang.String,
    getWord: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal(HyphenationPositions = HyphenationPositions, Locale = Locale, PossibleHyphens = PossibleHyphens, Word = Word, acquire = js.Any.fromFunction0(acquire), getHyphenationPositions = js.Any.fromFunction0(getHyphenationPositions), getLocale = js.Any.fromFunction0(getLocale), getPossibleHyphens = js.Any.fromFunction0(getPossibleHyphens), getWord = js.Any.fromFunction0(getWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPossibleHyphens]
  }
}

