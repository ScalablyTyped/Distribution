package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterConfigurationRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: __string = js.native
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: typings.awsDashSdk.clientsKafkaMod.ConfigurationInfo = js.native
  /**
    * 
    The version of the cluster that needs to be updated.
    
    */
  var CurrentVersion: __string = js.native
}

object UpdateClusterConfigurationRequest {
  @scala.inline
  def apply(ClusterArn: __string, ConfigurationInfo: ConfigurationInfo, CurrentVersion: __string): UpdateClusterConfigurationRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], ConfigurationInfo = ConfigurationInfo.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateClusterConfigurationRequest]
  }
}

