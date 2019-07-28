package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
  /**
    * A list of the individual group deployments in the bulk deployment operation.
    */
  var Deployments: js.UndefOr[BulkDeploymentResults] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListBulkDeploymentDetailedReportsResponse {
  @scala.inline
  def apply(Deployments: BulkDeploymentResults = null, NextToken: __string = null): ListBulkDeploymentDetailedReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (Deployments != null) __obj.updateDynamic("Deployments")(Deployments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
  }
}

