package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set a {@link Locale} to be used by the object. */
trait XLocalizable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the locale, which is used by this object. */
  var Locale: Locale
  /** @returns the locale, which is used by this object. */
  def getLocale(): Locale
  /** sets the locale to be used by this object. */
  def setLocale(eLocale: Locale): scala.Unit
}

object XLocalizable {
  @scala.inline
  def apply(
    Locale: Locale,
    acquire: js.Function0[scala.Unit],
    getLocale: js.Function0[Locale],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLocale: js.Function1[Locale, scala.Unit]
  ): XLocalizable = {
    val __obj = js.Dynamic.literal(Locale = Locale, acquire = acquire, getLocale = getLocale, queryInterface = queryInterface, release = release, setLocale = setLocale)
  
    __obj.asInstanceOf[XLocalizable]
  }
}

