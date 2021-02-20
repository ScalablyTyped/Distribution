package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API for proofreading a text
  * @since OOo 3.0.1
  */
@js.native
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
  ): ProofreadingResult = js.native
  
  /**
    * disables a specific rule for a given locale.
    *
    * If the locale is empty the rule should be ignored for all languages.
    */
  def ignoreRule(aRuleIdentifier: String, aLocale: Locale): Unit = js.native
  
  /**
    * whether is the text checked by the spell checker
    * @returns true if it is also a spell checker
    */
  def isSpellChecker(): Boolean = js.native
  
  /** sets all rules back to their default settings. */
  def resetIgnoreRules(): Unit = js.native
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
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), doProofreading = js.Any.fromFunction6(doProofreading), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), ignoreRule = js.Any.fromFunction2(ignoreRule), isSpellChecker = js.Any.fromFunction0(isSpellChecker), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetIgnoreRules = js.Any.fromFunction0(resetIgnoreRules))
    __obj.asInstanceOf[XProofreader]
  }
  
  @scala.inline
  implicit class XProofreaderMutableBuilder[Self <: XProofreader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoProofreading(value: (String, String, Locale, Double, Double, SeqEquiv[PropertyValue]) => ProofreadingResult): Self = StObject.set(x, "doProofreading", js.Any.fromFunction6(value))
    
    @scala.inline
    def setIgnoreRule(value: (String, Locale) => Unit): Self = StObject.set(x, "ignoreRule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsSpellChecker(value: () => Boolean): Self = StObject.set(x, "isSpellChecker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetIgnoreRules(value: () => Unit): Self = StObject.set(x, "resetIgnoreRules", js.Any.fromFunction0(value))
  }
}
