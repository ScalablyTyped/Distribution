package typings.apolloDashServerDashCaching

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching/dist/KeyValueCache", JSImport.Namespace)
@js.native
object distKeyValueCacheMod extends js.Object {
  @js.native
  trait KeyValueCache[V] extends js.Object {
    def delete(key: String): js.Promise[Boolean | Unit] = js.native
    def get(key: String): js.Promise[js.UndefOr[V]] = js.native
    def set(key: String, value: V): js.Promise[Unit] = js.native
    def set(key: String, value: V, options: Anon_Ttl): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait TestableKeyValueCache[V] extends KeyValueCache[V] {
    var close: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    var flush: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  }
  
}

