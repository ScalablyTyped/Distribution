package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestedEventStatistics extends StObject {
  
  /**
    * The total size of the stored events.
    */
  var eventDataSizeInBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * Timestamp of when the stored event was last updated. 
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The oldest stored event.
    */
  var leastRecentEvent: js.UndefOr[time] = js.undefined
  
  /**
    * The newest stored event.
    */
  var mostRecentEvent: js.UndefOr[time] = js.undefined
  
  /**
    * The number of stored events.
    */
  var numberOfEvents: js.UndefOr[Long] = js.undefined
}
object IngestedEventStatistics {
  
  inline def apply(): IngestedEventStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestedEventStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestedEventStatistics] (val x: Self) extends AnyVal {
    
    inline def setEventDataSizeInBytes(value: Long): Self = StObject.set(x, "eventDataSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setEventDataSizeInBytesUndefined: Self = StObject.set(x, "eventDataSizeInBytes", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setLeastRecentEvent(value: time): Self = StObject.set(x, "leastRecentEvent", value.asInstanceOf[js.Any])
    
    inline def setLeastRecentEventUndefined: Self = StObject.set(x, "leastRecentEvent", js.undefined)
    
    inline def setMostRecentEvent(value: time): Self = StObject.set(x, "mostRecentEvent", value.asInstanceOf[js.Any])
    
    inline def setMostRecentEventUndefined: Self = StObject.set(x, "mostRecentEvent", js.undefined)
    
    inline def setNumberOfEvents(value: Long): Self = StObject.set(x, "numberOfEvents", value.asInstanceOf[js.Any])
    
    inline def setNumberOfEventsUndefined: Self = StObject.set(x, "numberOfEvents", js.undefined)
  }
}
