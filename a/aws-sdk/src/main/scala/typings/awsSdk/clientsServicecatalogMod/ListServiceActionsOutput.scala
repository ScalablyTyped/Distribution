package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceActionsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * An object containing information about the service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ServiceActionSummaries] = js.undefined
}
object ListServiceActionsOutput {
  
  inline def apply(): ListServiceActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsOutput]
  }
  
  extension [Self <: ListServiceActionsOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setServiceActionSummaries(value: ServiceActionSummaries): Self = StObject.set(x, "ServiceActionSummaries", value.asInstanceOf[js.Any])
    
    inline def setServiceActionSummariesUndefined: Self = StObject.set(x, "ServiceActionSummaries", js.undefined)
    
    inline def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = StObject.set(x, "ServiceActionSummaries", js.Array(value*))
  }
}
