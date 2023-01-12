package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the traffic policy instance that you want to delete.   When you delete a traffic policy instance, Amazon Route 53 also deletes all of the resource record sets that were created when you created the traffic policy instance. 
    */
  var Id: TrafficPolicyInstanceId
}
object DeleteTrafficPolicyInstanceRequest {
  
  inline def apply(Id: TrafficPolicyInstanceId): DeleteTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: TrafficPolicyInstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
