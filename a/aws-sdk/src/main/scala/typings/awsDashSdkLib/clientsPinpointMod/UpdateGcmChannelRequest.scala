package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGcmChannelRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var GCMChannelRequest: awsDashSdkLib.clientsPinpointMod.GCMChannelRequest
}

object UpdateGcmChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, GCMChannelRequest = GCMChannelRequest)
  
    __obj.asInstanceOf[UpdateGcmChannelRequest]
  }
}

