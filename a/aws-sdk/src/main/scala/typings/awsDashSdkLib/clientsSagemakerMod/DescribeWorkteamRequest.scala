package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkteamRequest extends js.Object {
  /**
    * The name of the work team to return a description of.
    */
  var WorkteamName: awsDashSdkLib.clientsSagemakerMod.WorkteamName
}

object DescribeWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): DescribeWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName)
  
    __obj.asInstanceOf[DescribeWorkteamRequest]
  }
}

