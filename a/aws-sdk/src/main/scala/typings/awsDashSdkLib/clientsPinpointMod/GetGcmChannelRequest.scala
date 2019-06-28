package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGcmChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object GetGcmChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string): GetGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[GetGcmChannelRequest]
  }
}

