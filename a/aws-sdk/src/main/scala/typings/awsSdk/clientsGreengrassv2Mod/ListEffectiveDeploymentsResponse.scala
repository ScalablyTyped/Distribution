package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEffectiveDeploymentsResponse extends StObject {
  
  /**
    * A list that summarizes each deployment on the core device.
    */
  var effectiveDeployments: js.UndefOr[EffectiveDeploymentsList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListEffectiveDeploymentsResponse {
  
  inline def apply(): ListEffectiveDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEffectiveDeploymentsResponse]
  }
  
  extension [Self <: ListEffectiveDeploymentsResponse](x: Self) {
    
    inline def setEffectiveDeployments(value: EffectiveDeploymentsList): Self = StObject.set(x, "effectiveDeployments", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDeploymentsUndefined: Self = StObject.set(x, "effectiveDeployments", js.undefined)
    
    inline def setEffectiveDeploymentsVarargs(value: EffectiveDeployment*): Self = StObject.set(x, "effectiveDeployments", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
