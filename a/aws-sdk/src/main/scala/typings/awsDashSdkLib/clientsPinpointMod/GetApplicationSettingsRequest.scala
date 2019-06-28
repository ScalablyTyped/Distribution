package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationSettingsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
}

object GetApplicationSettingsRequest {
  @scala.inline
  def apply(ApplicationId: __string): GetApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[GetApplicationSettingsRequest]
  }
}

