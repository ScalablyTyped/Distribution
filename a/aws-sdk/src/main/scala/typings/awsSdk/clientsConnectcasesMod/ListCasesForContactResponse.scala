package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCasesForContactResponse extends StObject {
  
  /**
    * A list of Case summary information.
    */
  var cases: ListCasesForContactResponseCasesList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCasesForContactResponse {
  
  inline def apply(cases: ListCasesForContactResponseCasesList): ListCasesForContactResponse = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCasesForContactResponse]
  }
  
  extension [Self <: ListCasesForContactResponse](x: Self) {
    
    inline def setCases(value: ListCasesForContactResponseCasesList): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: CaseSummary*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
