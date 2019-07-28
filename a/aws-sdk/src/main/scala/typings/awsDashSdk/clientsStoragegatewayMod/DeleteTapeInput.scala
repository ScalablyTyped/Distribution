package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTapeInput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the ListGateways operation to return a list of gateways for your account and region.
    */
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete.
    */
  var TapeARN: typings.awsDashSdk.clientsStoragegatewayMod.TapeARN
}

object DeleteTapeInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): DeleteTapeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, TapeARN = TapeARN)
  
    __obj.asInstanceOf[DeleteTapeInput]
  }
}

