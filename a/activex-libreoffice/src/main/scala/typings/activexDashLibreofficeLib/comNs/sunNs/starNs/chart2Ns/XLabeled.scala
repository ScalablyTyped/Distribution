package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLabeled extends js.Object {
  var Label: XTitle
  var LabelAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  var Offset: stdLib.SafeArray[scala.Double]
  var OwnAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  def getLabel(): XTitle
  def getLabelAnchor(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  def getOffset(): stdLib.SafeArray[scala.Double]
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
    Offset: stdLib.SafeArray[scala.Double],
    OwnAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    getLabel: () => XTitle,
    getLabelAnchor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    getOffset: () => stdLib.SafeArray[scala.Double],
    getOwnAnchor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    setLabel: XTitle => scala.Unit,
    setLabelAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint => scala.Unit,
    setOffset: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    setOwnAnchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint => scala.Unit
  ): XLabeled = {
    val __obj = js.Dynamic.literal(Label = Label, LabelAnchor = LabelAnchor, Offset = Offset, OwnAnchor = OwnAnchor, getLabel = js.Any.fromFunction0(getLabel), getLabelAnchor = js.Any.fromFunction0(getLabelAnchor), getOffset = js.Any.fromFunction0(getOffset), getOwnAnchor = js.Any.fromFunction0(getOwnAnchor), setLabel = js.Any.fromFunction1(setLabel), setLabelAnchor = js.Any.fromFunction1(setLabelAnchor), setOffset = js.Any.fromFunction1(setOffset), setOwnAnchor = js.Any.fromFunction1(setOwnAnchor))
  
    __obj.asInstanceOf[XLabeled]
  }
}

