package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.acmeClient.rfc8555Mod.HttpChallenge
  - typings.acmeClient.rfc8555Mod.DnsChallenge
*/
trait Challenge extends StObject
object Challenge {
  
  @scala.inline
  def DnsChallenge(status: pending | processing | valid | invalid, token: String, url: String): typings.acmeClient.rfc8555Mod.DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dns-01")
    __obj.asInstanceOf[typings.acmeClient.rfc8555Mod.DnsChallenge]
  }
  
  @scala.inline
  def HttpChallenge(status: pending | processing | valid | invalid, token: String, url: String): typings.acmeClient.rfc8555Mod.HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http-01")
    __obj.asInstanceOf[typings.acmeClient.rfc8555Mod.HttpChallenge]
  }
}
