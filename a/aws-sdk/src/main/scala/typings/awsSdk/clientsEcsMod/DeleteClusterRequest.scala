package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to delete.
    */
  var cluster: String
}
object DeleteClusterRequest {
  
  inline def apply(cluster: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  extension [Self <: DeleteClusterRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
