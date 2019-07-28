package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterConfigurationResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[__string] = js.undefined
}

object UpdateClusterConfigurationResponse {
  @scala.inline
  def apply(ClusterArn: __string = null, ClusterOperationArn: __string = null): UpdateClusterConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn)
    if (ClusterOperationArn != null) __obj.updateDynamic("ClusterOperationArn")(ClusterOperationArn)
    __obj.asInstanceOf[UpdateClusterConfigurationResponse]
  }
}

