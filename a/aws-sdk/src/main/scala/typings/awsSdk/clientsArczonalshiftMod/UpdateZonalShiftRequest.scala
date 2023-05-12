package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateZonalShiftRequest extends StObject {
  
  /**
    * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is maintained. A new comment overwrites any existing comment string.
    */
  var comment: js.UndefOr[ZonalShiftComment] = js.undefined
  
  /**
    * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three days (72 hours). If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic to the Availability Zone. To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following, with no space:    A lowercase letter m: To specify that the value is in minutes.    A lowercase letter h: To specify that the value is in hours.   For example: 20h means the zonal shift expires in 20 hours. 120m means the zonal shift expires in 120 minutes (2 hours).
    */
  var expiresIn: js.UndefOr[ExpiresIn] = js.undefined
  
  /**
    * The identifier of a zonal shift.
    */
  var zonalShiftId: ZonalShiftId
}
object UpdateZonalShiftRequest {
  
  inline def apply(zonalShiftId: ZonalShiftId): UpdateZonalShiftRequest = {
    val __obj = js.Dynamic.literal(zonalShiftId = zonalShiftId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateZonalShiftRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateZonalShiftRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: ZonalShiftComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setExpiresIn(value: ExpiresIn): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setZonalShiftId(value: ZonalShiftId): Self = StObject.set(x, "zonalShiftId", value.asInstanceOf[js.Any])
  }
}
