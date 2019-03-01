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
  val HyphenationPositions: activexDashInteropLib.SafeArray[scala.Double]
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
  def getHyphenationPositions(): activexDashInteropLib.SafeArray[scala.Double]
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
    HyphenationPositions: activexDashInteropLib.SafeArray[scala.Double],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    PossibleHyphens: java.lang.String,
    Word: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getHyphenationPositions: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getPossibleHyphens: js.Function0[java.lang.String],
    getWord: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HyphenationPositions")(HyphenationPositions)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("PossibleHyphens")(PossibleHyphens)
    __obj.updateDynamic("Word")(Word)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getHyphenationPositions")(getHyphenationPositions)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getPossibleHyphens")(getPossibleHyphens)
    __obj.updateDynamic("getWord")(getWord)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPossibleHyphens]
  }
}

