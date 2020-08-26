package typings.auth0.anon

import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alg extends js.Object {
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[HS256 | RS256] = js.native
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[Double] = js.native
  var scopes: js.UndefOr[js.Object] = js.native
}

object Alg {
  @scala.inline
  def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  @scala.inline
  implicit class AlgOps[Self <: Alg] (val x: Self) extends AnyVal {
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
    def setAlg(value: HS256 | RS256): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    @scala.inline
    def setLifetime_in_seconds(value: Double): Self = this.set("lifetime_in_seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime_in_seconds: Self = this.set("lifetime_in_seconds", js.undefined)
    @scala.inline
    def setScopes(value: js.Object): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

