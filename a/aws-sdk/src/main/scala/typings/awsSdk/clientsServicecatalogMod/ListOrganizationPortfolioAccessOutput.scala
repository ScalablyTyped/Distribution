package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationPortfolioAccessOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.OrganizationNodes] = js.undefined
}
object ListOrganizationPortfolioAccessOutput {
  
  inline def apply(): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
  
  extension [Self <: ListOrganizationPortfolioAccessOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setOrganizationNodes(value: OrganizationNodes): Self = StObject.set(x, "OrganizationNodes", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodesUndefined: Self = StObject.set(x, "OrganizationNodes", js.undefined)
    
    inline def setOrganizationNodesVarargs(value: OrganizationNode*): Self = StObject.set(x, "OrganizationNodes", js.Array(value*))
  }
}
