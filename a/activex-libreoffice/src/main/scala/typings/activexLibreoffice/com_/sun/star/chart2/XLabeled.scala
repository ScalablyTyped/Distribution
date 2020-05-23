package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLabeled extends js.Object {
  var Label: XTitle
  var LabelAnchor: RectanglePoint
  var Offset: SafeArray[Double]
  var OwnAnchor: RectanglePoint
  def getLabel(): XTitle
  def getLabelAnchor(): RectanglePoint
  def getOffset(): SafeArray[Double]
  def getOwnAnchor(): RectanglePoint
  def setLabel(xTitle: XTitle): Unit
  def setLabelAnchor(aAnchorPoint: RectanglePoint): Unit
  def setOffset(aOffsetVector: SeqEquiv[Double]): Unit
  def setOwnAnchor(aAnchorPoint: RectanglePoint): Unit
}

object XLabeled {
  @scala.inline
  def apply(
    Label: XTitle,
    LabelAnchor: RectanglePoint,
    Offset: SafeArray[Double],
    OwnAnchor: RectanglePoint,
    getLabel: () => XTitle,
    getLabelAnchor: () => RectanglePoint,
    getOffset: () => SafeArray[Double],
    getOwnAnchor: () => RectanglePoint,
    setLabel: XTitle => Unit,
    setLabelAnchor: RectanglePoint => Unit,
    setOffset: SeqEquiv[Double] => Unit,
    setOwnAnchor: RectanglePoint => Unit
  ): XLabeled = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], LabelAnchor = LabelAnchor.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], OwnAnchor = OwnAnchor.asInstanceOf[js.Any], getLabel = js.Any.fromFunction0(getLabel), getLabelAnchor = js.Any.fromFunction0(getLabelAnchor), getOffset = js.Any.fromFunction0(getOffset), getOwnAnchor = js.Any.fromFunction0(getOwnAnchor), setLabel = js.Any.fromFunction1(setLabel), setLabelAnchor = js.Any.fromFunction1(setLabelAnchor), setOffset = js.Any.fromFunction1(setOffset), setOwnAnchor = js.Any.fromFunction1(setOwnAnchor))
    __obj.asInstanceOf[XLabeled]
  }
}

