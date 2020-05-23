package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Before extends js.Object {
  var after: js.UndefOr[Double] = js.undefined
  var before: js.UndefOr[Double] = js.undefined
  var between: js.UndefOr[Double] = js.undefined
  var dtmf: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object Before {
  @scala.inline
  def apply(
    after: js.UndefOr[Double] = js.undefined,
    before: js.UndefOr[Double] = js.undefined,
    between: js.UndefOr[Double] = js.undefined,
    dtmf: String = null,
    duration: js.UndefOr[Double] = js.undefined
  ): Before = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.get.asInstanceOf[js.Any])
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.get.asInstanceOf[js.Any])
    if (!js.isUndefined(between)) __obj.updateDynamic("between")(between.get.asInstanceOf[js.Any])
    if (dtmf != null) __obj.updateDynamic("dtmf")(dtmf.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
}

