package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSupportedLanguages
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Languages: activexDashInteropLib.SafeArray[scala.Double]
  def getLanguages(): activexDashInteropLib.SafeArray[scala.Double]
  def hasLanguage(nLanguage: scala.Double): scala.Boolean
}

object XSupportedLanguages {
  @scala.inline
  def apply(
    Languages: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getLanguages: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    hasLanguage: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSupportedLanguages = {
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = acquire, getLanguages = getLanguages, hasLanguage = hasLanguage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSupportedLanguages]
  }
}

