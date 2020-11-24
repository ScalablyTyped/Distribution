package typings.apolloServerCaching.keyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestableKeyValueCache[V] extends KeyValueCache[V] {
  
  var close: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  var flush: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
}
