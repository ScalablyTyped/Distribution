package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPositionConfigurationRequest extends StObject {
  
  /**
    * Resource identifier used in a position configuration.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * Resource type of the resource for which position configuration is retrieved.
    */
  var ResourceType: PositionResourceType
}
object GetPositionConfigurationRequest {
  
  inline def apply(ResourceIdentifier: PositionResourceIdentifier, ResourceType: PositionResourceType): GetPositionConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPositionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPositionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
