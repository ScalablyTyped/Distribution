package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * The list of ApplicationSummary objects. 
    */
  var ApplicationSummaryList: js.UndefOr[ApplicationSummaries] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NextToken] = js.undefined
}
object ListApplicationsResponse {
  
  inline def apply(): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationSummaryList(value: ApplicationSummaries): Self = StObject.set(x, "ApplicationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setApplicationSummaryListUndefined: Self = StObject.set(x, "ApplicationSummaryList", js.undefined)
    
    inline def setApplicationSummaryListVarargs(value: ApplicationSummary*): Self = StObject.set(x, "ApplicationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
