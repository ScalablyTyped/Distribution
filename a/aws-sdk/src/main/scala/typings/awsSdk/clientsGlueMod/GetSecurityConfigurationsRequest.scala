package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityConfigurationsRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetSecurityConfigurationsRequest {
  
  inline def apply(): GetSecurityConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationsRequest]
  }
  
  extension [Self <: GetSecurityConfigurationsRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
