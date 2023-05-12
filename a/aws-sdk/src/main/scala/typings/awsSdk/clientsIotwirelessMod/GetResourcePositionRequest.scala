package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePositionRequest extends StObject {
  
  /**
    * The identifier of the resource for which position information is retrieved. It can be the wireless device ID or the wireless gateway ID, depending on the resource type.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * The type of resource for which position information is retrieved, which can be a wireless device or a wireless gateway.
    */
  var ResourceType: PositionResourceType
}
object GetResourcePositionRequest {
  
  inline def apply(ResourceIdentifier: PositionResourceIdentifier, ResourceType: PositionResourceType): GetResourcePositionRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePositionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePositionRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
