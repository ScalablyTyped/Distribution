package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLocalConsolePasswordInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The password you want to set for your VM local console.
    */
  var LocalConsolePassword: typings.awsDashSdk.clientsStoragegatewayMod.LocalConsolePassword
}

object SetLocalConsolePasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, LocalConsolePassword: LocalConsolePassword): SetLocalConsolePasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, LocalConsolePassword = LocalConsolePassword)
  
    __obj.asInstanceOf[SetLocalConsolePasswordInput]
  }
}

