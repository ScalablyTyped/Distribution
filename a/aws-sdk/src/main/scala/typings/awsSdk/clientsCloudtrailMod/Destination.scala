package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    *  The location of the service. For service-linked channels, this is the name of the Amazon Web Services service. 
    */
  var Location: typings.awsSdk.clientsCloudtrailMod.Location
  
  /**
    *  The type of service. For service-linked channels, the value is AWS_SERVICE. 
    */
  var Type: DestinationType
}
object Destination {
  
  inline def apply(Location: Location, Type: DestinationType): Destination = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setType(value: DestinationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
