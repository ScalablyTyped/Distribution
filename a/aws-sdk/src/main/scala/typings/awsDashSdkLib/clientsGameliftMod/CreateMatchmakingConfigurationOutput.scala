package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMatchmakingConfigurationOutput extends js.Object {
  /**
    * Object that describes the newly created matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
}

object CreateMatchmakingConfigurationOutput {
  @scala.inline
  def apply(Configuration: MatchmakingConfiguration = null): CreateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
  }
}

