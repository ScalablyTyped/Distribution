package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a border area by offsets from each side. */
trait BorderWidths extends js.Object {
  /** specifies the offset from bottom border. */
  var Bottom: scala.Double
  /** specifies the offset from left border. */
  var Left: scala.Double
  /** specifies the offset from right border. */
  var Right: scala.Double
  /** specifies the offset from top border. */
  var Top: scala.Double
}

object BorderWidths {
  @scala.inline
  def apply(Bottom: scala.Double, Left: scala.Double, Right: scala.Double, Top: scala.Double): BorderWidths = {
    val __obj = js.Dynamic.literal(Bottom = Bottom, Left = Left, Right = Right, Top = Top)
  
    __obj.asInstanceOf[BorderWidths]
  }
}

