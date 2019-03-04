package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers thesaurus functionality. */
trait Thesaurus
  extends XThesaurus
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceDisplayName

object Thesaurus {
  @scala.inline
  def apply(
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getServiceDisplayName: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    hasLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryMeanings: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      activexDashInteropLib.SafeArray[XMeaning]
    ],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): Thesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = acquire, addEventListener = addEventListener, dispose = dispose, getLocales = getLocales, getServiceDisplayName = getServiceDisplayName, hasLocale = hasLocale, initialize = initialize, queryInterface = queryInterface, queryMeanings = queryMeanings, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[Thesaurus]
  }
}

