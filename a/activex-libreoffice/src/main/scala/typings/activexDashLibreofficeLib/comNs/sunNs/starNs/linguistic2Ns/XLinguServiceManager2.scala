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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Hyphenator")(Hyphenator)
    __obj.updateDynamic("SpellChecker")(SpellChecker)
    __obj.updateDynamic("Thesaurus")(Thesaurus)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addLinguServiceManagerListener")(addLinguServiceManagerListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAvailableLocales")(getAvailableLocales)
    __obj.updateDynamic("getAvailableServices")(getAvailableServices)
    __obj.updateDynamic("getConfiguredServices")(getConfiguredServices)
    __obj.updateDynamic("getHyphenator")(getHyphenator)
    __obj.updateDynamic("getSpellChecker")(getSpellChecker)
    __obj.updateDynamic("getThesaurus")(getThesaurus)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeLinguServiceManagerListener")(removeLinguServiceManagerListener)
    __obj.updateDynamic("setConfiguredServices")(setConfiguredServices)
    __obj.asInstanceOf[XLinguServiceManager2]
  }
}

