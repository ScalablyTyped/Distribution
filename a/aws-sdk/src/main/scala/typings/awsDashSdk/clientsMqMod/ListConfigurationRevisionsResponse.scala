package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integer] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The list of all revisions for the specified configuration.
    */
  var Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
}

object ListConfigurationRevisionsResponse {
  @scala.inline
  def apply(
    ConfigurationId: __string = null,
    MaxResults: js.UndefOr[__integer] = js.undefined,
    NextToken: __string = null,
    Revisions: __listOfConfigurationRevision = null
  ): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationId != null) __obj.updateDynamic("ConfigurationId")(ConfigurationId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions)
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
}

