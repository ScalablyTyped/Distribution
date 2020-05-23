package typings.authmosphere.mockOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptions extends js.Object {
  var times: js.UndefOr[Double] = js.undefined
  var url: String
}

object MockOptions {
  @scala.inline
  def apply(url: String, times: js.UndefOr[Double] = js.undefined): MockOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptions]
  }
}

