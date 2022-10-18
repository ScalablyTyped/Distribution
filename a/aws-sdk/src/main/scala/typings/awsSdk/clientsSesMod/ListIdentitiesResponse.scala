package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesResponse extends StObject {
  
  /**
    * A list of identities.
    */
  var Identities: IdentityList
  
  /**
    * The token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesMod.NextToken] = js.undefined
}
object ListIdentitiesResponse {
  
  inline def apply(Identities: IdentityList): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  extension [Self <: ListIdentitiesResponse](x: Self) {
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
