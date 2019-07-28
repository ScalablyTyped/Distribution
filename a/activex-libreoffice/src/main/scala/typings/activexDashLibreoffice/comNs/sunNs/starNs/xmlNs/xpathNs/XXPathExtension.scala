package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.xpathNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathExtension extends XInterface {
  val Libxml2ExtensionHandle: typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.xpathNs.Libxml2ExtensionHandle
  def getLibxml2ExtensionHandle(): typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.xpathNs.Libxml2ExtensionHandle
}

object XXPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: () => Unit,
    getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle, acquire = js.Any.fromFunction0(acquire), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XXPathExtension]
  }
}

