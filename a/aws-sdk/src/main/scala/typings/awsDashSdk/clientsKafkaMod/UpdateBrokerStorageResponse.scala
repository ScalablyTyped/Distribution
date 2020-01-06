package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerStorageResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[__string] = js.native
}

object UpdateBrokerStorageResponse {
  @scala.inline
  def apply(ClusterArn: __string = null, ClusterOperationArn: __string = null): UpdateBrokerStorageResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterOperationArn != null) __obj.updateDynamic("ClusterOperationArn")(ClusterOperationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerStorageResponse]
  }
}

