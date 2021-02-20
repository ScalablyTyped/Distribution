package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.expired
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorization extends StObject {
  
  var challenges: js.Array[Challenge] = js.native
  
  var expires: js.UndefOr[String] = js.native
  
  var identifier: Identifier = js.native
  
  var status: pending | valid | invalid | deactivated | expired | revoked = js.native
  
  var wildcard: js.UndefOr[Boolean] = js.native
}
object Authorization {
  
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallenges(value: js.Array[Challenge]): Self = StObject.set(x, "challenges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengesVarargs(value: Challenge*): Self = StObject.set(x, "challenges", js.Array(value :_*))
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | valid | invalid | deactivated | expired | revoked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
