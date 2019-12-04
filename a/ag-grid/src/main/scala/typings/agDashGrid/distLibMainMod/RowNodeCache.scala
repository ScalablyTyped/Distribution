package typings.agDashGrid.distLibMainMod

import typings.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: typings.agDashGrid.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends typings.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  var EVENT_CACHE_UPDATED: String = js.native
}

