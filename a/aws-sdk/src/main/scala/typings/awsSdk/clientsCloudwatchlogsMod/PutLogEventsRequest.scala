package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLogEventsRequest extends StObject {
  
  /**
    * The log events.
    */
  var logEvents: InputLogEvents
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
  
  /**
    * The sequence token obtained from the response of the previous PutLogEvents call.  The sequenceToken parameter is now ignored in PutLogEvents actions. PutLogEvents actions are now accepted and never return InvalidSequenceTokenException or DataAlreadyAcceptedException even if the sequence token is not valid. 
    */
  var sequenceToken: js.UndefOr[SequenceToken] = js.undefined
}
object PutLogEventsRequest {
  
  inline def apply(logEvents: InputLogEvents, logGroupName: LogGroupName, logStreamName: LogStreamName): PutLogEventsRequest = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLogEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutLogEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setLogEvents(value: InputLogEvents): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
    
    inline def setLogEventsVarargs(value: InputLogEvent*): Self = StObject.set(x, "logEvents", js.Array(value*))
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setSequenceToken(value: SequenceToken): Self = StObject.set(x, "sequenceToken", value.asInstanceOf[js.Any])
    
    inline def setSequenceTokenUndefined: Self = StObject.set(x, "sequenceToken", js.undefined)
  }
}
