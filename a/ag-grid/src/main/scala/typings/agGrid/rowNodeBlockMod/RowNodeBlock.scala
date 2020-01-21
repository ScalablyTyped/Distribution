package typings.agGrid.rowNodeBlockMod

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.utilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
@js.native
abstract class RowNodeBlock protected () extends BeanStub {
  protected def this(blockNumber: Double, rowNodeCacheParams: RowNodeCacheParams) = this()
  var beans: js.Any = js.native
  val blockNumber: js.Any = js.native
  val endRow: js.Any = js.native
  var lastAccessed: js.Any = js.native
  var rowNodeCacheParams: js.Any = js.native
  var rowNodes: js.Array[RowNode] = js.native
  val startRow: js.Any = js.native
  var state: js.Any = js.native
  var version: js.Any = js.native
  /* protected */ def createBlankRowNode(rowIndex: Double): RowNode = js.native
  /* protected */ def createRowNodes(): Unit = js.native
  /* private */ def forEachNode(callback: js.Any, sequence: js.Any, rowCount: js.Any, deep: js.Any): js.Any = js.native
  /* private */ def forEachNodeCallback(callback: js.Any, rowCount: js.Any): js.Any = js.native
  def forEachNodeDeep(
    callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit],
    sequence: NumberSequence,
    rowCount: Double
  ): Unit = js.native
  def forEachNodeShallow(
    callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit],
    sequence: NumberSequence,
    rowCount: Double
  ): Unit = js.native
  def getBlockNumber(): Double = js.native
  def getEndRow(): Double = js.native
  def getLastAccessed(): Double = js.native
  def getNodeIdPrefix(): String = js.native
  def getRow(displayIndex: Double): RowNode = js.native
  def getRowUsingLocalIndex(rowIndex: Double): RowNode = js.native
  def getRowUsingLocalIndex(rowIndex: Double, dontTouchLastAccessed: Boolean): RowNode = js.native
  def getStartRow(): Double = js.native
  def getState(): String = js.native
  def getVersion(): Double = js.native
  /* protected */ def init(beans: RowNodeBlockBeans): Unit = js.native
  def isAnyNodeOpen(rowCount: Double): Boolean = js.native
  def load(): Unit = js.native
  /* protected */ def loadFromDatasource(): Unit = js.native
  /* protected */ def pageLoadFailed(): Unit = js.native
  /* protected */ def pageLoaded(version: Double, rows: js.Array[_], lastRow: Double): Unit = js.native
  /* private */ def populateWithRowData(rows: js.Any): js.Any = js.native
  def setBlankRowNode(rowIndex: Double): RowNode = js.native
  /* protected */ def setDataAndId(rowNode: RowNode, data: js.Any, index: Double): Unit = js.native
  def setDirty(): Unit = js.native
  def setDirtyAndPurge(): Unit = js.native
  def setNewData(rowIndex: Double, dataItem: js.Any): RowNode = js.native
  def setRowNode(rowIndex: Double, rowNode: RowNode): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
@js.native
object RowNodeBlock extends js.Object {
  var EVENT_LOAD_COMPLETE: String = js.native
  var STATE_DIRTY: String = js.native
  var STATE_FAILED: String = js.native
  var STATE_LOADED: String = js.native
  var STATE_LOADING: String = js.native
}

