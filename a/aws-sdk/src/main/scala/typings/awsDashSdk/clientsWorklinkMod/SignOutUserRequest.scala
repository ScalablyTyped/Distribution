package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOutUserRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
  /**
    * The name of the user.
    */
  var Username: typings.awsDashSdk.clientsWorklinkMod.Username
}

object SignOutUserRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, Username: Username): SignOutUserRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn, Username = Username)
  
    __obj.asInstanceOf[SignOutUserRequest]
  }
}

