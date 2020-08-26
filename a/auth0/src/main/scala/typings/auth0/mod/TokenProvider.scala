package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[Double] = js.native
  var enableCache: Boolean = js.native
}

object TokenProvider {
  @scala.inline
  def apply(enableCache: Boolean): TokenProvider = {
    val __obj = js.Dynamic.literal(enableCache = enableCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProvider]
  }
  @scala.inline
  implicit class TokenProviderOps[Self <: TokenProvider] (val x: Self) extends AnyVal {
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
    def setEnableCache(value: Boolean): Self = this.set("enableCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheTTLInSeconds(value: Double): Self = this.set("cacheTTLInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTTLInSeconds: Self = this.set("cacheTTLInSeconds", js.undefined)
  }
  
}

