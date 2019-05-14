package typings
package authmosphereLib.libSrcTypesTokenCacheConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var percentageLeft: scala.Double
}

object CacheConfig {
  @scala.inline
  def apply(percentageLeft: scala.Double): CacheConfig = {
    val __obj = js.Dynamic.literal(percentageLeft = percentageLeft)
  
    __obj.asInstanceOf[CacheConfig]
  }
}

