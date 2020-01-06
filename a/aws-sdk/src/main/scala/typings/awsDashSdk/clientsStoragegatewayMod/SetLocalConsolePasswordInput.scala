package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLocalConsolePasswordInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN = js.native
  /**
    * The password you want to set for your VM local console.
    */
  var LocalConsolePassword: typings.awsDashSdk.clientsStoragegatewayMod.LocalConsolePassword = js.native
}

object SetLocalConsolePasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, LocalConsolePassword: LocalConsolePassword): SetLocalConsolePasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], LocalConsolePassword = LocalConsolePassword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetLocalConsolePasswordInput]
  }
}

