package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates used with EnhancedCustomShapes */
@js.native
trait EnhancedCustomShapeTextFrame extends js.Object {
  var BottomRight: EnhancedCustomShapeParameterPair = js.native
  var TopLeft: EnhancedCustomShapeParameterPair = js.native
}

object EnhancedCustomShapeTextFrame {
  @scala.inline
  def apply(BottomRight: EnhancedCustomShapeParameterPair, TopLeft: EnhancedCustomShapeParameterPair): EnhancedCustomShapeTextFrame = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextFrame]
  }
  @scala.inline
  implicit class EnhancedCustomShapeTextFrameOps[Self <: EnhancedCustomShapeTextFrame] (val x: Self) extends AnyVal {
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
    def setBottomRight(value: EnhancedCustomShapeParameterPair): Self = this.set("BottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: EnhancedCustomShapeParameterPair): Self = this.set("TopLeft", value.asInstanceOf[js.Any])
  }
  
}

