package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsChannelRequest extends js.Object {
  var APNSChannelRequest: awsDashSdkLib.clientsPinpointMod.APNSChannelRequest
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
}

object UpdateApnsChannelRequest {
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: __string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
}

