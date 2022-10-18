package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseLogEventsRequest extends StObject {
  
  /**
    * The end of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the log stream. Use the get relational database log streams operation to get a list of available log streams.
    */
  var logStreamName: String
  
  /**
    * The token to advance to the next or previous page of results from your request. To get a page token, perform an initial GetRelationalDatabaseLogEvents request. If your results are paginated, the response will return a next forward token and/or next backward token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of your database for which to get log events.
    */
  var relationalDatabaseName: ResourceName
  
  /**
    * Parameter to specify if the log should start from head or tail. If true is specified, the log event starts from the head of the log. If false is specified, the log event starts from the tail of the log.  For PostgreSQL, the default value of false is the only option available. 
    */
  var startFromHead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The start of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object GetRelationalDatabaseLogEventsRequest {
  
  inline def apply(logStreamName: String, relationalDatabaseName: ResourceName): GetRelationalDatabaseLogEventsRequest = {
    val __obj = js.Dynamic.literal(logStreamName = logStreamName.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsRequest]
  }
  
  extension [Self <: GetRelationalDatabaseLogEventsRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setStartFromHead(value: Boolean): Self = StObject.set(x, "startFromHead", value.asInstanceOf[js.Any])
    
    inline def setStartFromHeadUndefined: Self = StObject.set(x, "startFromHead", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
