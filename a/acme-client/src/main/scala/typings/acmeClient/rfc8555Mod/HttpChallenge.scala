package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.`http-01`
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpChallenge
  extends StObject
     with ChallengeAbstract
     with Challenge {
  
  var token: String
  
  @JSName("type")
  var type_HttpChallenge: `http-01`
}
object HttpChallenge {
  
  @scala.inline
  def apply(status: pending | processing | valid | invalid, token: String, url: String): HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http-01")
    __obj.asInstanceOf[HttpChallenge]
  }
  
  @scala.inline
  implicit class HttpChallengeMutableBuilder[Self <: HttpChallenge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `http-01`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
