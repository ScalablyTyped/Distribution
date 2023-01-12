package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceLogLevelRequest extends StObject {
  
  var ResourceIdentifier: typings.awsSdk.clientsIotwirelessMod.ResourceIdentifier
  
  /**
    * The type of the resource, which can be WirelessDevice or WirelessGateway.
    */
  var ResourceType: typings.awsSdk.clientsIotwirelessMod.ResourceType
}
object GetResourceLogLevelRequest {
  
  inline def apply(ResourceIdentifier: ResourceIdentifier, ResourceType: ResourceType): GetResourceLogLevelRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceLogLevelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceLogLevelRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
