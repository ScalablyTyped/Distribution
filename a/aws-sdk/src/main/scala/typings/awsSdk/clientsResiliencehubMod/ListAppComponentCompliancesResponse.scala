package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppComponentCompliancesResponse extends StObject {
  
  /**
    * The compliances for an Resilience Hub Application Component, returned as an object. This object contains the names of the Application Components, compliances, costs, resiliency scores, outage scores, and more.
    */
  var componentCompliances: ComponentCompliancesList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppComponentCompliancesResponse {
  
  inline def apply(componentCompliances: ComponentCompliancesList): ListAppComponentCompliancesResponse = {
    val __obj = js.Dynamic.literal(componentCompliances = componentCompliances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppComponentCompliancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppComponentCompliancesResponse] (val x: Self) extends AnyVal {
    
    inline def setComponentCompliances(value: ComponentCompliancesList): Self = StObject.set(x, "componentCompliances", value.asInstanceOf[js.Any])
    
    inline def setComponentCompliancesVarargs(value: AppComponentCompliance*): Self = StObject.set(x, "componentCompliances", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
