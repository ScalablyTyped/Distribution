package typings
package atAngularCommonLib.srcLocationLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopStateEvent extends js.Object {
  var pop: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PopStateEvent {
  @scala.inline
  def apply(
    pop: js.UndefOr[scala.Boolean] = js.undefined,
    state: js.Any = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): PopStateEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pop)) __obj.updateDynamic("pop")(pop)
    if (state != null) __obj.updateDynamic("state")(state)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PopStateEvent]
  }
}

