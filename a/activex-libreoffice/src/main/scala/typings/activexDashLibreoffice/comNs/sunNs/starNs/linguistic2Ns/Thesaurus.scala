package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XServiceDisplayName
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers thesaurus functionality. */
trait Thesaurus
  extends XThesaurus
     with XInitialization
     with XComponent
     with XServiceDisplayName

object Thesaurus {
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getLocales: () => SafeArray[Locale],
    getServiceDisplayName: Locale => String,
    hasLocale: Locale => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    queryMeanings: (String, Locale, PropertyValues) => SafeArray[XMeaning],
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): Thesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getLocales = js.Any.fromFunction0(getLocales), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), hasLocale = js.Any.fromFunction1(hasLocale), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), queryMeanings = js.Any.fromFunction3(queryMeanings), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[Thesaurus]
  }
}

