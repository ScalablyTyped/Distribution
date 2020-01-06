package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerStorageRequest extends js.Object {
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
    Describes the target volume size and the ID of the broker to apply the update to.
    
    */
  var TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo = js.native
}

object UpdateBrokerStorageRequest {
  @scala.inline
  def apply(
    ClusterArn: __string,
    CurrentVersion: __string,
    TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
  ): UpdateBrokerStorageRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any], TargetBrokerEBSVolumeInfo = TargetBrokerEBSVolumeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateBrokerStorageRequest]
  }
}

