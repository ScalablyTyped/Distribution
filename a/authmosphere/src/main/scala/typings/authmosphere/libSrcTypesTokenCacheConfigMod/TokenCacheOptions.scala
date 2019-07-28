package typings.authmosphere.libSrcTypesTokenCacheConfigMod

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheOptions extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
}

object TokenCacheOptions {
  @scala.inline
  def apply(cacheConfig: CacheConfig = null, logger: Logger = null): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[TokenCacheOptions]
  }
}

