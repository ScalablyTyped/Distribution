package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterResponse extends StObject {
  
  /**
    * Information about the cluster that was deleted.
    */
  var Cluster: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Cluster] = js.undefined
}
object DeleteClusterResponse {
  
  inline def apply(): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterResponse]
  }
  
  extension [Self <: DeleteClusterResponse](x: Self) {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
