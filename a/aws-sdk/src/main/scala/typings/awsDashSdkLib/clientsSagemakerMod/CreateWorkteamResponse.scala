package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkteamResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
    */
  var WorkteamArn: js.UndefOr[WorkteamArn] = js.undefined
}

object CreateWorkteamResponse {
  @scala.inline
  def apply(WorkteamArn: WorkteamArn = null): CreateWorkteamResponse = {
    val __obj = js.Dynamic.literal()
    if (WorkteamArn != null) __obj.updateDynamic("WorkteamArn")(WorkteamArn)
    __obj.asInstanceOf[CreateWorkteamResponse]
  }
}

