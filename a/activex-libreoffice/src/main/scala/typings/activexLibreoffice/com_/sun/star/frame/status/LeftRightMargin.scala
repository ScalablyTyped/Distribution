package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a left and right margin.
  * @since OOo 2.0
  */
@js.native
trait LeftRightMargin extends js.Object {
  /** specifies a left side margin in 1/100th mm. */
  var Left: Double = js.native
  /** specifies a right side margin in 1/100th mm. */
  var Right: Double = js.native
}

object LeftRightMargin {
  @scala.inline
  def apply(Left: Double, Right: Double): LeftRightMargin = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRightMargin]
  }
  @scala.inline
  implicit class LeftRightMarginOps[Self <: LeftRightMargin] (val x: Self) extends AnyVal {
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
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("Right", value.asInstanceOf[js.Any])
  }
  
}

