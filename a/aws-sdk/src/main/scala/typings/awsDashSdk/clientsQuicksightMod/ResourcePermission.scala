package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePermission extends js.Object {
  /**
    * The action to grant or revoke permissions on, for example "quicksight:DescribeDashboard".
    */
  var Actions: ActionList = js.native
  /**
    * The Amazon Resource Name (ARN) of an Amazon QuickSight user or group, or an IAM ARN. If you are using cross-account resource sharing, this is the IAM ARN of an account root. Otherwise, it is the ARN of a QuickSight user or group. .
    */
  var Principal: typings.awsDashSdk.clientsQuicksightMod.Principal = js.native
}

object ResourcePermission {
  @scala.inline
  def apply(Actions: ActionList, Principal: Principal): ResourcePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourcePermission]
  }
}

