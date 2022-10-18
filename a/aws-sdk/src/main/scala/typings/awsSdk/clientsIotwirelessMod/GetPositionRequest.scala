package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPositionRequest extends StObject {
  
  /**
    * Resource identifier used to retrieve the position information.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * Resource type of the resource for which position information is retrieved.
    */
  var ResourceType: PositionResourceType
}
object GetPositionRequest {
  
  inline def apply(ResourceIdentifier: PositionResourceIdentifier, ResourceType: PositionResourceType): GetPositionRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPositionRequest]
  }
  
  extension [Self <: GetPositionRequest](x: Self) {
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
