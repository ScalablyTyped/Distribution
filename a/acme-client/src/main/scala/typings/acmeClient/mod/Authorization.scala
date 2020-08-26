package typings.acmeClient.mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.expired
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import typings.acmeClient.rfc8555Mod.Challenge
import typings.acmeClient.rfc8555Mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization
  extends typings.acmeClient.rfc8555Mod.Authorization {
  var url: String = js.native
}

object Authorization {
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked,
    url: String
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

