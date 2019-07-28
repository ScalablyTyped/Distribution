package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a border area by offsets from each side. */
trait BorderWidths extends js.Object {
  /** specifies the offset from bottom border. */
  var Bottom: Double
  /** specifies the offset from left border. */
  var Left: Double
  /** specifies the offset from right border. */
  var Right: Double
  /** specifies the offset from top border. */
  var Top: Double
}

object BorderWidths {
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): BorderWidths = {
    val __obj = js.Dynamic.literal(Bottom = Bottom, Left = Left, Right = Right, Top = Top)
  
    __obj.asInstanceOf[BorderWidths]
  }
}

