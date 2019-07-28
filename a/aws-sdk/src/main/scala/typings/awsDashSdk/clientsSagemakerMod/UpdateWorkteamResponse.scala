package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkteamResponse extends js.Object {
  /**
    * A Workteam object that describes the updated work team.
    */
  var Workteam: typings.awsDashSdk.clientsSagemakerMod.Workteam
}

object UpdateWorkteamResponse {
  @scala.inline
  def apply(Workteam: Workteam): UpdateWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam)
  
    __obj.asInstanceOf[UpdateWorkteamResponse]
  }
}

