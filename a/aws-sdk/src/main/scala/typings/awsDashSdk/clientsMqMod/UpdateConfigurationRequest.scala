package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: __string = js.native
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[__string] = js.native
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[__string] = js.native
}

object UpdateConfigurationRequest {
  @scala.inline
  def apply(ConfigurationId: __string, Data: __string = null, Description: __string = null): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
}

