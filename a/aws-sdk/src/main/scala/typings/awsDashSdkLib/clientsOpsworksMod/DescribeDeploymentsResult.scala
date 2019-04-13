package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeploymentsResult extends js.Object {
  /**
    * An array of Deployment objects that describe the deployments.
    */
  var Deployments: js.UndefOr[Deployments] = js.undefined
}

object DescribeDeploymentsResult {
  @scala.inline
  def apply(Deployments: Deployments = null): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    if (Deployments != null) __obj.updateDynamic("Deployments")(Deployments)
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
}

