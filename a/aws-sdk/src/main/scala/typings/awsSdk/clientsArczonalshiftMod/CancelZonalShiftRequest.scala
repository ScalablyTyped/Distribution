package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelZonalShiftRequest extends StObject {
  
  /**
    * The internally-generated identifier of a zonal shift.
    */
  var zonalShiftId: ZonalShiftId
}
object CancelZonalShiftRequest {
  
  inline def apply(zonalShiftId: ZonalShiftId): CancelZonalShiftRequest = {
    val __obj = js.Dynamic.literal(zonalShiftId = zonalShiftId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelZonalShiftRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelZonalShiftRequest] (val x: Self) extends AnyVal {
    
    inline def setZonalShiftId(value: ZonalShiftId): Self = StObject.set(x, "zonalShiftId", value.asInstanceOf[js.Any])
  }
}
