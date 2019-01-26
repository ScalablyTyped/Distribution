package typings
package apolloDashServerDashCachingLib.distInMemoryLRUCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching/dist/InMemoryLRUCache", "InMemoryLRUCache")
@js.native
class InMemoryLRUCache[V] ()
  extends apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[V] {
  def this(hasMaxSize: apolloDashServerDashCachingLib.Anon_MaxSize) = this()
  var store: js.Any = js.native
  def flush(): js.Promise[scala.Unit] = js.native
}

