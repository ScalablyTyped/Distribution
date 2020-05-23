package typings.apolloServerTypes.anon

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: KeyValueCache[String]
}

object Cache {
  @scala.inline
  def apply(cache: KeyValueCache[String]): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

