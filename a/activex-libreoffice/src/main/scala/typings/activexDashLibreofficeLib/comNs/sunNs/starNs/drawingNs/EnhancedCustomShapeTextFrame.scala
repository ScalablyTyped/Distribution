package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BottomRight")(BottomRight)
    __obj.updateDynamic("TopLeft")(TopLeft)
    __obj.asInstanceOf[EnhancedCustomShapeTextFrame]
  }
}

