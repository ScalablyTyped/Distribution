package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBaiduChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var BaiduChannelRequest: awsDashSdkLib.clientsPinpointMod.BaiduChannelRequest
}

object UpdateBaiduChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, BaiduChannelRequest: BaiduChannelRequest): UpdateBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, BaiduChannelRequest = BaiduChannelRequest)
  
    __obj.asInstanceOf[UpdateBaiduChannelRequest]
  }
}

