package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePositionRequest extends StObject {
  
  /**
    * The position information of the resource.
    */
  var Position: PositionCoordinate
  
  /**
    * Resource identifier of the resource for which position is updated.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * Resource type of the resource for which position is updated.
    */
  var ResourceType: PositionResourceType
}
object UpdatePositionRequest {
  
  inline def apply(
    Position: PositionCoordinate,
    ResourceIdentifier: PositionResourceIdentifier,
    ResourceType: PositionResourceType
  ): UpdatePositionRequest = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePositionRequest]
  }
  
  extension [Self <: UpdatePositionRequest](x: Self) {
    
    inline def setPosition(value: PositionCoordinate): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: PositionCoordinateValue*): Self = StObject.set(x, "Position", js.Array(value*))
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
