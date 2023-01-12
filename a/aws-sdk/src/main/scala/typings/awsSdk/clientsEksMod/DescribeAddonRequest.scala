package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddonRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names returned by  ListAddons .
    */
  var addonName: String
  
  /**
    * The name of the cluster.
    */
  var clusterName: ClusterName
}
object DescribeAddonRequest {
  
  inline def apply(addonName: String, clusterName: ClusterName): DescribeAddonRequest = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAddonRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddonRequest] (val x: Self) extends AnyVal {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
  }
}
