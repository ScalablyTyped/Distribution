package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShipmentInformation extends StObject {
  
  /**
    *  The carrier of the shipment. 
    */
  var ShipmentCarrier: js.UndefOr[typings.awsSdk.clientsOutpostsMod.ShipmentCarrier] = js.undefined
  
  /**
    *  The tracking number of the shipment. 
    */
  var ShipmentTrackingNumber: js.UndefOr[TrackingId] = js.undefined
}
object ShipmentInformation {
  
  inline def apply(): ShipmentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShipmentInformation] (val x: Self) extends AnyVal {
    
    inline def setShipmentCarrier(value: ShipmentCarrier): Self = StObject.set(x, "ShipmentCarrier", value.asInstanceOf[js.Any])
    
    inline def setShipmentCarrierUndefined: Self = StObject.set(x, "ShipmentCarrier", js.undefined)
    
    inline def setShipmentTrackingNumber(value: TrackingId): Self = StObject.set(x, "ShipmentTrackingNumber", value.asInstanceOf[js.Any])
    
    inline def setShipmentTrackingNumberUndefined: Self = StObject.set(x, "ShipmentTrackingNumber", js.undefined)
  }
}
