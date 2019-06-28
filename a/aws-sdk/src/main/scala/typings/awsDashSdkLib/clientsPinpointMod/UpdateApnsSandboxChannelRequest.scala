package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsSandboxChannelRequest extends js.Object {
  var APNSSandboxChannelRequest: awsDashSdkLib.clientsPinpointMod.APNSSandboxChannelRequest
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object UpdateApnsSandboxChannelRequest {
  @scala.inline
  def apply(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: __string): UpdateApnsSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
  }
}

