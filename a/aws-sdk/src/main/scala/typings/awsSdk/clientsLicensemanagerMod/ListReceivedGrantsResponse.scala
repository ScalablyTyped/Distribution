package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReceivedGrantsResponse extends StObject {
  
  /**
    * Received grant details.
    */
  var Grants: js.UndefOr[GrantList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReceivedGrantsResponse {
  
  inline def apply(): ListReceivedGrantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceivedGrantsResponse]
  }
  
  extension [Self <: ListReceivedGrantsResponse](x: Self) {
    
    inline def setGrants(value: GrantList): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    inline def setGrantsVarargs(value: Grant*): Self = StObject.set(x, "Grants", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
