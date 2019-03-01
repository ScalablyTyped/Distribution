package typings
package antdLib.libBadgeScrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollNumberState extends js.Object {
  var animateStarted: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
}

object ScrollNumberState {
  @scala.inline
  def apply(
    animateStarted: js.UndefOr[scala.Boolean] = js.undefined,
    count: java.lang.String | scala.Double = null
  ): ScrollNumberState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateStarted)) __obj.updateDynamic("animateStarted")(animateStarted)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollNumberState]
  }
}

