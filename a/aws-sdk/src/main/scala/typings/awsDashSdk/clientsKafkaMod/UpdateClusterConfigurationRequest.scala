package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterConfigurationRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: __string
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: typings.awsDashSdk.clientsKafkaMod.ConfigurationInfo
  /**
    * 
    The version of the cluster that needs to be updated.
    
    */
  var CurrentVersion: __string
}

object UpdateClusterConfigurationRequest {
  @scala.inline
  def apply(ClusterArn: __string, ConfigurationInfo: ConfigurationInfo, CurrentVersion: __string): UpdateClusterConfigurationRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn, ConfigurationInfo = ConfigurationInfo, CurrentVersion = CurrentVersion)
  
    __obj.asInstanceOf[UpdateClusterConfigurationRequest]
  }
}

