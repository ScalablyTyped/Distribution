package typings.actionsDashOnDashGoogle.distAssistantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions extends js.Object {
  /** @public */
  var debug: js.UndefOr[Boolean] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOptions]
  }
}

