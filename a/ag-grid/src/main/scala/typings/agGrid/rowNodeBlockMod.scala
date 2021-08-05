package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.contextMod.Context
import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.rowRendererMod.RowRenderer
import typings.agGrid.utilsMod.NumberSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowNodeBlockMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
  @js.native
  abstract class RowNodeBlock protected () extends BeanStub {
    /* protected */ def this(blockNumber: Double, rowNodeCacheParams: RowNodeCacheParams) = this()
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ val blockNumber: js.Any = js.native
    
    /* protected */ def createBlankRowNode(rowIndex: Double): RowNode = js.native
    
    /* protected */ def createRowNodes(): Unit = js.native
    
    /* private */ val endRow: js.Any = js.native
    
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
    
    /* private */ var lastAccessed: js.Any = js.native
    
    def load(): Unit = js.native
    
    /* protected */ def loadFromDatasource(): Unit = js.native
    
    /* protected */ def pageLoadFailed(): Unit = js.native
    
    /* protected */ def pageLoaded(version: Double, rows: js.Array[js.Any], lastRow: Double): Unit = js.native
    
    /* private */ def populateWithRowData(rows: js.Any): js.Any = js.native
    
    /* private */ var rowNodeCacheParams: js.Any = js.native
    
    var rowNodes: js.Array[RowNode] = js.native
    
    def setBlankRowNode(rowIndex: Double): RowNode = js.native
    
    /* protected */ def setDataAndId(rowNode: RowNode, data: js.Any, index: Double): Unit = js.native
    
    def setDirty(): Unit = js.native
    
    def setDirtyAndPurge(): Unit = js.native
    
    def setNewData(rowIndex: Double, dataItem: js.Any): RowNode = js.native
    
    def setRowNode(rowIndex: Double, rowNode: RowNode): Unit = js.native
    
    /* private */ val startRow: js.Any = js.native
    
    /* private */ var state: js.Any = js.native
    
    /* private */ var version: js.Any = js.native
  }
  /* static members */
  object RowNodeBlock {
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.EVENT_LOAD_COMPLETE")
    @js.native
    def EVENT_LOAD_COMPLETE: String = js.native
    inline def EVENT_LOAD_COMPLETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LOAD_COMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_DIRTY")
    @js.native
    def STATE_DIRTY: String = js.native
    inline def STATE_DIRTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_DIRTY")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_FAILED")
    @js.native
    def STATE_FAILED: String = js.native
    inline def STATE_FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_LOADED")
    @js.native
    def STATE_LOADED: String = js.native
    inline def STATE_LOADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_LOADING")
    @js.native
    def STATE_LOADING: String = js.native
    inline def STATE_LOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADING")(x.asInstanceOf[js.Any])
  }
  
  trait LoadCompleteEvent
    extends StObject
       with AgEvent {
    
    var lastRow: Double
    
    var page: RowNodeBlock
    
    var success: Boolean
  }
  object LoadCompleteEvent {
    
    inline def apply(lastRow: Double, page: RowNodeBlock, success: Boolean, `type`: String): LoadCompleteEvent = {
      val __obj = js.Dynamic.literal(lastRow = lastRow.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadCompleteEvent]
    }
    
    extension [Self <: LoadCompleteEvent](x: Self) {
      
      inline def setLastRow(value: Double): Self = StObject.set(x, "lastRow", value.asInstanceOf[js.Any])
      
      inline def setPage(value: RowNodeBlock): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowNodeBlockBeans extends StObject {
    
    var context: Context
    
    var rowRenderer: RowRenderer
  }
  object RowNodeBlockBeans {
    
    inline def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNodeBlockBeans]
    }
    
    extension [Self <: RowNodeBlockBeans](x: Self) {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setRowRenderer(value: RowRenderer): Self = StObject.set(x, "rowRenderer", value.asInstanceOf[js.Any])
    }
  }
}
