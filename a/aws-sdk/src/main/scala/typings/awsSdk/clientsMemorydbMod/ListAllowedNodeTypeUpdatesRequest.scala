package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAllowedNodeTypeUpdatesRequest extends StObject {
  
  /**
    * The name of the cluster you want to scale. MemoryDB uses the cluster name to identify the current node type being used by this cluster, and from that to create a list of node types you can scale up to.
    */
  var ClusterName: String
}
object ListAllowedNodeTypeUpdatesRequest {
  
  inline def apply(ClusterName: String): ListAllowedNodeTypeUpdatesRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllowedNodeTypeUpdatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAllowedNodeTypeUpdatesRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
  }
}
