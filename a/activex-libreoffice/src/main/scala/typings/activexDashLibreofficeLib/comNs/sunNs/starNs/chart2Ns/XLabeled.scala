package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLabeled extends js.Object {
  var Label: XTitle
  var LabelAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  var Offset: activexDashInteropLib.SafeArray[scala.Double]
  var OwnAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  def getLabel(): XTitle
  def getLabelAnchor(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  def getOffset(): activexDashInteropLib.SafeArray[scala.Double]
  def getOwnAnchor(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  def setLabel(xTitle: XTitle): scala.Unit
  def setLabelAnchor(aAnchorPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint): scala.Unit
  def setOffset(aOffsetVector: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  def setOwnAnchor(aAnchorPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint): scala.Unit
}

object XLabeled {
  @scala.inline
  def apply(
    Label: XTitle,
    LabelAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    Offset: activexDashInteropLib.SafeArray[scala.Double],
    OwnAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    getLabel: js.Function0[XTitle],
    getLabelAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint],
    getOffset: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getOwnAnchor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint],
    setLabel: js.Function1[XTitle, scala.Unit],
    setLabelAnchor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint, scala.Unit],
    setOffset: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setOwnAnchor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint, scala.Unit]
  ): XLabeled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("LabelAnchor")(LabelAnchor)
    __obj.updateDynamic("Offset")(Offset)
    __obj.updateDynamic("OwnAnchor")(OwnAnchor)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getLabelAnchor")(getLabelAnchor)
    __obj.updateDynamic("getOffset")(getOffset)
    __obj.updateDynamic("getOwnAnchor")(getOwnAnchor)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setLabelAnchor")(setLabelAnchor)
    __obj.updateDynamic("setOffset")(setOffset)
    __obj.updateDynamic("setOwnAnchor")(setOwnAnchor)
    __obj.asInstanceOf[XLabeled]
  }
}

