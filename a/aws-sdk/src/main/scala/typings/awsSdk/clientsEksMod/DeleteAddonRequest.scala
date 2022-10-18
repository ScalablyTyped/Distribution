package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAddonRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names returned by  ListAddons .
    */
  var addonName: String
  
  /**
    * The name of the cluster to delete the add-on from.
    */
  var clusterName: ClusterName
  
  /**
    * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops managing any settings for the add-on. If an IAM account is associated with the add-on, it is not removed.
    */
  var preserve: js.UndefOr[Boolean] = js.undefined
}
object DeleteAddonRequest {
  
  inline def apply(addonName: String, clusterName: ClusterName): DeleteAddonRequest = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAddonRequest]
  }
  
  extension [Self <: DeleteAddonRequest](x: Self) {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
  }
}
