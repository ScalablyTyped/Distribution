package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAdmChannelRequest extends js.Object {
  var ADMChannelRequest: awsDashSdkLib.clientsPinpointMod.ADMChannelRequest
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object UpdateAdmChannelRequest {
  @scala.inline
  def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: __string): UpdateAdmChannelRequest = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest, ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[UpdateAdmChannelRequest]
  }
}

