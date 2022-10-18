package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpsItemEventsResponse extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of event information for the specified OpsItems.
    */
  var Summaries: js.UndefOr[OpsItemEventSummaries] = js.undefined
}
object ListOpsItemEventsResponse {
  
  inline def apply(): ListOpsItemEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpsItemEventsResponse]
  }
  
  extension [Self <: ListOpsItemEventsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaries(value: OpsItemEventSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    inline def setSummariesVarargs(value: OpsItemEventSummary*): Self = StObject.set(x, "Summaries", js.Array(value*))
  }
}
