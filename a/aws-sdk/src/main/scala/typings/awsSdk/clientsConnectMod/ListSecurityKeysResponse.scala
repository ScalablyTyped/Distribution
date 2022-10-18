package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityKeysResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The security keys.
    */
  var SecurityKeys: js.UndefOr[SecurityKeysList] = js.undefined
}
object ListSecurityKeysResponse {
  
  inline def apply(): ListSecurityKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityKeysResponse]
  }
  
  extension [Self <: ListSecurityKeysResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityKeys(value: SecurityKeysList): Self = StObject.set(x, "SecurityKeys", value.asInstanceOf[js.Any])
    
    inline def setSecurityKeysUndefined: Self = StObject.set(x, "SecurityKeys", js.undefined)
    
    inline def setSecurityKeysVarargs(value: SecurityKey*): Self = StObject.set(x, "SecurityKeys", js.Array(value*))
  }
}
