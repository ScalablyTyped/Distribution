package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserEndpointsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the user.
    */
  var UserId: __string
}

object GetUserEndpointsRequest {
  @scala.inline
  def apply(ApplicationId: __string, UserId: __string): GetUserEndpointsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, UserId = UserId)
  
    __obj.asInstanceOf[GetUserEndpointsRequest]
  }
}

