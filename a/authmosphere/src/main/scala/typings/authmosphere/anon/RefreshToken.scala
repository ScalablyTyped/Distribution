package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshToken extends js.Object {
  var refreshToken: String = js.native
}

object RefreshToken {
  @scala.inline
  def apply(refreshToken: String): RefreshToken = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  @scala.inline
  implicit class RefreshTokenOps[Self <: RefreshToken] (val x: Self) extends AnyVal {
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
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
  }
  
}

