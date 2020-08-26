package typings.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthProvider extends js.Object {
  def configure(params: OAuthConfig): OAuthConfig = js.native
}

object OAuthProvider {
  @scala.inline
  def apply(configure: OAuthConfig => OAuthConfig): OAuthProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[OAuthProvider]
  }
  @scala.inline
  implicit class OAuthProviderOps[Self <: OAuthProvider] (val x: Self) extends AnyVal {
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
    def setConfigure(value: OAuthConfig => OAuthConfig): Self = this.set("configure", js.Any.fromFunction1(value))
  }
  
}

