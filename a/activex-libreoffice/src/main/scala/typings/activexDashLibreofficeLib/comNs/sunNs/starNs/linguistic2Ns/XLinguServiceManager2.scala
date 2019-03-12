package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link LinguServiceManager} service to implement.
  * @since LibreOffice 4.0
  */
trait XLinguServiceManager2
  extends XLinguServiceManager
     with XAvailableLocales
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object XLinguServiceManager2 {
  @scala.inline
  def apply(
    Hyphenator: XHyphenator,
    SpellChecker: XSpellChecker,
    Thesaurus: XThesaurus,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addLinguServiceManagerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Boolean,
    dispose: () => scala.Unit,
    getAvailableLocales: java.lang.String => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getAvailableServices: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => stdLib.SafeArray[java.lang.String],
    getConfiguredServices: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => stdLib.SafeArray[java.lang.String],
    getHyphenator: () => XHyphenator,
    getSpellChecker: () => XSpellChecker,
    getThesaurus: () => XThesaurus,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeLinguServiceManagerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Boolean,
    setConfiguredServices: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => scala.Unit
  ): XLinguServiceManager2 = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator, SpellChecker = SpellChecker, Thesaurus = Thesaurus, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addLinguServiceManagerListener = js.Any.fromFunction1(addLinguServiceManagerListener), dispose = js.Any.fromFunction0(dispose), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), getAvailableServices = js.Any.fromFunction2(getAvailableServices), getConfiguredServices = js.Any.fromFunction2(getConfiguredServices), getHyphenator = js.Any.fromFunction0(getHyphenator), getSpellChecker = js.Any.fromFunction0(getSpellChecker), getThesaurus = js.Any.fromFunction0(getThesaurus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeLinguServiceManagerListener = js.Any.fromFunction1(removeLinguServiceManagerListener), setConfiguredServices = js.Any.fromFunction3(setConfiguredServices))
  
    __obj.asInstanceOf[XLinguServiceManager2]
  }
}

