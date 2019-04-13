package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: __string
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[__string] = js.undefined
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[__string] = js.undefined
}

object UpdateConfigurationRequest {
  @scala.inline
  def apply(ConfigurationId: __string, Data: __string = null, Description: __string = null): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
}

