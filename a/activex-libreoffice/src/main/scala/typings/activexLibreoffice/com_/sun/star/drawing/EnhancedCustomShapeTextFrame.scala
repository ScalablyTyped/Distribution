package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates used with EnhancedCustomShapes */
trait EnhancedCustomShapeTextFrame extends js.Object {
  var BottomRight: EnhancedCustomShapeParameterPair
  var TopLeft: EnhancedCustomShapeParameterPair
}

object EnhancedCustomShapeTextFrame {
  @scala.inline
  def apply(BottomRight: EnhancedCustomShapeParameterPair, TopLeft: EnhancedCustomShapeParameterPair): EnhancedCustomShapeTextFrame = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextFrame]
  }
}

