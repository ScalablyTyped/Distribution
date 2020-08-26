package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubIncrement extends js.Object {
  /** should contain nothing for **auto** , or an integer value for an explicit interval count. */
  var IntervalCount: js.Any = js.native
  /** should contain nothing for **auto** , or a boolean value for an explicit setting. */
  var PostEquidistant: js.Any = js.native
}

object SubIncrement {
  @scala.inline
  def apply(IntervalCount: js.Any, PostEquidistant: js.Any): SubIncrement = {
    val __obj = js.Dynamic.literal(IntervalCount = IntervalCount.asInstanceOf[js.Any], PostEquidistant = PostEquidistant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubIncrement]
  }
  @scala.inline
  implicit class SubIncrementOps[Self <: SubIncrement] (val x: Self) extends AnyVal {
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
    def setIntervalCount(value: js.Any): Self = this.set("IntervalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostEquidistant(value: js.Any): Self = this.set("PostEquidistant", value.asInstanceOf[js.Any])
  }
  
}

