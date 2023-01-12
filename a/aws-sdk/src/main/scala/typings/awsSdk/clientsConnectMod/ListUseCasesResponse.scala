package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUseCasesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The use cases.
    */
  var UseCaseSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.UseCaseSummaryList] = js.undefined
}
object ListUseCasesResponse {
  
  inline def apply(): ListUseCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUseCasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUseCasesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUseCaseSummaryList(value: UseCaseSummaryList): Self = StObject.set(x, "UseCaseSummaryList", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSummaryListUndefined: Self = StObject.set(x, "UseCaseSummaryList", js.undefined)
    
    inline def setUseCaseSummaryListVarargs(value: UseCase*): Self = StObject.set(x, "UseCaseSummaryList", js.Array(value*))
  }
}
