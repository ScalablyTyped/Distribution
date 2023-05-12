package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZonalShift extends StObject {
  
  /**
    * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in the AWS Region.
    */
  var awayFrom: AvailabilityZone
  
  /**
    * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is maintained. A new comment overwrites any existing comment string.
    */
  var comment: ZonalShiftComment
  
  /**
    * The expiry time (expiration time) for the zonal shift. A zonal shift is temporary and must be set to expire when you start the zonal shift. You can initially set a zonal shift to expire in a maximum of three days (72 hours). However, you can update a zonal shift to set a new expiration at any time.  When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts to an expiry time (expiration time). You can cancel a zonal shift, for example, if you're ready to restore traffic to the Availability Zone. Or you can update the zonal shift to specify another length of time to expire in.
    */
  var expiryTime: js.Date
  
  /**
    * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for the resource. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  var resourceIdentifier: ResourceIdentifier
  
  /**
    * The time (UTC) when the zonal shift is started.
    */
  var startTime: js.Date
  
  /**
    * A status for a zonal shift. The Status for a zonal shift can have one of the following values:    ACTIVE: The zonal shift is started and active.    EXPIRED: The zonal shift has expired (the expiry time was exceeded).    CANCELED: The zonal shift was canceled.  
    */
  var status: ZonalShiftStatus
  
  /**
    * The identifier of a zonal shift.
    */
  var zonalShiftId: ZonalShiftId
}
object ZonalShift {
  
  inline def apply(
    awayFrom: AvailabilityZone,
    comment: ZonalShiftComment,
    expiryTime: js.Date,
    resourceIdentifier: ResourceIdentifier,
    startTime: js.Date,
    status: ZonalShiftStatus,
    zonalShiftId: ZonalShiftId
  ): ZonalShift = {
    val __obj = js.Dynamic.literal(awayFrom = awayFrom.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], expiryTime = expiryTime.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], zonalShiftId = zonalShiftId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZonalShift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZonalShift] (val x: Self) extends AnyVal {
    
    inline def setAwayFrom(value: AvailabilityZone): Self = StObject.set(x, "awayFrom", value.asInstanceOf[js.Any])
    
    inline def setComment(value: ZonalShiftComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setExpiryTime(value: js.Date): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ZonalShiftStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setZonalShiftId(value: ZonalShiftId): Self = StObject.set(x, "zonalShiftId", value.asInstanceOf[js.Any])
  }
}
