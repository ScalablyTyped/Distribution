package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogGroupFieldsRequest extends StObject {
  
  /**
    * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are using a monitoring account, you must specify the ARN.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupIdentifier: js.UndefOr[LogGroupIdentifier] = js.undefined
  
  /**
    * The name of the log group to search.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The time to set as the center of the query. If you specify time, the 15 minutes before this time are queries. If you omit time, the 8 minutes before and 8 minutes after this time are searched. The time value is specified as epoch time, which is the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var time: js.UndefOr[Timestamp] = js.undefined
}
object GetLogGroupFieldsRequest {
  
  inline def apply(): GetLogGroupFieldsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogGroupFieldsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogGroupFieldsRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogGroupIdentifierUndefined: Self = StObject.set(x, "logGroupIdentifier", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
