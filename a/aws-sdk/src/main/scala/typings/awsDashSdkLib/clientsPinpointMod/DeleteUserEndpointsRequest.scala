package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserEndpointsRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the user.
    */
  var UserId: __string
}

object DeleteUserEndpointsRequest {
  @scala.inline
  def apply(ApplicationId: __string, UserId: __string): DeleteUserEndpointsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, UserId = UserId)
  
    __obj.asInstanceOf[DeleteUserEndpointsRequest]
  }
}

