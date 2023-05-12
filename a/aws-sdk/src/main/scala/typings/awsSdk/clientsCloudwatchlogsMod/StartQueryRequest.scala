package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryRequest extends StObject {
  
  /**
    * The end of the time range to query. The range is inclusive, so the specified end time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var endTime: Timestamp
  
  /**
    * The maximum number of log events to return in the query. If the query string uses the fields command, only the specified fields and their values are returned. The default is 1000.
    */
  var limit: js.UndefOr[EventsLimit] = js.undefined
  
  /**
    * The list of log groups to query. You can include up to 50 log groups. You can specify them by the log group name or ARN. If a log group that you're querying is in a source account and you're using a monitoring account, you must specify the ARN of the log group here. The query definition must also be defined in the monitoring account. If you specify an ARN, the ARN can't end with an asterisk (*). A StartQuery operation must include exactly one of the following parameters: logGroupName, logGroupNames or logGroupIdentifiers. 
    */
  var logGroupIdentifiers: js.UndefOr[LogGroupIdentifiers] = js.undefined
  
  /**
    * The log group on which to perform the query.  A StartQuery operation must include exactly one of the following parameters: logGroupName, logGroupNames or logGroupIdentifiers.  
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The list of log groups to be queried. You can include up to 50 log groups.  A StartQuery operation must include exactly one of the following parameters: logGroupName, logGroupNames or logGroupIdentifiers.  
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.undefined
  
  /**
    * The query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: QueryString
  
  /**
    * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var startTime: Timestamp
}
object StartQueryRequest {
  
  inline def apply(endTime: Timestamp, queryString: QueryString, startTime: Timestamp): StartQueryRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: EventsLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLogGroupIdentifiers(value: LogGroupIdentifiers): Self = StObject.set(x, "logGroupIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setLogGroupIdentifiersUndefined: Self = StObject.set(x, "logGroupIdentifiers", js.undefined)
    
    inline def setLogGroupIdentifiersVarargs(value: LogGroupIdentifier*): Self = StObject.set(x, "logGroupIdentifiers", js.Array(value*))
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogGroupNames(value: LogGroupNames): Self = StObject.set(x, "logGroupNames", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNamesUndefined: Self = StObject.set(x, "logGroupNames", js.undefined)
    
    inline def setLogGroupNamesVarargs(value: LogGroupName*): Self = StObject.set(x, "logGroupNames", js.Array(value*))
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
