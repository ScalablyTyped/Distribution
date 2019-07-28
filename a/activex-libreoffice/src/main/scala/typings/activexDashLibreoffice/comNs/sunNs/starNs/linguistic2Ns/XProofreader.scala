package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API for proofreading a text
  * @since OOo 3.0.1
  */
trait XProofreader extends XSupportedLocales {
  /**
    * start checking
    * @param aDocumentIdentifier the Document ID.
    * @param aText the flat text to be checked.
    * @param aLocale Language used in the text.
    * @param nStartOfSentencePosition Start Index of the text.
    * @param nSuggestedBehindEndOfSentencePosition Probable end position of the text.
    * @param aProperties additional properties of the text. Currently the following properties may be supported: {{table here, see documentation}}
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def doProofreading(
    aDocumentIdentifier: String,
    aText: String,
    aLocale: Locale,
    nStartOfSentencePosition: Double,
    nSuggestedBehindEndOfSentencePosition: Double,
    aProperties: SeqEquiv[PropertyValue]
  ): ProofreadingResult
  /**
    * disables a specific rule for a given locale.
    *
    * If the locale is empty the rule should be ignored for all languages.
    */
  def ignoreRule(aRuleIdentifier: String, aLocale: Locale): Unit
  /**
    * whether is the text checked by the spell checker
    * @returns true if it is also a spell checker
    */
  def isSpellChecker(): Boolean
  /** sets all rules back to their default settings. */
  def resetIgnoreRules(): Unit
}

object XProofreader {
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    doProofreading: (String, String, Locale, Double, Double, SeqEquiv[PropertyValue]) => ProofreadingResult,
    getLocales: () => SafeArray[Locale],
    hasLocale: Locale => Boolean,
    ignoreRule: (String, Locale) => Unit,
    isSpellChecker: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetIgnoreRules: () => Unit
  ): XProofreader = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), doProofreading = js.Any.fromFunction6(doProofreading), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), ignoreRule = js.Any.fromFunction2(ignoreRule), isSpellChecker = js.Any.fromFunction0(isSpellChecker), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules))
  
    __obj.asInstanceOf[XProofreader]
  }
}

