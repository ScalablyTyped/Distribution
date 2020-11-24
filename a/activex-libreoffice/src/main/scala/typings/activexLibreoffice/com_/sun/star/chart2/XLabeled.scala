package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.drawing.RectanglePoint
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLabeled extends js.Object {
  
  var Label: XTitle = js.native
  
  var LabelAnchor: RectanglePoint = js.native
  
  var Offset: SafeArray[Double] = js.native
  
  var OwnAnchor: RectanglePoint = js.native
  
  def getLabel(): XTitle = js.native
  
  def getLabelAnchor(): RectanglePoint = js.native
  
  def getOffset(): SafeArray[Double] = js.native
  
  def getOwnAnchor(): RectanglePoint = js.native
  
  def setLabel(xTitle: XTitle): Unit = js.native
  
  def setLabelAnchor(aAnchorPoint: RectanglePoint): Unit = js.native
  
  def setOffset(aOffsetVector: SeqEquiv[Double]): Unit = js.native
  
  def setOwnAnchor(aAnchorPoint: RectanglePoint): Unit = js.native
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
  
  @scala.inline
  implicit class XLabeledOps[Self <: XLabeled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabel(value: XTitle): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAnchor(value: RectanglePoint): Self = this.set("LabelAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: SafeArray[Double]): Self = this.set("Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnAnchor(value: RectanglePoint): Self = this.set("OwnAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabel(value: () => XTitle): Self = this.set("getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelAnchor(value: () => RectanglePoint): Self = this.set("getLabelAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => SafeArray[Double]): Self = this.set("getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnAnchor(value: () => RectanglePoint): Self = this.set("getOwnAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLabel(value: XTitle => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelAnchor(value: RectanglePoint => Unit): Self = this.set("setLabelAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: SeqEquiv[Double] => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOwnAnchor(value: RectanglePoint => Unit): Self = this.set("setOwnAnchor", js.Any.fromFunction1(value))
  }
}
