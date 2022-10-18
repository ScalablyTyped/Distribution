package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupEventsRequest extends StObject {
  
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the event category. If you do not specify an event category, events of the category are not returned in the response. For example, if you do not specify insight as the value of EventCategory, no Insights events are returned.
    */
  var EventCategory: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.EventCategory] = js.undefined
  
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined
  
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.MaxResults] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.NextToken] = js.undefined
  
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object LookupEventsRequest {
  
  inline def apply(): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupEventsRequest]
  }
  
  extension [Self <: LookupEventsRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEventCategory(value: EventCategory): Self = StObject.set(x, "EventCategory", value.asInstanceOf[js.Any])
    
    inline def setEventCategoryUndefined: Self = StObject.set(x, "EventCategory", js.undefined)
    
    inline def setLookupAttributes(value: LookupAttributesList): Self = StObject.set(x, "LookupAttributes", value.asInstanceOf[js.Any])
    
    inline def setLookupAttributesUndefined: Self = StObject.set(x, "LookupAttributes", js.undefined)
    
    inline def setLookupAttributesVarargs(value: LookupAttribute*): Self = StObject.set(x, "LookupAttributes", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
