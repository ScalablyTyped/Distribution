package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSMBGuestPasswordInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
    */
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
  /**
    * The password that you want to set for your SMB Server.
    */
  var Password: SMBGuestPassword
}

object SetSMBGuestPasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, Password = Password)
  
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
}

