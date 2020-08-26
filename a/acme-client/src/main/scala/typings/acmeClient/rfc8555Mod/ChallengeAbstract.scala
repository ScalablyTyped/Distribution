package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeAbstract extends js.Object {
  var error: js.UndefOr[js.Object] = js.native
  var status: pending | processing | valid | invalid = js.native
  var `type`: String = js.native
  var url: String = js.native
  var validated: js.UndefOr[String] = js.native
}

object ChallengeAbstract {
  @scala.inline
  def apply(status: pending | processing | valid | invalid, `type`: String, url: String): ChallengeAbstract = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAbstract]
  }
  @scala.inline
  implicit class ChallengeAbstractOps[Self <: ChallengeAbstract] (val x: Self) extends AnyVal {
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
    def setStatus(value: pending | processing | valid | invalid): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Object): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setValidated(value: String): Self = this.set("validated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidated: Self = this.set("validated", js.undefined)
  }
  
}

