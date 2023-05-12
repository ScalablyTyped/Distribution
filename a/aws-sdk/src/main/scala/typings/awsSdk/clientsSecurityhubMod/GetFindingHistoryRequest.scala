package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingHistoryRequest extends StObject {
  
  /**
    *  An ISO 8601-formatted timestamp that indicates the end time of the requested finding history. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format. If you provide values for both StartTime and EndTime, Security Hub returns finding history for the specified time period. If you provide a value for StartTime but not for EndTime, Security Hub returns finding history from the StartTime to the time at which the API is called. If you provide a value for EndTime but not for StartTime, Security Hub returns finding history from the CreatedAt timestamp of the finding to the EndTime. If you provide neither StartTime nor EndTime, Security Hub returns finding history from the CreatedAt timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is limited to 100 results, and the maximum time period is limited to 90 days.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  var FindingIdentifier: AwsSecurityFindingIdentifier
  
  /**
    *  The maximum number of results to be returned. If you don’t provide it, Security Hub returns up to 100 results of finding history. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    *  A token for pagination purposes. Provide NULL as the initial value. In subsequent requests, provide the token included in the response to get up to an additional 100 results of finding history. If you don’t provide NextToken, Security Hub returns up to 100 results of finding history for each request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    *  An ISO 8601-formatted timestamp that indicates the start time of the requested finding history. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format. If you provide values for both StartTime and EndTime, Security Hub returns finding history for the specified time period. If you provide a value for StartTime but not for EndTime, Security Hub returns finding history from the StartTime to the time at which the API is called. If you provide a value for EndTime but not for StartTime, Security Hub returns finding history from the CreatedAt timestamp of the finding to the EndTime. If you provide neither StartTime nor EndTime, Security Hub returns finding history from the CreatedAt timestamp of the finding to the time at which the API is called. In all of these scenarios, the response is limited to 100 results, and the maximum time period is limited to 90 days. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetFindingHistoryRequest {
  
  inline def apply(FindingIdentifier: AwsSecurityFindingIdentifier): GetFindingHistoryRequest = {
    val __obj = js.Dynamic.literal(FindingIdentifier = FindingIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingHistoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingHistoryRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFindingIdentifier(value: AwsSecurityFindingIdentifier): Self = StObject.set(x, "FindingIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
