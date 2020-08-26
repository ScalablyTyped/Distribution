package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.`http-01`
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpChallenge
  extends ChallengeAbstract
     with Challenge {
  var token: String = js.native
  @JSName("type")
  var type_HttpChallenge: `http-01` = js.native
}

object HttpChallenge {
  @scala.inline
  def apply(status: pending | processing | valid | invalid, token: String, `type`: `http-01`, url: String): HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpChallenge]
  }
  @scala.inline
  implicit class HttpChallengeOps[Self <: HttpChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `http-01`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

