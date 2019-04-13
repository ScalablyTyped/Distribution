package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInputSecurityGroupRequest extends js.Object {
  /**
    * The id of the Input Security Group to describe
    */
  var InputSecurityGroupId: __string
}

object DescribeInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: __string): DescribeInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId)
  
    __obj.asInstanceOf[DescribeInputSecurityGroupRequest]
  }
}

