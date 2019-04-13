package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBaiduChannelRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
}

object DeleteBaiduChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string): DeleteBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[DeleteBaiduChannelRequest]
  }
}

