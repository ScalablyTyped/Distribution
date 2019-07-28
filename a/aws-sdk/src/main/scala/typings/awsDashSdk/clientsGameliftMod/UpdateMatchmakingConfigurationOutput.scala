package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMatchmakingConfigurationOutput extends js.Object {
  /**
    * Object that describes the updated matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
}

object UpdateMatchmakingConfigurationOutput {
  @scala.inline
  def apply(Configuration: MatchmakingConfiguration = null): UpdateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
  }
}

