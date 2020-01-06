package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersResponse extends js.Object {
  /**
    * A list of clusters.
    */
  var Clusters: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Clusters] = js.native
  /**
    * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a subsequent DescribeClusters request to get more clusters.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.NextToken] = js.native
}

object DescribeClustersResponse {
  @scala.inline
  def apply(Clusters: Clusters = null, NextToken: NextToken = null): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (Clusters != null) __obj.updateDynamic("Clusters")(Clusters.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersResponse]
  }
}

