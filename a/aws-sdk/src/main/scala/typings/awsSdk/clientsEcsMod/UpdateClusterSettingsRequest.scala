package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterSettingsRequest extends StObject {
  
  /**
    * The name of the cluster to modify the settings for.
    */
  var cluster: String
  
  /**
    * The setting to use by default for a cluster. This parameter is used to turn on CloudWatch Container Insights for a cluster. If this value is specified, it overrides the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.  Currently, if you delete an existing cluster that does not have Container Insights turned on, and then create a new cluster with the same name with Container Insights tuned on, Container Insights will not actually be turned on. If you want to preserve the same name for your existing cluster and turn on Container Insights, you must wait 7 days before you can re-create it. 
    */
  var settings: ClusterSettings
}
object UpdateClusterSettingsRequest {
  
  inline def apply(cluster: String, settings: ClusterSettings): UpdateClusterSettingsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
