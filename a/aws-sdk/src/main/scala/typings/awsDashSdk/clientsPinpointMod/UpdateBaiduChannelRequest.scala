package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBaiduChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  var BaiduChannelRequest: typings.awsDashSdk.clientsPinpointMod.BaiduChannelRequest = js.native
}

object UpdateBaiduChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, BaiduChannelRequest: BaiduChannelRequest): UpdateBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBaiduChannelRequest]
  }
}

