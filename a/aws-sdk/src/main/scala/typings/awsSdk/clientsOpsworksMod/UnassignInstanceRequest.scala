package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignInstanceRequest extends StObject {
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object UnassignInstanceRequest {
  
  inline def apply(InstanceId: String): UnassignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignInstanceRequest]
  }
  
  extension [Self <: UnassignInstanceRequest](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
