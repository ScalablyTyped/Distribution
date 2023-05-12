package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Worker extends StObject {
  
  var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined
  
  var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined
  
  var arn: WorkerArn
  
  var createdAt: js.Date
  
  var fleet: WorkerFleetArn
  
  var id: WorkerId
  
  var name: Name
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var position: js.UndefOr[PositionCoordinates] = js.undefined
  
  var site: SiteArn
  
  var updatedAt: js.Date
  
  var vendorProperties: js.UndefOr[VendorProperties] = js.undefined
}
object Worker {
  
  inline def apply(
    arn: WorkerArn,
    createdAt: js.Date,
    fleet: WorkerFleetArn,
    id: WorkerId,
    name: Name,
    site: SiteArn,
    updatedAt: js.Date
  ): Worker = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Worker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
    
    inline def setAdditionalFixedProperties(value: WorkerAdditionalFixedPropertiesJson): Self = StObject.set(x, "additionalFixedProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFixedPropertiesUndefined: Self = StObject.set(x, "additionalFixedProperties", js.undefined)
    
    inline def setAdditionalTransientProperties(value: WorkerAdditionalTransientPropertiesJson): Self = StObject.set(x, "additionalTransientProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTransientPropertiesUndefined: Self = StObject.set(x, "additionalTransientProperties", js.undefined)
    
    inline def setArn(value: WorkerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setFleet(value: WorkerFleetArn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPosition(value: PositionCoordinates): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSite(value: SiteArn): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setVendorProperties(value: VendorProperties): Self = StObject.set(x, "vendorProperties", value.asInstanceOf[js.Any])
    
    inline def setVendorPropertiesUndefined: Self = StObject.set(x, "vendorProperties", js.undefined)
  }
}
