package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NextToken] = js.undefined
  
  /**
    *  The list of ServiceSummary objects. 
    */
  var ServiceSummaryList: js.UndefOr[ServiceSummaries] = js.undefined
}
object ListServicesResponse {
  
  inline def apply(): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServicesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceSummaryList(value: ServiceSummaries): Self = StObject.set(x, "ServiceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setServiceSummaryListUndefined: Self = StObject.set(x, "ServiceSummaryList", js.undefined)
    
    inline def setServiceSummaryListVarargs(value: ServiceSummary*): Self = StObject.set(x, "ServiceSummaryList", js.Array(value*))
  }
}
