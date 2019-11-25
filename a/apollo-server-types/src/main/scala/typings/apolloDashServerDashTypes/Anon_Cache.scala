package typings.apolloDashServerDashTypes

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: KeyValueCache[String]
}

object Anon_Cache {
  @scala.inline
  def apply(cache: KeyValueCache[String]): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

