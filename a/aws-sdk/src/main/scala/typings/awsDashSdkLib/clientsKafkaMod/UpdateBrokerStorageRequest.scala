package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBrokerStorageRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: __string
  /**
    * 
    The version of cluster to update from. A successful operation will then generate a new version.
    
    */
  var CurrentVersion: __string
  /**
    * 
    Describes the target volume size and the ID of the broker to apply the update to.
    
    */
  var TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
}

object UpdateBrokerStorageRequest {
  @scala.inline
  def apply(
    ClusterArn: __string,
    CurrentVersion: __string,
    TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
  ): UpdateBrokerStorageRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn, CurrentVersion = CurrentVersion, TargetBrokerEBSVolumeInfo = TargetBrokerEBSVolumeInfo)
  
    __obj.asInstanceOf[UpdateBrokerStorageRequest]
  }
}

