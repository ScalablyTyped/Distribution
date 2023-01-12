package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCasesResponse extends StObject {
  
  /**
    * A list of case documents where each case contains the properties CaseId and Fields where each field is a complex union structure. 
    */
  var cases: SearchCasesResponseCasesList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchCasesResponse {
  
  inline def apply(cases: SearchCasesResponseCasesList): SearchCasesResponse = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCasesResponse] (val x: Self) extends AnyVal {
    
    inline def setCases(value: SearchCasesResponseCasesList): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: SearchCasesResponseItem*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
