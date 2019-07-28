package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopStateEvent extends js.Object {
  var pop: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PopStateEvent {
  @scala.inline
  def apply(
    pop: js.UndefOr[Boolean] = js.undefined,
    state: js.Any = null,
    `type`: String = null,
    url: String = null
  ): PopStateEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pop)) __obj.updateDynamic("pop")(pop)
    if (state != null) __obj.updateDynamic("state")(state)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PopStateEvent]
  }
}

