package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveTapeRecoveryPointInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which you want to retrieve the recovery point.
    */
  var TapeARN: typings.awsDashSdk.clientsStoragegatewayMod.TapeARN
}

object RetrieveTapeRecoveryPointInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): RetrieveTapeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, TapeARN = TapeARN)
  
    __obj.asInstanceOf[RetrieveTapeRecoveryPointInput]
  }
}

