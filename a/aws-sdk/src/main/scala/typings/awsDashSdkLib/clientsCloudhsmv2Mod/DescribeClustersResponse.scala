package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClustersResponse extends js.Object {
  /**
    * A list of clusters.
    */
  var Clusters: js.UndefOr[Clusters] = js.undefined
  /**
    * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a subsequent DescribeClusters request to get more clusters.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeClustersResponse {
  @scala.inline
  def apply(Clusters: Clusters = null, NextToken: NextToken = null): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (Clusters != null) __obj.updateDynamic("Clusters")(Clusters)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClustersResponse]
  }
}

