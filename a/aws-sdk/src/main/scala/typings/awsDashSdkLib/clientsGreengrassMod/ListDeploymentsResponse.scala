package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentsResponse extends js.Object {
  /**
    * A list of deployments for the requested groups.
    */
  var Deployments: js.UndefOr[Deployments] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDeploymentsResponse {
  @scala.inline
  def apply(Deployments: Deployments = null, NextToken: __string = null): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Deployments != null) __obj.updateDynamic("Deployments")(Deployments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
}

