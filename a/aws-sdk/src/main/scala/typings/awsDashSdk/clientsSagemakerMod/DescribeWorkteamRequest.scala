package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkteamRequest extends js.Object {
  /**
    * The name of the work team to return a description of.
    */
  var WorkteamName: typings.awsDashSdk.clientsSagemakerMod.WorkteamName = js.native
}

object DescribeWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): DescribeWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeWorkteamRequest]
  }
}

