package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelScheduleRequest extends StObject {
  
  /**
    * The identifier for the channel you are working on.
    */
  var ChannelName: string
  
  /**
    * The schedule duration in minutes. The maximum duration is 4320 minutes (three days).
    */
  var DurationMinutes: js.UndefOr[string] = js.undefined
  
  /**
    * Upper bound on number of records to return. The maximum number of results is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediatailorMod.MaxResults] = js.undefined
  
  /**
    * Pagination token from the GET list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetChannelScheduleRequest {
  
  inline def apply(ChannelName: string): GetChannelScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelScheduleRequest]
  }
  
  extension [Self <: GetChannelScheduleRequest](x: Self) {
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setDurationMinutes(value: string): Self = StObject.set(x, "DurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setDurationMinutesUndefined: Self = StObject.set(x, "DurationMinutes", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
