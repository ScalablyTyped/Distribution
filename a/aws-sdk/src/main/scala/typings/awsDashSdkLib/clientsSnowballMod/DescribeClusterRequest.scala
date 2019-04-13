package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterRequest extends js.Object {
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: awsDashSdkLib.clientsSnowballMod.ClusterId
}

object DescribeClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
  
    __obj.asInstanceOf[DescribeClusterRequest]
  }
}

