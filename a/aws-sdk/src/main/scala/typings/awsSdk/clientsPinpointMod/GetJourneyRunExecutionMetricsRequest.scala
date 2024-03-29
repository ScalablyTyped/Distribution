package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJourneyRunExecutionMetricsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string
  
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the journey run.
    */
  var RunId: string
}
object GetJourneyRunExecutionMetricsRequest {
  
  inline def apply(ApplicationId: string, JourneyId: string, RunId: string): GetJourneyRunExecutionMetricsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyRunExecutionMetricsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJourneyRunExecutionMetricsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setJourneyId(value: string): Self = StObject.set(x, "JourneyId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: string): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setRunId(value: string): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
