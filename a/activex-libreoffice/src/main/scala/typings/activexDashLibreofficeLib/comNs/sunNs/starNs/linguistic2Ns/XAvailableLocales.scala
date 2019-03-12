package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** retrieves the list of available languages. */
trait XAvailableLocales
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieve the list of supported languages (Locales).
    * @param aServiceName the name of the service to get the list of available Locales for.
    * @returns the list of locales supported by the whole of all registered implementations of that service. The sequence will be empty if there is no such lang
    * @see com.sun.star.linguistic2.XSupportedLocales
    */
  def getAvailableLocales(aServiceName: java.lang.String): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
}

object XAvailableLocales {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getAvailableLocales: java.lang.String => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAvailableLocales]
  }
}

