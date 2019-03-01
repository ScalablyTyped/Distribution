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
    acquire: js.Function0[scala.Unit],
    createWithModel: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs.XModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      scala.Unit
    ],
    getLibxml2ExtensionHandle: js.Function0[Libxml2ExtensionHandle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPathExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Libxml2ExtensionHandle")(Libxml2ExtensionHandle)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createWithModel")(createWithModel)
    __obj.updateDynamic("getLibxml2ExtensionHandle")(getLibxml2ExtensionHandle)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPathExtension]
  }
}

