package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationRevisionsRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: __string
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMqMod.MaxResults] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListConfigurationRevisionsRequest {
  @scala.inline
  def apply(ConfigurationId: __string, MaxResults: Int | Double = null, NextToken: __string = null): ListConfigurationRevisionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConfigurationRevisionsRequest]
  }
}

