package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerCountRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: __string = js.native
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: __string = js.native
  /**
    * 
    The number of broker nodes that you want the cluster to have after this operation completes successfully.
    
    */
  var TargetNumberOfBrokerNodes: __integerMin1Max15 = js.native
}

object UpdateBrokerCountRequest {
  @scala.inline
  def apply(ClusterArn: __string, CurrentVersion: __string, TargetNumberOfBrokerNodes: __integerMin1Max15): UpdateBrokerCountRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetNumberOfBrokerNodes = TargetNumberOfBrokerNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBrokerCountRequest]
  }
}

