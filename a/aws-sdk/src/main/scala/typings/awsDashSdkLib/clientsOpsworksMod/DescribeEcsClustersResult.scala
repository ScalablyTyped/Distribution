package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEcsClustersResult extends js.Object {
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[EcsClusters] = js.undefined
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEcsClustersResult {
  @scala.inline
  def apply(EcsClusters: EcsClusters = null, NextToken: String = null): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    if (EcsClusters != null) __obj.updateDynamic("EcsClusters")(EcsClusters)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
}

