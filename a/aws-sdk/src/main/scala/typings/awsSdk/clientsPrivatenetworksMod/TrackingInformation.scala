package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingInformation extends StObject {
  
  /**
    * The tracking number of the shipment.
    */
  var trackingNumber: js.UndefOr[String] = js.undefined
}
object TrackingInformation {
  
  inline def apply(): TrackingInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingInformation]
  }
  
  extension [Self <: TrackingInformation](x: Self) {
    
    inline def setTrackingNumber(value: String): Self = StObject.set(x, "trackingNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackingNumberUndefined: Self = StObject.set(x, "trackingNumber", js.undefined)
  }
}
