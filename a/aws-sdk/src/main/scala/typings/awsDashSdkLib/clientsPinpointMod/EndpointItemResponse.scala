package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointItemResponse extends js.Object {
  /**
    * A custom message associated with the registration of an endpoint when issuing a response.
    */
  var Message: js.UndefOr[__string] = js.undefined
  /**
    * The status code associated with the merging of an endpoint when issuing a response.
    */
  var StatusCode: js.UndefOr[__integer] = js.undefined
}

object EndpointItemResponse {
  @scala.inline
  def apply(Message: __string = null, StatusCode: js.UndefOr[__integer] = js.undefined): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    __obj.asInstanceOf[EndpointItemResponse]
  }
}

