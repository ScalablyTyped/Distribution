package typings.amazonConnectStreams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expiry extends js.Object {
  val expiry: String = js.native
  val participantToken: String = js.native
}

object Expiry {
  @scala.inline
  def apply(expiry: String, participantToken: String): Expiry = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  @scala.inline
  implicit class ExpiryOps[Self <: Expiry] (val x: Self) extends AnyVal {
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
    def setExpiry(value: String): Self = this.set("expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantToken(value: String): Self = this.set("participantToken", value.asInstanceOf[js.Any])
  }
  
}

