package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterManagedInstanceRequest extends StObject {
  
  /**
    * The ID assigned to the managed node when you registered it using the activation process. 
    */
  var InstanceId: ManagedInstanceId
}
object DeregisterManagedInstanceRequest {
  
  inline def apply(InstanceId: ManagedInstanceId): DeregisterManagedInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterManagedInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterManagedInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: ManagedInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
