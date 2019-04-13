package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkingStorageInput extends js.Object {
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
}

object DescribeWorkingStorageInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeWorkingStorageInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[DescribeWorkingStorageInput]
  }
}

