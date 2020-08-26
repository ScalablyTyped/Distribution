package typings.auth0Lock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aud extends js.Object {
  var aud: String = js.native
  var exp: Double = js.native
  var iat: Double = js.native
  var iss: String = js.native
  var sub: String = js.native
}

object Aud {
  @scala.inline
  def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): Aud = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aud]
  }
  @scala.inline
  implicit class AudOps[Self <: Aud] (val x: Self) extends AnyVal {
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
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
  }
  
}

