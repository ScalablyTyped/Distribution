package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterResult extends js.Object {
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[ClusterMetadata] = js.undefined
}

object DescribeClusterResult {
  @scala.inline
  def apply(ClusterMetadata: ClusterMetadata = null): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterMetadata != null) __obj.updateDynamic("ClusterMetadata")(ClusterMetadata)
    __obj.asInstanceOf[DescribeClusterResult]
  }
}

