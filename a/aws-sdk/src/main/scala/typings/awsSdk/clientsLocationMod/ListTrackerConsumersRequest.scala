package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrackerConsumersRequest extends StObject {
  
  /**
    * An optional limit for the number of resources returned in a single call.  Default value: 100 
    */
  var MaxResults: js.UndefOr[ListTrackerConsumersRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page.  Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The tracker resource whose associated geofence collections you want to list.
    */
  var TrackerName: ResourceName
}
object ListTrackerConsumersRequest {
  
  inline def apply(TrackerName: ResourceName): ListTrackerConsumersRequest = {
    val __obj = js.Dynamic.literal(TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrackerConsumersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTrackerConsumersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListTrackerConsumersRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
