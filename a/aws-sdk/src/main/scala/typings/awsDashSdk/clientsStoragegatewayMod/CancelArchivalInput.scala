package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelArchivalInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel archiving for.
    */
  var TapeARN: typings.awsDashSdk.clientsStoragegatewayMod.TapeARN
}

object CancelArchivalInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelArchivalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, TapeARN = TapeARN)
  
    __obj.asInstanceOf[CancelArchivalInput]
  }
}

