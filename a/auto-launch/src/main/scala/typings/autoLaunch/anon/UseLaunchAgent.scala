package typings.autoLaunch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseLaunchAgent extends js.Object {
  /**
    * By default, AppleScript is used to add a Login Item. If this is `true`, Launch Agent will be used to auto-launch your app. Defaults is `false`.
    */
  var useLaunchAgent: js.UndefOr[Boolean] = js.undefined
}

object UseLaunchAgent {
  @scala.inline
  def apply(useLaunchAgent: js.UndefOr[Boolean] = js.undefined): UseLaunchAgent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLaunchAgent)) __obj.updateDynamic("useLaunchAgent")(useLaunchAgent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLaunchAgent]
  }
}

