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

