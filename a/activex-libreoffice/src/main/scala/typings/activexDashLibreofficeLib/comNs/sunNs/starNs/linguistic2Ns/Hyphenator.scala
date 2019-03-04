package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers hyphenation functionality. */
trait Hyphenator
  extends XHyphenator
     with XLinguServiceEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XServiceDisplayName

object Hyphenator {
  @scala.inline
  def apply(
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addLinguServiceEventListener: js.Function1[XLinguServiceEventListener, scala.Boolean],
    createPossibleHyphens: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XPossibleHyphens
    ],
    dispose: js.Function0[scala.Unit],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getServiceDisplayName: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    hasLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean],
    hyphenate: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XHyphenatedWord
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryAlternativeSpelling: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XHyphenatedWord
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeLinguServiceEventListener: js.Function1[XLinguServiceEventListener, scala.Boolean]
  ): Hyphenator = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = acquire, addEventListener = addEventListener, addLinguServiceEventListener = addLinguServiceEventListener, createPossibleHyphens = createPossibleHyphens, dispose = dispose, getLocales = getLocales, getServiceDisplayName = getServiceDisplayName, hasLocale = hasLocale, hyphenate = hyphenate, initialize = initialize, queryAlternativeSpelling = queryAlternativeSpelling, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeLinguServiceEventListener = removeLinguServiceEventListener)
  
    __obj.asInstanceOf[Hyphenator]
  }
}

