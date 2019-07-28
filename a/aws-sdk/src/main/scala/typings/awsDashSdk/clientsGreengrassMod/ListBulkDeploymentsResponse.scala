package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBulkDeploymentsResponse extends js.Object {
  /**
    * A list of bulk deployments.
    */
  var BulkDeployments: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.BulkDeployments] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListBulkDeploymentsResponse {
  @scala.inline
  def apply(BulkDeployments: BulkDeployments = null, NextToken: __string = null): ListBulkDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkDeployments != null) __obj.updateDynamic("BulkDeployments")(BulkDeployments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBulkDeploymentsResponse]
  }
}

