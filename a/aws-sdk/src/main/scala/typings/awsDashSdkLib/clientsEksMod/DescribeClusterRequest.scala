package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterRequest extends js.Object {
  /**
    * The name of the cluster to describe.
    */
  var name: String
}

object DescribeClusterRequest {
  @scala.inline
  def apply(name: String): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DescribeClusterRequest]
  }
}

