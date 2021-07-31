package typings.agGrid

import typings.agGrid.infiniteCacheMod.InfiniteCacheParams
import typings.agGrid.rowNodeBlockMod.RowNodeBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteBlockMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteBlock", "InfiniteBlock")
  @js.native
  class InfiniteBlock protected () extends RowNodeBlock {
    def this(pageNumber: Double, params: InfiniteCacheParams) = this()
    
    var cacheParams: js.Any = js.native
    
    var context: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* protected */ def init(): Unit = js.native
    
    var rowRenderer: js.Any = js.native
    
    /* private */ def setIndexAndTopOnRowNode(rowNode: js.Any, rowIndex: js.Any): js.Any = js.native
  }
}
