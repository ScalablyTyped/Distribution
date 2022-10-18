package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /**
    * Contains details on the findings in your environment.
    */
  var findings: js.UndefOr[FindingList] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFindingsResponse {
  
  inline def apply(): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  extension [Self <: ListFindingsResponse](x: Self) {
    
    inline def setFindings(value: FindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
