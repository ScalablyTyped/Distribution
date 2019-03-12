package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
    aDocumentIdentifier: java.lang.String,
    aText: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nStartOfSentencePosition: scala.Double,
    nSuggestedBehindEndOfSentencePosition: scala.Double,
    aProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): ProofreadingResult
  /**
    * disables a specific rule for a given locale.
    *
    * If the locale is empty the rule should be ignored for all languages.
    */
  def ignoreRule(
    aRuleIdentifier: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Unit
  /**
    * whether is the text checked by the spell checker
    * @returns true if it is also a spell checker
    */
  def isSpellChecker(): scala.Boolean
  /** sets all rules back to their default settings. */
  def resetIgnoreRules(): scala.Unit
}

object XProofreader {
  @scala.inline
  def apply(
    Locales: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: () => scala.Unit,
    doProofreading: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => ProofreadingResult,
    getLocales: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    hasLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Boolean,
    ignoreRule: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    isSpellChecker: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resetIgnoreRules: () => scala.Unit
  ): XProofreader = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), doProofreading = js.Any.fromFunction6(doProofreading), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), ignoreRule = js.Any.fromFunction2(ignoreRule), isSpellChecker = js.Any.fromFunction0(isSpellChecker), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules))
  
    __obj.asInstanceOf[XProofreader]
  }
}

