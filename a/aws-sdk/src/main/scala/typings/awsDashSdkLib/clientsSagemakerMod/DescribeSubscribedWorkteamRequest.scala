package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubscribedWorkteamRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the subscribed work team to describe.
    */
  var WorkteamArn: awsDashSdkLib.clientsSagemakerMod.WorkteamArn
}

object DescribeSubscribedWorkteamRequest {
  @scala.inline
  def apply(WorkteamArn: WorkteamArn): DescribeSubscribedWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn)
  
    __obj.asInstanceOf[DescribeSubscribedWorkteamRequest]
  }
}

