package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventTrackersResponse extends StObject {
  
  /**
    * A list of event trackers.
    */
  var eventTrackers: js.UndefOr[EventTrackers] = js.undefined
  
  /**
    * A token for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEventTrackersResponse {
  
  inline def apply(): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
  
  extension [Self <: ListEventTrackersResponse](x: Self) {
    
    inline def setEventTrackers(value: EventTrackers): Self = StObject.set(x, "eventTrackers", value.asInstanceOf[js.Any])
    
    inline def setEventTrackersUndefined: Self = StObject.set(x, "eventTrackers", js.undefined)
    
    inline def setEventTrackersVarargs(value: EventTrackerSummary*): Self = StObject.set(x, "eventTrackers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
