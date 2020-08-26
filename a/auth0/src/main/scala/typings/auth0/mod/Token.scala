package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var aud: String = js.native
  var jti: String = js.native
}

object Token {
  @scala.inline
  def apply(aud: String, jti: String): Token = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], jti = jti.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
  }
  
}

