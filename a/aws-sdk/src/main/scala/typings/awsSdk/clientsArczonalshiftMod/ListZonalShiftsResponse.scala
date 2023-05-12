package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListZonalShiftsResponse extends StObject {
  
  /**
    * The items in the response list.
    */
  var items: js.UndefOr[ZonalShiftSummaries] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListZonalShiftsResponse {
  
  inline def apply(): ListZonalShiftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListZonalShiftsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListZonalShiftsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ZonalShiftSummaries): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ZonalShiftSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
