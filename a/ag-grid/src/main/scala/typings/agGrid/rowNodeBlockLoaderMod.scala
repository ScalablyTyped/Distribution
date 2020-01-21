package typings.agGrid

import typings.agGrid.rowNodeBlockMod.RowNodeBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlockLoader", JSImport.Namespace)
@js.native
object rowNodeBlockLoaderMod extends js.Object {
  @js.native
  class RowNodeBlockLoader protected () extends js.Object {
    def this(maxConcurrentRequests: Double) = this()
    var active: js.Any = js.native
    var activeBlockLoadsCount: js.Any = js.native
    var blocks: js.Any = js.native
    var logger: js.Any = js.native
    var maxConcurrentRequests: js.Any = js.native
    def addBlock(block: RowNodeBlock): Unit = js.native
    def checkBlockToLoad(): Unit = js.native
    def destroy(): Unit = js.native
    def getBlockState(): js.Any = js.native
    def loadComplete(): Unit = js.native
    /* private */ def printCacheStatus(): js.Any = js.native
    def removeBlock(block: RowNodeBlock): Unit = js.native
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  }
  
}

