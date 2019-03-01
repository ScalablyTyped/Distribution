package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLDocumentWrapper} */
trait XMLDocumentWrapper
  extends XXMLDocumentWrapper
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLDocumentWrapper {
  @scala.inline
  def apply(
    CurrentElement: XXMLElementWrapper,
    acquire: js.Function0[scala.Unit],
    clearUselessData: js.Function3[
      XXMLElementWrapper, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XXMLElementWrapper], 
      XXMLElementWrapper, 
      scala.Unit
    ],
    collapse: js.Function1[XXMLElementWrapper, scala.Unit],
    generateSAXEvents: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      XXMLElementWrapper, 
      XXMLElementWrapper, 
      scala.Unit
    ],
    getCurrentElement: js.Function0[XXMLElementWrapper],
    getNodeName: js.Function1[XXMLElementWrapper, java.lang.String],
    getTree: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      scala.Unit
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isCurrent: js.Function1[XXMLElementWrapper, scala.Boolean],
    isCurrentElementEmpty: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rebuildIDLink: js.Function1[XXMLElementWrapper, scala.Unit],
    release: js.Function0[scala.Unit],
    removeCurrentElement: js.Function0[scala.Unit],
    setCurrentElement: js.Function1[XXMLElementWrapper, scala.Unit]
  ): XMLDocumentWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentElement")(CurrentElement)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clearUselessData")(clearUselessData)
    __obj.updateDynamic("collapse")(collapse)
    __obj.updateDynamic("generateSAXEvents")(generateSAXEvents)
    __obj.updateDynamic("getCurrentElement")(getCurrentElement)
    __obj.updateDynamic("getNodeName")(getNodeName)
    __obj.updateDynamic("getTree")(getTree)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isCurrent")(isCurrent)
    __obj.updateDynamic("isCurrentElementEmpty")(isCurrentElementEmpty)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rebuildIDLink")(rebuildIDLink)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeCurrentElement")(removeCurrentElement)
    __obj.updateDynamic("setCurrentElement")(setCurrentElement)
    __obj.asInstanceOf[XMLDocumentWrapper]
  }
}

