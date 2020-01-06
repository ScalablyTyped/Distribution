package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterInput extends js.Object {
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId = js.native
}

object DescribeClusterInput {
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeClusterInput]
  }
}

