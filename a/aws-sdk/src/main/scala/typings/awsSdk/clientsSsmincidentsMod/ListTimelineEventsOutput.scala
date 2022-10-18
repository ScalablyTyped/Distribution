package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTimelineEventsOutput extends StObject {
  
  /**
    * Details about each event that occurred during the incident.
    */
  var eventSummaries: EventSummaryList
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListTimelineEventsOutput {
  
  inline def apply(eventSummaries: EventSummaryList): ListTimelineEventsOutput = {
    val __obj = js.Dynamic.literal(eventSummaries = eventSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTimelineEventsOutput]
  }
  
  extension [Self <: ListTimelineEventsOutput](x: Self) {
    
    inline def setEventSummaries(value: EventSummaryList): Self = StObject.set(x, "eventSummaries", value.asInstanceOf[js.Any])
    
    inline def setEventSummariesVarargs(value: EventSummary*): Self = StObject.set(x, "eventSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
