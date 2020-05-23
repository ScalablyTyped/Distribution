package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
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
     with XComponent

object XLinguServiceManager2 {
  @scala.inline
  def apply(
    Hyphenator: XHyphenator,
    SpellChecker: XSpellChecker,
    Thesaurus: XThesaurus,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addLinguServiceManagerListener: XEventListener => Boolean,
    dispose: () => Unit,
    getAvailableLocales: String => SafeArray[Locale],
    getAvailableServices: (String, Locale) => SafeArray[String],
    getConfiguredServices: (String, Locale) => SafeArray[String],
    getHyphenator: () => XHyphenator,
    getSpellChecker: () => XSpellChecker,
    getThesaurus: () => XThesaurus,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeLinguServiceManagerListener: XEventListener => Boolean,
    setConfiguredServices: (String, Locale, SeqEquiv[String]) => Unit
  ): XLinguServiceManager2 = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator.asInstanceOf[js.Any], SpellChecker = SpellChecker.asInstanceOf[js.Any], Thesaurus = Thesaurus.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addLinguServiceManagerListener = js.Any.fromFunction1(addLinguServiceManagerListener), dispose = js.Any.fromFunction0(dispose), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), getAvailableServices = js.Any.fromFunction2(getAvailableServices), getConfiguredServices = js.Any.fromFunction2(getConfiguredServices), getHyphenator = js.Any.fromFunction0(getHyphenator), getSpellChecker = js.Any.fromFunction0(getSpellChecker), getThesaurus = js.Any.fromFunction0(getThesaurus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeLinguServiceManagerListener = js.Any.fromFunction1(removeLinguServiceManagerListener), setConfiguredServices = js.Any.fromFunction3(setConfiguredServices))
    __obj.asInstanceOf[XLinguServiceManager2]
  }
}

