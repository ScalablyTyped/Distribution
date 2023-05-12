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
    * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace, any new services with Service Connect turned on that are created in the cluster are added as client services in the namespace. This setting only applies to new services that set the enabled parameter to true in the ServiceConnectConfiguration. You can set the namespace of each service individually in the ServiceConnectConfiguration to override this default parameter. Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service Connect. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var serviceConnectDefaults: js.UndefOr[ClusterServiceConnectDefaultsRequest] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ClusterConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setServiceConnectDefaults(value: ClusterServiceConnectDefaultsRequest): Self = StObject.set(x, "serviceConnectDefaults", value.asInstanceOf[js.Any])
    
    inline def setServiceConnectDefaultsUndefined: Self = StObject.set(x, "serviceConnectDefaults", js.undefined)
    
    inline def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
