package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var FleetName: String
  
  /**
    * The name of the stack.
    */
  var StackName: String
}
object DisassociateFleetRequest {
  
  inline def apply(FleetName: String, StackName: String): DisassociateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
