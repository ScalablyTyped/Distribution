package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** retrieves the list of available languages. */
trait XAvailableLocales extends XInterface {
  /**
    * retrieve the list of supported languages (Locales).
    * @param aServiceName the name of the service to get the list of available Locales for.
    * @returns the list of locales supported by the whole of all registered implementations of that service. The sequence will be empty if there is no such lang
    * @see com.sun.star.linguistic2.XSupportedLocales
    */
  def getAvailableLocales(aServiceName: String): SafeArray[Locale]
}

object XAvailableLocales {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAvailableLocales: String => SafeArray[Locale],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAvailableLocales]
  }
}

