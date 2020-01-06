package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsResponse extends js.Object {
  var ApplicationSettingsResource: typings.awsDashSdk.clientsPinpointMod.ApplicationSettingsResource = js.native
}

object UpdateApplicationSettingsResponse {
  @scala.inline
  def apply(ApplicationSettingsResource: ApplicationSettingsResource): UpdateApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApplicationSettingsResponse]
  }
}

