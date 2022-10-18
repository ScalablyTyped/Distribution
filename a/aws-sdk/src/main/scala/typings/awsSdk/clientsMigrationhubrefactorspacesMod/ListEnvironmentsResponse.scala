package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsResponse extends StObject {
  
  /**
    * The list of EnvironmentSummary objects. 
    */
  var EnvironmentSummaryList: js.UndefOr[EnvironmentSummaries] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NextToken] = js.undefined
}
object ListEnvironmentsResponse {
  
  inline def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  extension [Self <: ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironmentSummaryList(value: EnvironmentSummaries): Self = StObject.set(x, "EnvironmentSummaryList", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentSummaryListUndefined: Self = StObject.set(x, "EnvironmentSummaryList", js.undefined)
    
    inline def setEnvironmentSummaryListVarargs(value: EnvironmentSummary*): Self = StObject.set(x, "EnvironmentSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
