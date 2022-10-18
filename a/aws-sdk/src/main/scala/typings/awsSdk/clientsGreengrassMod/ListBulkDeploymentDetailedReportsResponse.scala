package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBulkDeploymentDetailedReportsResponse extends StObject {
  
  /**
    * A list of the individual group deployments in the bulk deployment operation.
    */
  var Deployments: js.UndefOr[BulkDeploymentResults] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListBulkDeploymentDetailedReportsResponse {
  
  inline def apply(): ListBulkDeploymentDetailedReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
  }
  
  extension [Self <: ListBulkDeploymentDetailedReportsResponse](x: Self) {
    
    inline def setDeployments(value: BulkDeploymentResults): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: BulkDeploymentResult*): Self = StObject.set(x, "Deployments", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
