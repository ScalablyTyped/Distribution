package typings.antd.esBadgeScrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollNumberState extends js.Object {
  var animateStarted: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[String | Double | Null] = js.undefined
}

object ScrollNumberState {
  @scala.inline
  def apply(animateStarted: js.UndefOr[Boolean] = js.undefined, count: String | Double = null): ScrollNumberState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateStarted)) __obj.updateDynamic("animateStarted")(animateStarted.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollNumberState]
  }
}

