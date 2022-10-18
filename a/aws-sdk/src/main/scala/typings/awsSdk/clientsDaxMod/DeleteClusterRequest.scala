package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * The name of the cluster to be deleted.
    */
  var ClusterName: String
}
object DeleteClusterRequest {
  
  inline def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  extension [Self <: DeleteClusterRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
  }
}
