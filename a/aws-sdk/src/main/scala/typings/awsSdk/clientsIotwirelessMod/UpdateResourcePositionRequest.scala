package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourcePositionRequest extends StObject {
  
  /**
    * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which a format that's used to encode geographic data structures. For more information, see GeoJSON.
    */
  var GeoJsonPayload: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GeoJsonPayload] = js.undefined
  
  /**
    * The identifier of the resource for which position information is updated. It can be the wireless device ID or the wireless gateway ID, depending on the resource type.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * The type of resource for which position information is updated, which can be a wireless device or a wireless gateway.
    */
  var ResourceType: PositionResourceType
}
object UpdateResourcePositionRequest {
  
  inline def apply(ResourceIdentifier: PositionResourceIdentifier, ResourceType: PositionResourceType): UpdateResourcePositionRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourcePositionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResourcePositionRequest] (val x: Self) extends AnyVal {
    
    inline def setGeoJsonPayload(value: GeoJsonPayload): Self = StObject.set(x, "GeoJsonPayload", value.asInstanceOf[js.Any])
    
    inline def setGeoJsonPayloadUndefined: Self = StObject.set(x, "GeoJsonPayload", js.undefined)
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
