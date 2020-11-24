package typings.agGrid.rowNodeCacheMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.loggerMod.Logger
import typings.agGrid.rowNodeBlockMod.RowNodeBlock
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.utilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: RowNodeBlock */, P /* <: RowNodeCacheParams */] protected () extends BeanStub {
  protected def this(cacheParams: P) = this()
  
  var active: js.Any = js.native
  
  var blockCount: js.Any = js.native
  
  var blocks: StringDictionary[T] = js.native
  
  var cacheParams: P = js.native
  
  /* protected */ def checkBlockToLoad(): Unit = js.native
  
  /* protected */ def checkVirtualRowCount(block: T, lastRow: js.Any): Unit = js.native
  
  /* protected */ def destroyBlock(block: T): Unit = js.native
  
  /* private */ def forEachBlockId(ids: js.Any, callback: js.Any): js.Any = js.native
  
  def forEachBlockInOrder(callback: js.Function2[/* block */ T, /* id */ Double, Unit]): Unit = js.native
  
  /* protected */ def forEachBlockInReverseOrder(callback: js.Function2[/* block */ T, /* id */ Double, Unit]): Unit = js.native
  
  def forEachNodeDeep(callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit], sequence: NumberSequence): Unit = js.native
  
  /* protected */ def getBlock(blockId: String): T = js.native
  /* protected */ def getBlock(blockId: Double): T = js.native
  
  /* protected */ def getBlockIdsSorted(): js.Array[Double] = js.native
  
  def getRow(rowIndex: Double): RowNode = js.native
  
  def getRowNodesInRange(firstInRange: RowNode, lastInRange: RowNode): js.Array[RowNode] = js.native
  
  def getVirtualRowCount(): Double = js.native
  
  def hack_setVirtualRowCount(virtualRowCount: Double): Unit = js.native
  
  /* protected */ def init(): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isMaxRowFound(): Boolean = js.native
  
  var logger: Logger = js.native
  
  var maxRowFound: js.Any = js.native
  
  /* protected */ def onCacheUpdated(): Unit = js.native
  
  /* protected */ def onPageLoaded(event: js.Any): Unit = js.native
  
  /* protected */ def postCreateBlock(newBlock: T): Unit = js.native
  
  /* private */ def purgeBlocksIfNeeded(blockToExclude: js.Any): js.Any = js.native
  
  def purgeCache(): Unit = js.native
  
  /* protected */ def removeBlockFromCache(blockToRemove: T): Unit = js.native
  
  /* protected */ def setBlock(id: Double, block: T): Unit = js.native
  
  def setVirtualRowCount(rowCount: Double): Unit = js.native
  def setVirtualRowCount(rowCount: Double, maxRowFound: Boolean): Unit = js.native
  
  var virtualRowCount: js.Any = js.native
}
/* static members */
@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  
  var EVENT_CACHE_UPDATED: String = js.native
}
