package typings.autoDashLaunch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseLaunchAgent extends js.Object {
  /**
    * By default, AppleScript is used to add a Login Item. If this is `true`, Launch Agent will be used to auto-launch your app. Defaults is `false`.
    */
  var useLaunchAgent: js.UndefOr[Boolean] = js.undefined
}

object Anon_UseLaunchAgent {
  @scala.inline
  def apply(useLaunchAgent: js.UndefOr[Boolean] = js.undefined): Anon_UseLaunchAgent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLaunchAgent)) __obj.updateDynamic("useLaunchAgent")(useLaunchAgent)
    __obj.asInstanceOf[Anon_UseLaunchAgent]
  }
}

