package typings
package agDashGridLib.distLibRowModelsInfiniteInfiniteCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteCache", "InfiniteCache")
@js.native
class InfiniteCache protected ()
  extends agDashGridLib.distLibRowModelsCacheRowNodeCacheMod.RowNodeCache[
      agDashGridLib.distLibRowModelsInfiniteInfiniteBlockMod.InfiniteBlock, 
      InfiniteCacheParams
    ] {
  def this(params: InfiniteCacheParams) = this()
  var columnApi: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  /* private */ def createBlock(blockNumber: js.Any): js.Any = js.native
  def getRow(rowIndex: scala.Double, dontCreatePage: scala.Boolean): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  /* private */ def insertItems(block: js.Any, indexToInsert: js.Any, items: js.Any): js.Any = js.native
  def insertItemsAtIndex(indexToInsert: scala.Double, items: js.Array[_]): scala.Unit = js.native
  /* private */ def moveItemsDown(block: js.Any, moveFromIndex: js.Any, moveCount: js.Any): js.Any = js.native
  def refreshCache(): scala.Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
}

