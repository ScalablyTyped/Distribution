package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubIncrement extends js.Object {
  /** should contain nothing for **auto** , or an integer value for an explicit interval count. */
  var IntervalCount: js.Any
  /** should contain nothing for **auto** , or a boolean value for an explicit setting. */
  var PostEquidistant: js.Any
}

object SubIncrement {
  @scala.inline
  def apply(IntervalCount: js.Any, PostEquidistant: js.Any): SubIncrement = {
    val __obj = js.Dynamic.literal(IntervalCount = IntervalCount.asInstanceOf[js.Any], PostEquidistant = PostEquidistant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubIncrement]
  }
}

