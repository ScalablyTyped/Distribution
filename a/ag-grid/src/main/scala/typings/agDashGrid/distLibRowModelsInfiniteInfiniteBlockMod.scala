package typings.agDashGrid

import typings.agDashGrid.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock
import typings.agDashGrid.distLibRowModelsInfiniteInfiniteCacheMod.InfiniteCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteBlock", JSImport.Namespace)
@js.native
object distLibRowModelsInfiniteInfiniteBlockMod extends js.Object {
  @js.native
  class InfiniteBlock protected () extends RowNodeBlock {
    def this(pageNumber: Double, params: InfiniteCacheParams) = this()
    var cacheParams: js.Any = js.native
    var context: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var rowRenderer: js.Any = js.native
    /* protected */ def init(): Unit = js.native
    /* private */ def setIndexAndTopOnRowNode(rowNode: js.Any, rowIndex: js.Any): js.Any = js.native
  }
  
}

