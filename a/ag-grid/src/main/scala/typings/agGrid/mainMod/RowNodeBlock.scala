package typings.agGrid.mainMod

import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "RowNodeBlock")
@js.native
abstract class RowNodeBlock protected ()
  extends typings.agGrid.rowNodeBlockMod.RowNodeBlock {
  protected def this(blockNumber: Double, rowNodeCacheParams: RowNodeCacheParams) = this()
}
/* static members */
object RowNodeBlock {
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock.EVENT_LOAD_COMPLETE")
  @js.native
  def EVENT_LOAD_COMPLETE: String = js.native
  @scala.inline
  def EVENT_LOAD_COMPLETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LOAD_COMPLETE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock.STATE_DIRTY")
  @js.native
  def STATE_DIRTY: String = js.native
  @scala.inline
  def STATE_DIRTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_DIRTY")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock.STATE_FAILED")
  @js.native
  def STATE_FAILED: String = js.native
  @scala.inline
  def STATE_FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_FAILED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock.STATE_LOADED")
  @js.native
  def STATE_LOADED: String = js.native
  @scala.inline
  def STATE_LOADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADED")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "RowNodeBlock.STATE_LOADING")
  @js.native
  def STATE_LOADING: String = js.native
  @scala.inline
  def STATE_LOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADING")(x.asInstanceOf[js.Any])
}
