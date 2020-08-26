package typings.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthTokenProvider extends js.Object {
  def configure(params: OAuthTokenConfig): OAuthTokenConfig = js.native
}

object OAuthTokenProvider {
  @scala.inline
  def apply(configure: OAuthTokenConfig => OAuthTokenConfig): OAuthTokenProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[OAuthTokenProvider]
  }
  @scala.inline
  implicit class OAuthTokenProviderOps[Self <: OAuthTokenProvider] (val x: Self) extends AnyVal {
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
    def setConfigure(value: OAuthTokenConfig => OAuthTokenConfig): Self = this.set("configure", js.Any.fromFunction1(value))
  }
  
}

