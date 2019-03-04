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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addLinguServiceManagerListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getAvailableLocales: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getAvailableServices: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getConfiguredServices: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getHyphenator: js.Function0[XHyphenator],
    getSpellChecker: js.Function0[XSpellChecker],
    getThesaurus: js.Function0[XThesaurus],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeLinguServiceManagerListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Boolean],
    setConfiguredServices: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ]
  ): XLinguServiceManager2 = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator, SpellChecker = SpellChecker, Thesaurus = Thesaurus, acquire = acquire, addEventListener = addEventListener, addLinguServiceManagerListener = addLinguServiceManagerListener, dispose = dispose, getAvailableLocales = getAvailableLocales, getAvailableServices = getAvailableServices, getConfiguredServices = getConfiguredServices, getHyphenator = getHyphenator, getSpellChecker = getSpellChecker, getThesaurus = getThesaurus, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeLinguServiceManagerListener = removeLinguServiceManagerListener, setConfiguredServices = setConfiguredServices)
  
    __obj.asInstanceOf[XLinguServiceManager2]
  }
}

