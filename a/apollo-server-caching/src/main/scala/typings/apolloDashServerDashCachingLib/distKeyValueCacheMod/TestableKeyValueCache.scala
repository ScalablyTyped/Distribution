package typings
package apolloDashServerDashCachingLib.distKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestableKeyValueCache[V] extends KeyValueCache[V] {
  var close: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.native
  var flush: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.native
}

