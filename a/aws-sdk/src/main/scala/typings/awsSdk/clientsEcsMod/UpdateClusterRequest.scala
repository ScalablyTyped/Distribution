package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterRequest extends StObject {
  
  /**
    * The name of the cluster to modify the settings for.
    */
  var cluster: String
  
  /**
    * The execute command configuration for the cluster.
    */
  var configuration: js.UndefOr[ClusterConfiguration] = js.undefined
  
  /**
    * The cluster settings for your cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.undefined
}
object UpdateClusterRequest {
  
  inline def apply(cluster: String): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  
  extension [Self <: UpdateClusterRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ClusterConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
