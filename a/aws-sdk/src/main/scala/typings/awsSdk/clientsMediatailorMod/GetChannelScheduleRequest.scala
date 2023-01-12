package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelScheduleRequest extends StObject {
  
  /**
    * The name of the channel associated with this Channel Schedule.
    */
  var ChannelName: _String
  
  /**
    * The duration in minutes of the channel schedule.
    */
  var DurationMinutes: js.UndefOr[_String] = js.undefined
  
  /**
    * The maximum number of channel schedules that you want MediaTailor to return in response to the current request. If there are more than MaxResults channel schedules, use the value of NextToken in the response to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediatailorMod.MaxResults] = js.undefined
  
  /**
    * (Optional) If the playback configuration has more than MaxResults channel schedules, use NextToken to get the second and subsequent pages of results. For the first GetChannelScheduleRequest request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request. If the previous response didn't include a NextToken element, there are no more channel schedules to get.
    */
  var NextToken: js.UndefOr[_String] = js.undefined
}
object GetChannelScheduleRequest {
  
  inline def apply(ChannelName: _String): GetChannelScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChannelScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setDurationMinutes(value: _String): Self = StObject.set(x, "DurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setDurationMinutesUndefined: Self = StObject.set(x, "DurationMinutes", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: _String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
