package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationFleetAssociation extends StObject {
  
  /**
    * The ARN of the application associated with the fleet.
    */
  var ApplicationArn: Arn
  
  /**
    * The name of the fleet associated with the application.
    */
  var FleetName: String
}
object ApplicationFleetAssociation {
  
  inline def apply(ApplicationArn: Arn, FleetName: String): ApplicationFleetAssociation = {
    val __obj = js.Dynamic.literal(ApplicationArn = ApplicationArn.asInstanceOf[js.Any], FleetName = FleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationFleetAssociation]
  }
  
  extension [Self <: ApplicationFleetAssociation](x: Self) {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
  }
}
