package typings.awsLambda

import typings.awsLambda.anon.References
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCodecommitMod {
  
  type CodeCommitHandler = Handler[CodeCommitTrigger, Unit]
  
  trait CodeCommitTrigger extends StObject {
    
    var awsRegion: String
    
    var codecommit: References
    
    var customData: js.UndefOr[String] = js.undefined
    
    var eventId: String
    
    var eventName: String
    
    var eventPartNumber: Double
    
    var eventSource: String
    
    var eventSourceARN: String
    
    var eventTime: String
    
    var eventTotalParts: Double
    
    var eventTriggerConfigId: String
    
    var eventTriggerName: String
    
    var eventVersion: String
    
    var userIdentityARN: String
  }
  object CodeCommitTrigger {
    
    inline def apply(
      awsRegion: String,
      codecommit: References,
      eventId: String,
      eventName: String,
      eventPartNumber: Double,
      eventSource: String,
      eventSourceARN: String,
      eventTime: String,
      eventTotalParts: Double,
      eventTriggerConfigId: String,
      eventTriggerName: String,
      eventVersion: String,
      userIdentityARN: String
    ): CodeCommitTrigger = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], codecommit = codecommit.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventPartNumber = eventPartNumber.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventTotalParts = eventTotalParts.asInstanceOf[js.Any], eventTriggerConfigId = eventTriggerConfigId.asInstanceOf[js.Any], eventTriggerName = eventTriggerName.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], userIdentityARN = userIdentityARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeCommitTrigger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeCommitTrigger] (val x: Self) extends AnyVal {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setCodecommit(value: References): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventPartNumber(value: Double): Self = StObject.set(x, "eventPartNumber", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventTotalParts(value: Double): Self = StObject.set(x, "eventTotalParts", value.asInstanceOf[js.Any])
      
      inline def setEventTriggerConfigId(value: String): Self = StObject.set(x, "eventTriggerConfigId", value.asInstanceOf[js.Any])
      
      inline def setEventTriggerName(value: String): Self = StObject.set(x, "eventTriggerName", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setUserIdentityARN(value: String): Self = StObject.set(x, "userIdentityARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeCommitTriggerEvent extends StObject {
    
    var Records: js.Array[CodeCommitTrigger]
  }
  object CodeCommitTriggerEvent {
    
    inline def apply(Records: js.Array[CodeCommitTrigger]): CodeCommitTriggerEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeCommitTriggerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeCommitTriggerEvent] (val x: Self) extends AnyVal {
      
      inline def setRecords(value: js.Array[CodeCommitTrigger]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: CodeCommitTrigger*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
}
