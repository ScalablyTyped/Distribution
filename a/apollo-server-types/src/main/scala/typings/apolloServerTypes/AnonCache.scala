package typings.apolloServerTypes

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: KeyValueCache[String]
}

object AnonCache {
  @scala.inline
  def apply(cache: KeyValueCache[String]): AnonCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

