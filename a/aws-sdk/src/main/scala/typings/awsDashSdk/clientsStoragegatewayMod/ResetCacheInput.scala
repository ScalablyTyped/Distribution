package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetCacheInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object ResetCacheInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): ResetCacheInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[ResetCacheInput]
  }
}

