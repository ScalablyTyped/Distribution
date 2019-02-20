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

