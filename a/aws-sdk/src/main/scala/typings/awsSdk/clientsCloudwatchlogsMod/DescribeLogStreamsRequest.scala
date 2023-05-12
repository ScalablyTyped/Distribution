package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLogStreamsRequest extends StObject {
  
  /**
    * If the value is true, results are returned in descending order. If the value is to false, results are returned in ascending order. The default value is false.
    */
  var descending: js.UndefOr[Descending] = js.undefined
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  
  /**
    * Specify either the name or ARN of the log group to view. If the log group is in a source account and you are using a monitoring account, you must use the log group ARN.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupIdentifier: js.UndefOr[LogGroupIdentifier] = js.undefined
  
  /**
    * The name of the log group.   You must include either logGroupIdentifier or logGroupName, but not both.  
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The prefix to match. If orderBy is LastEventTime, you cannot specify this parameter.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * If the value is LogStreamName, the results are ordered by log stream name. If the value is LastEventTime, the results are ordered by the event time. The default value is LogStreamName. If you order the results by event time, you cannot specify the logStreamNamePrefix parameter.  lastEventTimestamp represents the time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimestamp updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but in rare situations might take longer.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object DescribeLogStreamsRequest {
  
  inline def apply(): DescribeLogStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogStreamsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLogStreamsRequest] (val x: Self) extends AnyVal {
    
    inline def setDescending(value: Descending): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLogGroupIdentifierUndefined: Self = StObject.set(x, "logGroupIdentifier", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setLogStreamNamePrefix(value: LogStreamName): Self = StObject.set(x, "logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefixUndefined: Self = StObject.set(x, "logStreamNamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
