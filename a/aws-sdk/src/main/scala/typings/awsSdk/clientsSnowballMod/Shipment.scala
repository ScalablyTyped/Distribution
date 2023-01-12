package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shipment extends StObject {
  
  /**
    * Status information for a shipment.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snow device as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
    */
  var TrackingNumber: js.UndefOr[String] = js.undefined
}
object Shipment {
  
  inline def apply(): Shipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shipment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shipment] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrackingNumber(value: String): Self = StObject.set(x, "TrackingNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackingNumberUndefined: Self = StObject.set(x, "TrackingNumber", js.undefined)
  }
}
