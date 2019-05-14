package typings
package authmosphereLib.libSrcTypesTokenCacheConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheOptions extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
  var logger: js.UndefOr[authmosphereLib.libSrcTypesLoggerMod.Logger] = js.undefined
}

object TokenCacheOptions {
  @scala.inline
  def apply(cacheConfig: CacheConfig = null, logger: authmosphereLib.libSrcTypesLoggerMod.Logger = null): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[TokenCacheOptions]
  }
}

