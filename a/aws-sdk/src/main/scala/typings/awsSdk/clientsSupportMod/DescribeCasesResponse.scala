package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCasesResponse extends StObject {
  
  /**
    * The details for the cases that match the request.
    */
  var cases: js.UndefOr[CaseList] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeCasesResponse {
  
  inline def apply(): DescribeCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesResponse]
  }
  
  extension [Self <: DescribeCasesResponse](x: Self) {
    
    inline def setCases(value: CaseList): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setCasesVarargs(value: CaseDetails*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
