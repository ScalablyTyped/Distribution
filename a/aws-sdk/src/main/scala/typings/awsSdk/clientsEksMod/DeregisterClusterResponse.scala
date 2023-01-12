package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterClusterResponse extends StObject {
  
  var cluster: js.UndefOr[Cluster] = js.undefined
}
object DeregisterClusterResponse {
  
  inline def apply(): DeregisterClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
