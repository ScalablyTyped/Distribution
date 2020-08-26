package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.`dns-01`
import typings.acmeClient.acmeClientStrings.`http-01`
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.acmeClient.rfc8555Mod.HttpChallenge
  - typings.acmeClient.rfc8555Mod.DnsChallenge
*/
trait Challenge extends js.Object

object Challenge {
  @scala.inline
  def HttpChallenge(status: pending | processing | valid | invalid, token: String, `type`: `http-01`, url: String): Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Challenge]
  }
  @scala.inline
  def DnsChallenge(status: pending | processing | valid | invalid, token: String, `type`: `dns-01`, url: String): Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Challenge]
  }
}

