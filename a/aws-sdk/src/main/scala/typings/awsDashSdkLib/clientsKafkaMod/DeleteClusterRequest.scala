package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    */
  var ClusterArn: __string
  /**
    * The current version of the MSK cluster.
    */
  var CurrentVersion: js.UndefOr[__string] = js.undefined
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterArn: __string, CurrentVersion: __string = null): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn)
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion)
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

