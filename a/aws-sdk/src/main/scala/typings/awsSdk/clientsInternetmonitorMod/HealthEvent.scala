package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthEvent extends StObject {
  
  /**
    * When the health event was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when a health event ended. If the health event is still active, then the end time is not set.
    */
  var EndedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event.
    */
  var EventArn: Arn
  
  /**
    * The internally generated identifier of a specific network traffic impairment health event.
    */
  var EventId: HealthEventName
  
  /**
    * The type of impairment for a health event.
    */
  var ImpactType: HealthEventImpactType
  
  /**
    * The locations impacted by the health event.
    */
  var ImpactedLocations: ImpactedLocationsList
  
  /**
    * When the health event was last updated.
    */
  var LastUpdatedAt: js.Date
  
  /**
    * The impact on global traffic monitored by this monitor for this health event.
    */
  var PercentOfTotalTrafficImpacted: js.UndefOr[Double] = js.undefined
  
  /**
    * When a health event started.
    */
  var StartedAt: js.Date
  
  /**
    * Health event list member.
    */
  var Status: HealthEventStatus
}
object HealthEvent {
  
  inline def apply(
    EventArn: Arn,
    EventId: HealthEventName,
    ImpactType: HealthEventImpactType,
    ImpactedLocations: ImpactedLocationsList,
    LastUpdatedAt: js.Date,
    StartedAt: js.Date,
    Status: HealthEventStatus
  ): HealthEvent = {
    val __obj = js.Dynamic.literal(EventArn = EventArn.asInstanceOf[js.Any], EventId = EventId.asInstanceOf[js.Any], ImpactType = ImpactType.asInstanceOf[js.Any], ImpactedLocations = ImpactedLocations.asInstanceOf[js.Any], LastUpdatedAt = LastUpdatedAt.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthEvent] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "EndedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "EndedAt", js.undefined)
    
    inline def setEventArn(value: Arn): Self = StObject.set(x, "EventArn", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: HealthEventName): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setImpactType(value: HealthEventImpactType): Self = StObject.set(x, "ImpactType", value.asInstanceOf[js.Any])
    
    inline def setImpactedLocations(value: ImpactedLocationsList): Self = StObject.set(x, "ImpactedLocations", value.asInstanceOf[js.Any])
    
    inline def setImpactedLocationsVarargs(value: ImpactedLocation*): Self = StObject.set(x, "ImpactedLocations", js.Array(value*))
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setPercentOfTotalTrafficImpacted(value: Double): Self = StObject.set(x, "PercentOfTotalTrafficImpacted", value.asInstanceOf[js.Any])
    
    inline def setPercentOfTotalTrafficImpactedUndefined: Self = StObject.set(x, "PercentOfTotalTrafficImpacted", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HealthEventStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
