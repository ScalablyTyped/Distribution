package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSupportedLanguages
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Languages: stdLib.SafeArray[scala.Double]
  def getLanguages(): stdLib.SafeArray[scala.Double]
  def hasLanguage(nLanguage: scala.Double): scala.Boolean
}

object XSupportedLanguages {
  @scala.inline
  def apply(
    Languages: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getLanguages: () => stdLib.SafeArray[scala.Double],
    hasLanguage: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSupportedLanguages = {
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSupportedLanguages]
  }
}

