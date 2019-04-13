package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterInput extends js.Object {
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: awsDashSdkLib.clientsEmrMod.ClusterId
}

object DescribeClusterInput {
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
  
    __obj.asInstanceOf[DescribeClusterInput]
  }
}

