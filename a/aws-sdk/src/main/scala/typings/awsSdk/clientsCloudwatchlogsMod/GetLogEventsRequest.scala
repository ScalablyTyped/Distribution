package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogEventsRequest extends StObject {
  
  /**
    * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to or later than this time are not included.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of log events returned. If you don't specify a limit, the default is as many log events as can fit in a response size of 1 MB (up to 10,000 log events).
    */
  var limit: js.UndefOr[EventsLimit] = js.undefined
  
  /**
    * Specify either the name or ARN of the log group to view events from. If the log group is in a source account and you are using a monitoring account, you must use the log group ARN.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupIdentifier: js.UndefOr[LogGroupIdentifier] = js.undefined
  
  /**
    * The name of the log group.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * If the value is true, the earliest log events are returned first. If the value is false, the latest log events are returned first. The default value is false. If you are using a previous nextForwardToken value as the nextToken in this operation, you must specify true for startFromHead.
    */
  var startFromHead: js.UndefOr[StartFromHead] = js.undefined
  
  /**
    * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this time are not included.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Specify true to display the log event fields with all sensitive data unmasked and visible. The default is false. To use this operation with this parameter, you must be signed into an account with the logs:Unmask permission.
    */
  var unmask: js.UndefOr[Unmask] = js.undefined
}
object GetLogEventsRequest {
  
  inline def apply(logStreamName: LogStreamName): GetLogEventsRequest = {
    val __obj = js.Dynamic.literal(logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLimit(value: EventsLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogGroupIdentifierUndefined: Self = StObject.set(x, "logGroupIdentifier", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartFromHead(value: StartFromHead): Self = StObject.set(x, "startFromHead", value.asInstanceOf[js.Any])
    
    inline def setStartFromHeadUndefined: Self = StObject.set(x, "startFromHead", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUnmask(value: Unmask): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
  }
}
