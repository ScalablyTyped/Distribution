package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkteamRequest extends js.Object {
  /**
    * The name of the work team to delete.
    */
  var WorkteamName: awsDashSdkLib.clientsSagemakerMod.WorkteamName
}

object DeleteWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): DeleteWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName)
  
    __obj.asInstanceOf[DeleteWorkteamRequest]
  }
}

