package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathExtension
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Libxml2ExtensionHandle: Libxml2ExtensionHandle
  def getLibxml2ExtensionHandle(): Libxml2ExtensionHandle
}

object XXPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: js.Function0[scala.Unit],
    getLibxml2ExtensionHandle: js.Function0[Libxml2ExtensionHandle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XXPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle, acquire = acquire, getLibxml2ExtensionHandle = getLibxml2ExtensionHandle, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XXPathExtension]
  }
}

