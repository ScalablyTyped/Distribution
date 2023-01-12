package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterResponse extends StObject {
  
  /**
    * The cluster object that has been deleted
    */
  var Cluster: js.UndefOr[typings.awsSdk.clientsMemorydbMod.Cluster] = js.undefined
}
object DeleteClusterResponse {
  
  inline def apply(): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
