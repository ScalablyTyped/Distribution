package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.expired
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var challenges: js.Array[Challenge]
  
  var expires: js.UndefOr[String] = js.undefined
  
  var identifier: Identifier
  
  var status: pending | valid | invalid | deactivated | expired | revoked
  
  var wildcard: js.UndefOr[Boolean] = js.undefined
}
object Authorization {
  
  inline def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  extension [Self <: Authorization](x: Self) {
    
    inline def setChallenges(value: js.Array[Challenge]): Self = StObject.set(x, "challenges", value.asInstanceOf[js.Any])
    
    inline def setChallengesVarargs(value: Challenge*): Self = StObject.set(x, "challenges", js.Array(value :_*))
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: pending | valid | invalid | deactivated | expired | revoked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
