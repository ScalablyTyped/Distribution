package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilesResponse extends StObject {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of security profile identifiers (names and ARNs).
    */
  var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined
}
object ListSecurityProfilesResponse {
  
  inline def apply(): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
  
  extension [Self <: ListSecurityProfilesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSecurityProfileIdentifiers(value: SecurityProfileIdentifiers): Self = StObject.set(x, "securityProfileIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIdentifiersUndefined: Self = StObject.set(x, "securityProfileIdentifiers", js.undefined)
    
    inline def setSecurityProfileIdentifiersVarargs(value: SecurityProfileIdentifier*): Self = StObject.set(x, "securityProfileIdentifiers", js.Array(value*))
  }
}
