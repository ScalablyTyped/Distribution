package typings.apicalypse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAllConfig extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object RequestAllConfig {
  @scala.inline
  def apply(concurrency: js.UndefOr[Double] = js.undefined, delay: js.UndefOr[Double] = js.undefined): RequestAllConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAllConfig]
  }
}

