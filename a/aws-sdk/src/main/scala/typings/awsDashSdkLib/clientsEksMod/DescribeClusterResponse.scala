package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterResponse extends js.Object {
  /**
    * The full description of your specified cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.undefined
}

object DescribeClusterResponse {
  @scala.inline
  def apply(cluster: Cluster = null): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[DescribeClusterResponse]
  }
}

