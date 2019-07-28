package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersRequest extends js.Object {
  /**
    * The number of ClusterListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ClusterListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListClustersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[ListLimit] = js.undefined, NextToken: String = null): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClustersRequest]
  }
}

