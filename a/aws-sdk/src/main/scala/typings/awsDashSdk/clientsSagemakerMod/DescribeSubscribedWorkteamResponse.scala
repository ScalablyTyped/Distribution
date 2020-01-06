package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribedWorkteamResponse extends js.Object {
  /**
    * A Workteam instance that contains information about the work team.
    */
  var SubscribedWorkteam: typings.awsDashSdk.clientsSagemakerMod.SubscribedWorkteam = js.native
}

object DescribeSubscribedWorkteamResponse {
  @scala.inline
  def apply(SubscribedWorkteam: SubscribedWorkteam): DescribeSubscribedWorkteamResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteam = SubscribedWorkteam.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSubscribedWorkteamResponse]
  }
}

