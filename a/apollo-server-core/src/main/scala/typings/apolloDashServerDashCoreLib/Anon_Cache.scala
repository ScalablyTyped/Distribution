package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
}

object Anon_Cache {
  @scala.inline
  def apply(cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]): Anon_Cache = {
    val __obj = js.Dynamic.literal(cache = cache)
  
    __obj.asInstanceOf[Anon_Cache]
  }
}

