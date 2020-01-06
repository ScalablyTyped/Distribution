package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationsResponse extends js.Object {
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[__listOfConfiguration] = js.native
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integer] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(
    Configurations: __listOfConfiguration = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null
  ): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

