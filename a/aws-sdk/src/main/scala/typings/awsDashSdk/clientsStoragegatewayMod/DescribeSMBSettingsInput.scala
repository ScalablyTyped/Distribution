package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSMBSettingsInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object DescribeSMBSettingsInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeSMBSettingsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[DescribeSMBSettingsInput]
  }
}

