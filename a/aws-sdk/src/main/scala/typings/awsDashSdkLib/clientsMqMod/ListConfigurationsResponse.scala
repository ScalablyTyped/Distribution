package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationsResponse extends js.Object {
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[__listOfConfiguration] = js.undefined
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integer] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(
    Configurations: __listOfConfiguration = null,
    MaxResults: js.UndefOr[__integer] = js.undefined,
    NextToken: __string = null
  ): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

