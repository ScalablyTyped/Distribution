package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobEventDetails extends StObject {
  
  /**
    * The type of event that occurred related to the Amazon Braket job.
    */
  var eventType: js.UndefOr[JobEventType] = js.undefined
  
  /**
    * A message describing the event that occurred related to the Amazon Braket job.
    */
  var message: js.UndefOr[JobEventDetailsMessageString] = js.undefined
  
  /**
    * TThe type of event that occurred related to the Amazon Braket job.
    */
  var timeOfEvent: js.UndefOr[js.Date] = js.undefined
}
object JobEventDetails {
  
  inline def apply(): JobEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobEventDetails]
  }
  
  extension [Self <: JobEventDetails](x: Self) {
    
    inline def setEventType(value: JobEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setMessage(value: JobEventDetailsMessageString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTimeOfEvent(value: js.Date): Self = StObject.set(x, "timeOfEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeOfEventUndefined: Self = StObject.set(x, "timeOfEvent", js.undefined)
  }
}
