package typings
package agDashGridLib.distLibRowModelsCacheRowNodeBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
@js.native
abstract class RowNodeBlock protected ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
  protected def this(blockNumber: scala.Double, rowNodeCacheParams: agDashGridLib.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams) = this()
  var beans: js.Any = js.native
  val blockNumber: js.Any = js.native
  val endRow: js.Any = js.native
  var lastAccessed: js.Any = js.native
  var rowNodeCacheParams: js.Any = js.native
  var rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  val startRow: js.Any = js.native
  var state: js.Any = js.native
  var version: js.Any = js.native
  /* protected */ def createBlankRowNode(rowIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  /* protected */ def createRowNodes(): scala.Unit = js.native
  /* private */ def forEachNode(callback: js.Any, sequence: js.Any, rowCount: js.Any, deep: js.Any): js.Any = js.native
  /* private */ def forEachNodeCallback(callback: js.Any, rowCount: js.Any): js.Any = js.native
  def forEachNodeDeep(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ],
    sequence: agDashGridLib.distLibUtilsMod.NumberSequence,
    rowCount: scala.Double
  ): scala.Unit = js.native
  def forEachNodeShallow(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ],
    sequence: agDashGridLib.distLibUtilsMod.NumberSequence,
    rowCount: scala.Double
  ): scala.Unit = js.native
  def getBlockNumber(): scala.Double = js.native
  def getEndRow(): scala.Double = js.native
  def getLastAccessed(): scala.Double = js.native
  def getNodeIdPrefix(): java.lang.String = js.native
  def getRow(displayIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getRowUsingLocalIndex(rowIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getRowUsingLocalIndex(rowIndex: scala.Double, dontTouchLastAccessed: scala.Boolean): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getStartRow(): scala.Double = js.native
  def getState(): java.lang.String = js.native
  def getVersion(): scala.Double = js.native
  /* protected */ def init(beans: RowNodeBlockBeans): scala.Unit = js.native
  def isAnyNodeOpen(rowCount: scala.Double): scala.Boolean = js.native
  def load(): scala.Unit = js.native
  /* protected */ def loadFromDatasource(): scala.Unit = js.native
  /* protected */ def pageLoadFailed(): scala.Unit = js.native
  /* protected */ def pageLoaded(version: scala.Double, rows: js.Array[_], lastRow: scala.Double): scala.Unit = js.native
  /* private */ def populateWithRowData(rows: js.Any): js.Any = js.native
  def setBlankRowNode(rowIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  /* protected */ def setDataAndId(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, data: js.Any, index: scala.Double): scala.Unit = js.native
  def setDirty(): scala.Unit = js.native
  def setDirtyAndPurge(): scala.Unit = js.native
  def setNewData(rowIndex: scala.Double, dataItem: js.Any): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def setRowNode(rowIndex: scala.Double, rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
@js.native
object RowNodeBlock extends js.Object {
  var EVENT_LOAD_COMPLETE: java.lang.String = js.native
  var STATE_DIRTY: java.lang.String = js.native
  var STATE_FAILED: java.lang.String = js.native
  var STATE_LOADED: java.lang.String = js.native
  var STATE_LOADING: java.lang.String = js.native
}

