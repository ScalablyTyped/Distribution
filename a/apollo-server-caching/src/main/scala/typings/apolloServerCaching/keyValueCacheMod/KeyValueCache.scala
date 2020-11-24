package typings.apolloServerCaching.keyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueCache[V] extends js.Object {
  
  def delete(key: String): js.Promise[Boolean | Unit] = js.native
  
  def get(key: String): js.Promise[js.UndefOr[V]] = js.native
  
  def set(key: String, value: V): js.Promise[Unit] = js.native
  def set(key: String, value: V, options: KeyValueCacheSetOptions): js.Promise[Unit] = js.native
}
