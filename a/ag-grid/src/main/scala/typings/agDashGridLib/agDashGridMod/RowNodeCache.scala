package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: agDashGridLib.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock */, P /* <: agDashGridLib.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams */] protected ()
  extends agDashGridLib.distLibRowModelsCacheRowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}

/* static members */
@JSImport("ag-grid", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  var EVENT_CACHE_UPDATED: java.lang.String = js.native
}

