package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined
  
  var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined
  
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  var fleet: WorkerFleetGenericIdentifier
  
  var name: Name
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var position: js.UndefOr[PositionCoordinates] = js.undefined
  
  var vendorProperties: js.UndefOr[VendorProperties] = js.undefined
}
object CreateWorkerRequest {
  
  inline def apply(fleet: WorkerFleetGenericIdentifier, name: Name): CreateWorkerRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerAdditionalFixedPropertiesJson): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setAdditionalTransientProperties(value: WorkerAdditionalTransientPropertiesJson): Self = StObject.set(x, "additionalTransientProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTransientPropertiesUndefined: Self = StObject.set(x, "additionalTransientProperties", js.undefined)
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFleet(value: WorkerFleetGenericIdentifier): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPosition(value: PositionCoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVendorProperties(value: VendorProperties): Self = StObject.set(x, "vendorProperties", value.asInstanceOf[js.Any])
    
    inline def setVendorPropertiesUndefined: Self = StObject.set(x, "vendorProperties", js.undefined)
  }
}
