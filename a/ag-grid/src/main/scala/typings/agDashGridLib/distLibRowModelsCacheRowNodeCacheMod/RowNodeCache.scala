package typings
package agDashGridLib.distLibRowModelsCacheRowNodeCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: agDashGridLib.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
  protected def this(cacheParams: P) = this()
  var active: js.Any = js.native
  var blockCount: js.Any = js.native
  var blocks: org.scalablytyped.runtime.StringDictionary[T] = js.native
  var cacheParams: P = js.native
  var logger: agDashGridLib.distLibLoggerMod.Logger = js.native
  var maxRowFound: js.Any = js.native
  var virtualRowCount: js.Any = js.native
  /* protected */ def checkBlockToLoad(): scala.Unit = js.native
  /* protected */ def checkVirtualRowCount(block: T, lastRow: js.Any): scala.Unit = js.native
  /* protected */ def destroyBlock(block: T): scala.Unit = js.native
  /* private */ def forEachBlockId(ids: js.Any, callback: js.Any): js.Any = js.native
  def forEachBlockInOrder(callback: js.Function2[/* block */ T, /* id */ scala.Double, scala.Unit]): scala.Unit = js.native
  /* protected */ def forEachBlockInReverseOrder(callback: js.Function2[/* block */ T, /* id */ scala.Double, scala.Unit]): scala.Unit = js.native
  def forEachNodeDeep(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ],
    sequence: agDashGridLib.distLibUtilsMod.NumberSequence
  ): scala.Unit = js.native
  /* protected */ def getBlock(blockId: java.lang.String): T = js.native
  /* protected */ def getBlock(blockId: scala.Double): T = js.native
  /* protected */ def getBlockIdsSorted(): js.Array[scala.Double] = js.native
  def getRow(rowIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getRowNodesInRange(
    firstInRange: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    lastInRange: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getVirtualRowCount(): scala.Double = js.native
  def hack_setVirtualRowCount(virtualRowCount: scala.Double): scala.Unit = js.native
  /* protected */ def init(): scala.Unit = js.native
  def isActive(): scala.Boolean = js.native
  def isMaxRowFound(): scala.Boolean = js.native
  /* protected */ def onCacheUpdated(): scala.Unit = js.native
  /* protected */ def onPageLoaded(event: js.Any): scala.Unit = js.native
  /* protected */ def postCreateBlock(newBlock: T): scala.Unit = js.native
  /* private */ def purgeBlocksIfNeeded(blockToExclude: js.Any): js.Any = js.native
  def purgeCache(): scala.Unit = js.native
  /* protected */ def removeBlockFromCache(blockToRemove: T): scala.Unit = js.native
  /* protected */ def setBlock(id: scala.Double, block: T): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double, maxRowFound: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeCache", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  var EVENT_CACHE_UPDATED: java.lang.String = js.native
}

