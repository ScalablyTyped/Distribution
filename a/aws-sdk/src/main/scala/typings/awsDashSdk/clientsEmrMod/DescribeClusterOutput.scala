package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterOutput extends js.Object {
  /**
    * This output contains the details for the requested cluster.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Cluster] = js.native
}

object DescribeClusterOutput {
  @scala.inline
  def apply(Cluster: Cluster = null): DescribeClusterOutput = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterOutput]
  }
}

