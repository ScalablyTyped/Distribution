package typings.awsSdk.clientsIotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * An array of objects that provide summaries of information about the web applications in the list.
    */
  var applicationSummaries: js.UndefOr[ApplicationSummaries] = js.undefined
  
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsResponse {
  
  inline def apply(): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  extension [Self <: ListApplicationsResponse](x: Self) {
    
    inline def setApplicationSummaries(value: ApplicationSummaries): Self = StObject.set(x, "applicationSummaries", value.asInstanceOf[js.Any])
    
    inline def setApplicationSummariesUndefined: Self = StObject.set(x, "applicationSummaries", js.undefined)
    
    inline def setApplicationSummariesVarargs(value: ApplicationSummary*): Self = StObject.set(x, "applicationSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
