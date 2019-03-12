package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathExtension extends XXPathExtension {
  def createWithModel(
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.XModel,
    ContextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  ): scala.Unit
}

object XPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: () => scala.Unit,
    createWithModel: (activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.XModel, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode) => scala.Unit,
    getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle, acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction2(createWithModel), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPathExtension]
  }
}

