package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGatewayInformationInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object DescribeGatewayInformationInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[DescribeGatewayInformationInput]
  }
}

