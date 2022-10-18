package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionConfigurationItem extends StObject {
  
  /**
    * The position data destination that describes the AWS IoT rule that processes the device's position data for use by AWS IoT Core for LoRaWAN.
    */
  var Destination: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * Resource identifier for the position configuration.
    */
  var ResourceIdentifier: js.UndefOr[PositionResourceIdentifier] = js.undefined
  
  /**
    * Resource type of the resource for the position configuration.
    */
  var ResourceType: js.UndefOr[PositionResourceType] = js.undefined
  
  /**
    * The details of the positioning solver object used to compute the location.
    */
  var Solvers: js.UndefOr[PositionSolverDetails] = js.undefined
}
object PositionConfigurationItem {
  
  inline def apply(): PositionConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionConfigurationItem]
  }
  
  extension [Self <: PositionConfigurationItem](x: Self) {
    
    inline def setDestination(value: DestinationName): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSolvers(value: PositionSolverDetails): Self = StObject.set(x, "Solvers", value.asInstanceOf[js.Any])
    
    inline def setSolversUndefined: Self = StObject.set(x, "Solvers", js.undefined)
  }
}
