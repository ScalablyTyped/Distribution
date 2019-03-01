package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives access to the results of failed spell checking attempts and may provide spelling alternatives.
  *
  * This is used by the {@link com.sun.star.linguistic2.XSpellChecker.spell()} function when the word was not found to be correct. Suggestions for other
  * words to be used may be provided along with a failure-type that may specify why the word was not correct.
  * @see com.sun.star.linguistic2.SpellFailure
  */
trait XSpellAlternatives
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the sequence of suggested spelling alternatives. */
  val Alternatives: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns the number of suggested spelling alternatives available. */
  val AlternativesCount: scala.Double
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  val FailureType: scala.Double
  /** @returns the Locale which specifies the language of the misspelled word. */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was misspelled. */
  val Word: java.lang.String
  /** @returns the sequence of suggested spelling alternatives. */
  def getAlternatives(): activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns the number of suggested spelling alternatives available. */
  def getAlternativesCount(): scala.Double
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  def getFailureType(): scala.Double
  /** @returns the Locale which specifies the language of the misspelled word. */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the word that was misspelled. */
  def getWord(): java.lang.String
}

object XSpellAlternatives {
  @scala.inline
  def apply(
    Alternatives: activexDashInteropLib.SafeArray[java.lang.String],
    AlternativesCount: scala.Double,
    FailureType: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Word: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAlternatives: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getAlternativesCount: js.Function0[scala.Double],
    getFailureType: js.Function0[scala.Double],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getWord: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSpellAlternatives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alternatives")(Alternatives)
    __obj.updateDynamic("AlternativesCount")(AlternativesCount)
    __obj.updateDynamic("FailureType")(FailureType)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Word")(Word)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAlternatives")(getAlternatives)
    __obj.updateDynamic("getAlternativesCount")(getAlternativesCount)
    __obj.updateDynamic("getFailureType")(getFailureType)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getWord")(getWord)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSpellAlternatives]
  }
}

