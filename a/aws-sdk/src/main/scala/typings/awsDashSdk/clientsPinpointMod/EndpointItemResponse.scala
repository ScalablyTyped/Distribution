package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointItemResponse extends js.Object {
  /**
    * The custom message that's returned in the response as a result of processing the endpoint data.
    */
  var Message: js.UndefOr[__string] = js.undefined
  /**
    * The status code that's returned in the response as a result of processing the endpoint data.
    */
  var StatusCode: js.UndefOr[__integer] = js.undefined
}

object EndpointItemResponse {
  @scala.inline
  def apply(Message: __string = null, StatusCode: Int | Double = null): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointItemResponse]
  }
}

