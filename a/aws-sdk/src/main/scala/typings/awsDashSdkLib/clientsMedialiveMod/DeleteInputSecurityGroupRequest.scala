package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInputSecurityGroupRequest extends js.Object {
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: __string
}

object DeleteInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: __string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId)
  
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
}

