package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an upper and lower margin.
  * @since OOo 2.0
  */
@js.native
trait UpperLowerMargin extends js.Object {
  /** specifies a lower margin in 1/100th mm. */
  var Lower: Double = js.native
  /** specifies a upper margin in 1/100th mm. */
  var Upper: Double = js.native
}

object UpperLowerMargin {
  @scala.inline
  def apply(Lower: Double, Upper: Double): UpperLowerMargin = {
    val __obj = js.Dynamic.literal(Lower = Lower.asInstanceOf[js.Any], Upper = Upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpperLowerMargin]
  }
  @scala.inline
  implicit class UpperLowerMarginOps[Self <: UpperLowerMargin] (val x: Self) extends AnyVal {
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
    def setLower(value: Double): Self = this.set("Lower", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpper(value: Double): Self = this.set("Upper", value.asInstanceOf[js.Any])
  }
  
}

