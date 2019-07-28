package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.xpathNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xformsNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathExtension extends XXPathExtension {
  def createWithModel(Model: XModel, ContextNode: XNode): Unit
}

object XPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: () => Unit,
    createWithModel: (XModel, XNode) => Unit,
    getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle, acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction2(createWithModel), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPathExtension]
  }
}

