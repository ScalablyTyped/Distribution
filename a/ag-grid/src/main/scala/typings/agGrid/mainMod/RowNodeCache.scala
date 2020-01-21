package typings.agGrid.mainMod

import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: typings.agGrid.rowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends typings.agGrid.rowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  var EVENT_CACHE_UPDATED: String = js.native
}

