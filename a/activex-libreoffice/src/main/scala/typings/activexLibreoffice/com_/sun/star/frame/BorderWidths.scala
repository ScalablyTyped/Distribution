package typings.activexLibreoffice.com_.sun.star.frame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a border area by offsets from each side. */
@js.native
trait BorderWidths extends js.Object {
  /** specifies the offset from bottom border. */
  var Bottom: Double = js.native
  /** specifies the offset from left border. */
  var Left: Double = js.native
  /** specifies the offset from right border. */
  var Right: Double = js.native
  /** specifies the offset from top border. */
  var Top: Double = js.native
}

object BorderWidths {
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): BorderWidths = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidths]
  }
  @scala.inline
  implicit class BorderWidthsOps[Self <: BorderWidths] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("Bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("Right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
  }
  
}

