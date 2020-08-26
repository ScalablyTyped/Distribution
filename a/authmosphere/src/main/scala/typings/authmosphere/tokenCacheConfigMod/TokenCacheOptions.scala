package typings.authmosphere.tokenCacheConfigMod

import typings.authmosphere.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenCacheOptions extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig] = js.native
  var logger: js.UndefOr[Logger] = js.native
}

object TokenCacheOptions {
  @scala.inline
  def apply(): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCacheOptions]
  }
  @scala.inline
  implicit class TokenCacheOptionsOps[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
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
    def setCacheConfig(value: CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheConfig: Self = this.set("cacheConfig", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
  
}

