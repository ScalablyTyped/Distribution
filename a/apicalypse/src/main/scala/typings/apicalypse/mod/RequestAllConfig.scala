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
  def apply(concurrency: Int | Double = null, delay: Int | Double = null): RequestAllConfig = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAllConfig]
  }
}

