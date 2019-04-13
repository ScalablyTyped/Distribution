package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterRequest extends js.Object {
  /**
    * The name of the cluster to be deleted.
    */
  var ClusterName: String
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName)
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

