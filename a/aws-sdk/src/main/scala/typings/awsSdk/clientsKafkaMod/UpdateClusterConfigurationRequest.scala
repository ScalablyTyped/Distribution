package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterConfigurationRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: typings.awsSdk.clientsKafkaMod.ConfigurationInfo
  
  /**
    * 
    The version of the cluster that needs to be updated.
    
    */
  var CurrentVersion: string
}
object UpdateClusterConfigurationRequest {
  
  inline def apply(ClusterArn: string, ConfigurationInfo: ConfigurationInfo, CurrentVersion: string): UpdateClusterConfigurationRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], ConfigurationInfo = ConfigurationInfo.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigurationRequest]
  }
  
  extension [Self <: UpdateClusterConfigurationRequest](x: Self) {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
  }
}
