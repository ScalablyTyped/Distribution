package typings.authmosphere.tokenCacheConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var percentageLeft: Double
}

object CacheConfig {
  @scala.inline
  def apply(percentageLeft: Double): CacheConfig = {
    val __obj = js.Dynamic.literal(percentageLeft = percentageLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
}

