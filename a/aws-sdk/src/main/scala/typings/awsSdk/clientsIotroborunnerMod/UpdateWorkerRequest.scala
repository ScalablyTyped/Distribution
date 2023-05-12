package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkerRequest extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined
  
  var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined
  
  var id: WorkerGenericIdentifier
  
  var name: js.UndefOr[Name] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var position: js.UndefOr[PositionCoordinates] = js.undefined
  
  var vendorProperties: js.UndefOr[VendorProperties] = js.undefined
}
object UpdateWorkerRequest {
  
  inline def apply(id: WorkerGenericIdentifier): UpdateWorkerRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerAdditionalFixedPropertiesJson): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setAdditionalTransientProperties(value: WorkerAdditionalTransientPropertiesJson): Self = StObject.set(x, "additionalTransientProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTransientPropertiesUndefined: Self = StObject.set(x, "additionalTransientProperties", js.undefined)
    
    inline def setId(value: WorkerGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPosition(value: PositionCoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVendorProperties(value: VendorProperties): Self = StObject.set(x, "vendorProperties", value.asInstanceOf[js.Any])
    
    inline def setVendorPropertiesUndefined: Self = StObject.set(x, "vendorProperties", js.undefined)
  }
}
