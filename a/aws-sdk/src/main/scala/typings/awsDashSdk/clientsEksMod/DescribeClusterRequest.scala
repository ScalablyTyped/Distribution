package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterRequest extends js.Object {
  /**
    * The name of the cluster to describe.
    */
  var name: String = js.native
}

object DescribeClusterRequest {
  @scala.inline
  def apply(name: String): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeClusterRequest]
  }
}

