package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelScheduleResponse extends StObject {
  
  /**
    * A list of schedule entries for the channel.
    */
  var Items: js.UndefOr[listOfScheduleEntry] = js.undefined
  
  /**
    * Pagination token returned by the list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[_String] = js.undefined
}
object GetChannelScheduleResponse {
  
  inline def apply(): GetChannelScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelScheduleResponse]
  }
  
  extension [Self <: GetChannelScheduleResponse](x: Self) {
    
    inline def setItems(value: listOfScheduleEntry): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ScheduleEntry*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: _String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
