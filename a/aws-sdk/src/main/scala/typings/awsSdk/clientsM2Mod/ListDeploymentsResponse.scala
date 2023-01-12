package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsResponse extends StObject {
  
  /**
    * The list of deployments that is returned.
    */
  var deployments: DeploymentList
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentsResponse {
  
  inline def apply(deployments: DeploymentList): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeploymentsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeployments(value: DeploymentList): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsVarargs(value: DeploymentSummary*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
