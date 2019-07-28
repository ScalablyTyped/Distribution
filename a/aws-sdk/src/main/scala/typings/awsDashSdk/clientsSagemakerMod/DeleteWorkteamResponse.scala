package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkteamResponse extends js.Object {
  /**
    * Returns true if the work team was successfully deleted; otherwise, returns false.
    */
  var Success: typings.awsDashSdk.clientsSagemakerMod.Success
}

object DeleteWorkteamResponse {
  @scala.inline
  def apply(Success: Success): DeleteWorkteamResponse = {
    val __obj = js.Dynamic.literal(Success = Success)
  
    __obj.asInstanceOf[DeleteWorkteamResponse]
  }
}

