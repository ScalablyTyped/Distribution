package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsResponse extends StObject {
  
  /**
    * Returns a list of summary details for all the environments in your account. 
    */
  var environments: EnvironmentSummaryList
  
  /**
    * A pagination token that's returned when the response doesn't contain all the environments.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentsResponse {
  
  inline def apply(environments: EnvironmentSummaryList): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  extension [Self <: ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironments(value: EnvironmentSummaryList): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: EnvironmentSummary*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
