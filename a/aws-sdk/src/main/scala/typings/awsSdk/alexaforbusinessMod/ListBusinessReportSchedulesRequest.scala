package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBusinessReportSchedulesRequest extends StObject {
  
  /**
    * The maximum number of schedules listed in the call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListBusinessReportSchedulesRequest {
  
  @scala.inline
  def apply(): ListBusinessReportSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
  }
  
  @scala.inline
  implicit class ListBusinessReportSchedulesRequestMutableBuilder[Self <: ListBusinessReportSchedulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
