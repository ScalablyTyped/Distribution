package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApnsChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object DeleteApnsChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string): DeleteApnsChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[DeleteApnsChannelRequest]
  }
}

