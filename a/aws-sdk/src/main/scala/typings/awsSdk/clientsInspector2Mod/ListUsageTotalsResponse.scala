package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsageTotalsResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var nextToken: js.UndefOr[ListUsageTotalsNextToken] = js.undefined
  
  /**
    * An object with details on the total usage for the requested account.
    */
  var totals: js.UndefOr[UsageTotalList] = js.undefined
}
object ListUsageTotalsResponse {
  
  inline def apply(): ListUsageTotalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageTotalsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsageTotalsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ListUsageTotalsNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTotals(value: UsageTotalList): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setTotalsVarargs(value: UsageTotal*): Self = StObject.set(x, "totals", js.Array(value*))
  }
}
