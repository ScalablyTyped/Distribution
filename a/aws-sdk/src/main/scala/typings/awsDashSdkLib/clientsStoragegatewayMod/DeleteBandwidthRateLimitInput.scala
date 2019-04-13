package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBandwidthRateLimitInput extends js.Object {
  /**
    * One of the BandwidthType values that indicates the gateway bandwidth rate limit to delete. Valid Values: Upload, Download, All.
    */
  var BandwidthType: awsDashSdkLib.clientsStoragegatewayMod.BandwidthType
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
}

object DeleteBandwidthRateLimitInput {
  @scala.inline
  def apply(BandwidthType: BandwidthType, GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(BandwidthType = BandwidthType, GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
  }
}

