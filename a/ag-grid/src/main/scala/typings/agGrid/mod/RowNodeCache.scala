package typings.agGrid.mod

import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: typings.agGrid.rowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends typings.agGrid.rowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}
/* static members */
@JSImport("ag-grid", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  
  var EVENT_CACHE_UPDATED: String = js.native
}
