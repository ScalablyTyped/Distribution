package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * The name of the cluster to delete.
    */
  var name: String
}
object DeleteClusterRequest {
  
  inline def apply(name: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  extension [Self <: DeleteClusterRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
