package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMatchmakingConfigurationInput extends js.Object {
  /**
    * Unique identifier for a matchmaking configuration
    */
  var Name: MatchmakingIdStringModel
}

object DeleteMatchmakingConfigurationInput {
  @scala.inline
  def apply(Name: MatchmakingIdStringModel): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
}

