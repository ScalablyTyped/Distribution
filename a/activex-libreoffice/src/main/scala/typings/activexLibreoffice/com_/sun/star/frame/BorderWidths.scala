package typings.activexLibreoffice.com_.sun.star.frame

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
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidths]
  }
}

