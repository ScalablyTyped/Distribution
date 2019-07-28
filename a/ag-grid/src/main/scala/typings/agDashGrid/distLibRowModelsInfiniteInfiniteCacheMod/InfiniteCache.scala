package typings.agDashGrid.distLibRowModelsInfiniteInfiniteCacheMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCache
import typings.agDashGrid.distLibRowModelsInfiniteInfiniteBlockMod.InfiniteBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteCache", "InfiniteCache")
@js.native
class InfiniteCache protected () extends RowNodeCache[InfiniteBlock, InfiniteCacheParams] {
  def this(params: InfiniteCacheParams) = this()
  var columnApi: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  /* private */ def createBlock(blockNumber: js.Any): js.Any = js.native
  def getRow(rowIndex: Double, dontCreatePage: Boolean): RowNode = js.native
  /* private */ def insertItems(block: js.Any, indexToInsert: js.Any, items: js.Any): js.Any = js.native
  def insertItemsAtIndex(indexToInsert: Double, items: js.Array[_]): Unit = js.native
  /* private */ def moveItemsDown(block: js.Any, moveFromIndex: js.Any, moveCount: js.Any): js.Any = js.native
  def refreshCache(): Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
}

