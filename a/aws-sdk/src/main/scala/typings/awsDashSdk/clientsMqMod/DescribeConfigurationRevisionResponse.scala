package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRevisionResponse extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[__string] = js.undefined
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[__string] = js.undefined
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[__string] = js.undefined
}

object DescribeConfigurationRevisionResponse {
  @scala.inline
  def apply(
    ConfigurationId: __string = null,
    Created: __timestampIso8601 = null,
    Data: __string = null,
    Description: __string = null
  ): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationId != null) __obj.updateDynamic("ConfigurationId")(ConfigurationId)
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
}

