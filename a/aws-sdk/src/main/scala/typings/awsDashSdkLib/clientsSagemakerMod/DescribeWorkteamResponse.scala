package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkteamResponse extends js.Object {
  /**
    * A Workteam instance that contains information about the work team. 
    */
  var Workteam: awsDashSdkLib.clientsSagemakerMod.Workteam
}

object DescribeWorkteamResponse {
  @scala.inline
  def apply(Workteam: Workteam): DescribeWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam)
  
    __obj.asInstanceOf[DescribeWorkteamResponse]
  }
}

