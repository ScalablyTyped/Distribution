package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSMBGuestPasswordInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN = js.native
  /**
    * The password that you want to set for your SMB Server.
    */
  var Password: SMBGuestPassword = js.native
}

object SetSMBGuestPasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
}

