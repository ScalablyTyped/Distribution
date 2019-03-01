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
  def getAvailableLocales(aServiceName: java.lang.String): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
}

object XAvailableLocales {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getAvailableLocales: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAvailableLocales")(getAvailableLocales)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAvailableLocales]
  }
}

