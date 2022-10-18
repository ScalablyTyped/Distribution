package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterClusterRequest extends StObject {
  
  /**
    * The name of the connected cluster to deregister.
    */
  var name: String
}
object DeregisterClusterRequest {
  
  inline def apply(name: String): DeregisterClusterRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterClusterRequest]
  }
  
  extension [Self <: DeregisterClusterRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
