package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set a {@link Locale} to be used by the object. */
trait XLocalizable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the locale, which is used by this object. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** @returns the locale, which is used by this object. */
  def getLocale(): Locale
  /** sets the locale to be used by this object. */
  def setLocale(eLocale: Locale): scala.Unit
}

object XLocalizable {
  @scala.inline
  def apply(
    Locale: Locale,
    acquire: () => scala.Unit,
    getLocale: () => Locale,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setLocale: Locale => scala.Unit
  ): XLocalizable = {
    val __obj = js.Dynamic.literal(Locale = Locale, acquire = js.Any.fromFunction0(acquire), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLocale = js.Any.fromFunction1(setLocale))
  
    __obj.asInstanceOf[XLocalizable]
  }
}

