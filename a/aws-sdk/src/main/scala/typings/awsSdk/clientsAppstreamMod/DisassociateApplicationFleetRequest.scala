package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateApplicationFleetRequest extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationArn: Arn
  
  /**
    * The name of the fleet.
    */
  var FleetName: Name
}
object DisassociateApplicationFleetRequest {
  
  inline def apply(ApplicationArn: Arn, FleetName: Name): DisassociateApplicationFleetRequest = {
    val __obj = js.Dynamic.literal(ApplicationArn = ApplicationArn.asInstanceOf[js.Any], FleetName = FleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApplicationFleetRequest]
  }
  
  extension [Self <: DisassociateApplicationFleetRequest](x: Self) {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setFleetName(value: Name): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
  }
}
