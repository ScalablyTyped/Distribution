package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserIdentityInfoRequest extends js.Object {
  /**
    * A UserIdentityInfo object.
    */
  var IdentityInfo: UserIdentityInfo
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: awsDashSdkLib.clientsConnectMod.InstanceId
  /**
    * The identifier for the user account to update identity information for.
    */
  var UserId: awsDashSdkLib.clientsConnectMod.UserId
}

object UpdateUserIdentityInfoRequest {
  @scala.inline
  def apply(IdentityInfo: UserIdentityInfo, InstanceId: InstanceId, UserId: UserId): UpdateUserIdentityInfoRequest = {
    val __obj = js.Dynamic.literal(IdentityInfo = IdentityInfo, InstanceId = InstanceId, UserId = UserId)
  
    __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
  }
}

