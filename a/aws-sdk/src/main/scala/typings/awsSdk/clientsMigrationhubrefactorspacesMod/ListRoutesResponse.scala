package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutesResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NextToken] = js.undefined
  
  /**
    * The list of RouteSummary objects. 
    */
  var RouteSummaryList: js.UndefOr[RouteSummaries] = js.undefined
}
object ListRoutesResponse {
  
  inline def apply(): ListRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRoutesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRouteSummaryList(value: RouteSummaries): Self = StObject.set(x, "RouteSummaryList", value.asInstanceOf[js.Any])
    
    inline def setRouteSummaryListUndefined: Self = StObject.set(x, "RouteSummaryList", js.undefined)
    
    inline def setRouteSummaryListVarargs(value: RouteSummary*): Self = StObject.set(x, "RouteSummaryList", js.Array(value*))
  }
}
