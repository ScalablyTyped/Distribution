package typings.agGrid

import typings.agGrid.columnControllerMod.ColumnController
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.agGrid.exportParamsMod.ExportParams
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.valueServiceMod.ValueService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridSerializerMod {
  
  @JSImport("ag-grid/dist/lib/gridSerializer", "BaseGridSerializingSession")
  @js.native
  abstract class BaseGridSerializingSession[T] protected ()
    extends StObject
       with GridSerializingSession[T] {
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
      processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: Unit,
      processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
      processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
      cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
      processHeaderCallback: Unit,
      cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: Unit,
      processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
      cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
    ) = this()
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: Unit,
      processHeaderCallback: Unit,
      cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
    ) = this()
    
    /* CompleteClass */
    override def addCustomFooter(customFooter: T): Unit = js.native
    
    /**
      * ROW METHODS
      */
    /* CompleteClass */
    override def addCustomHeader(customHeader: T): Unit = js.native
    
    def cellAndHeaderEscaper(rawValue: String): String = js.native
    
    var columnController: ColumnController = js.native
    
    /* private */ def createValueForGroupNode(node: js.Any): js.Any = js.native
    
    def extractHeaderValue(column: Column): String = js.native
    
    def extractRowCellValue(column: Column, index: Double, `type`: String): js.Any = js.native
    def extractRowCellValue(column: Column, index: Double, `type`: String, node: RowNode): js.Any = js.native
    
    /* private */ def getHeaderName(callback: js.Any, column: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    /* CompleteClass */
    override def onNewBodyRow(): RowAccumulator = js.native
    
    /* CompleteClass */
    override def onNewHeaderGroupingRow(): RowSpanningAccumulator = js.native
    
    /* CompleteClass */
    override def onNewHeaderRow(): RowAccumulator = js.native
    
    /**
      * FINAL RESULT
      */
    /* CompleteClass */
    override def parse(): String = js.native
    
    /**
      * INITIAL METHOD
      */
    /* CompleteClass */
    override def prepare(columnsToExport: js.Array[Column]): Unit = js.native
    
    /* private */ def processCell(rowNode: js.Any, column: js.Any, value: js.Any, processCellCallback: js.Any, `type`: js.Any): js.Any = js.native
    
    def processCellCallback(params: ProcessCellForExportParams): String = js.native
    
    def processHeaderCallback(params: ProcessHeaderForExportParams): String = js.native
    
    var valueService: ValueService = js.native
  }
  
  @JSImport("ag-grid/dist/lib/gridSerializer", "GridSerializer")
  @js.native
  class GridSerializer () extends StObject {
    
    /* private */ var balancedColumnTreeBuilder: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var displayedGroupCreator: js.Any = js.native
    
    /* private */ def doAddHeaderHeader[T](gridSerializingSession: js.Any, displayedGroups: js.Any): js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var pinnedRowModel: js.Any = js.native
    
    def recursivelyAddHeaderGroups[T](displayedGroups: js.Array[ColumnGroupChild], gridSerializingSession: GridSerializingSession[T]): Unit = js.native
    
    /* private */ var rowModel: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
    def serialize[T](gridSerializingSession: GridSerializingSession[T]): String = js.native
    def serialize[T](gridSerializingSession: GridSerializingSession[T], params: ExportParams[T]): String = js.native
  }
  
  @js.native
  sealed trait RowType extends StObject
  @JSImport("ag-grid/dist/lib/gridSerializer", "RowType")
  @js.native
  object RowType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RowType & Double] = js.native
    
    @js.native
    sealed trait BODY
      extends StObject
         with RowType
    /* 2 */ val BODY: typings.agGrid.gridSerializerMod.RowType.BODY & Double = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with RowType
    /* 1 */ val HEADER: typings.agGrid.gridSerializerMod.RowType.HEADER & Double = js.native
    
    @js.native
    sealed trait HEADER_GROUPING
      extends StObject
         with RowType
    /* 0 */ val HEADER_GROUPING: typings.agGrid.gridSerializerMod.RowType.HEADER_GROUPING & Double = js.native
  }
  
  trait GridSerializingSession[T] extends StObject {
    
    def addCustomFooter(customFooter: T): Unit
    
    /**
      * ROW METHODS
      */
    def addCustomHeader(customHeader: T): Unit
    
    def onNewBodyRow(): RowAccumulator
    
    def onNewHeaderGroupingRow(): RowSpanningAccumulator
    
    def onNewHeaderRow(): RowAccumulator
    
    /**
      * FINAL RESULT
      */
    def parse(): String
    
    /**
      * INITIAL METHOD
      */
    def prepare(columnsToExport: js.Array[Column]): Unit
  }
  object GridSerializingSession {
    
    inline def apply[T](
      addCustomFooter: T => Unit,
      addCustomHeader: T => Unit,
      onNewBodyRow: () => RowAccumulator,
      onNewHeaderGroupingRow: () => RowSpanningAccumulator,
      onNewHeaderRow: () => RowAccumulator,
      parse: () => String,
      prepare: js.Array[Column] => Unit
    ): GridSerializingSession[T] = {
      val __obj = js.Dynamic.literal(addCustomFooter = js.Any.fromFunction1(addCustomFooter), addCustomHeader = js.Any.fromFunction1(addCustomHeader), onNewBodyRow = js.Any.fromFunction0(onNewBodyRow), onNewHeaderGroupingRow = js.Any.fromFunction0(onNewHeaderGroupingRow), onNewHeaderRow = js.Any.fromFunction0(onNewHeaderRow), parse = js.Any.fromFunction0(parse), prepare = js.Any.fromFunction1(prepare))
      __obj.asInstanceOf[GridSerializingSession[T]]
    }
    
    extension [Self <: GridSerializingSession[?], T](x: Self & GridSerializingSession[T]) {
      
      inline def setAddCustomFooter(value: T => Unit): Self = StObject.set(x, "addCustomFooter", js.Any.fromFunction1(value))
      
      inline def setAddCustomHeader(value: T => Unit): Self = StObject.set(x, "addCustomHeader", js.Any.fromFunction1(value))
      
      inline def setOnNewBodyRow(value: () => RowAccumulator): Self = StObject.set(x, "onNewBodyRow", js.Any.fromFunction0(value))
      
      inline def setOnNewHeaderGroupingRow(value: () => RowSpanningAccumulator): Self = StObject.set(x, "onNewHeaderGroupingRow", js.Any.fromFunction0(value))
      
      inline def setOnNewHeaderRow(value: () => RowAccumulator): Self = StObject.set(x, "onNewHeaderRow", js.Any.fromFunction0(value))
      
      inline def setParse(value: () => String): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
      
      inline def setPrepare(value: js.Array[Column] => Unit): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RowAccumulator extends StObject {
    
    def onColumn(column: Column, index: Double): Unit = js.native
    def onColumn(column: Column, index: Double, node: RowNode): Unit = js.native
  }
  
  trait RowSpanningAccumulator extends StObject {
    
    def onColumn(header: String, index: Double, span: Double): Unit
  }
  object RowSpanningAccumulator {
    
    inline def apply(onColumn: (String, Double, Double) => Unit): RowSpanningAccumulator = {
      val __obj = js.Dynamic.literal(onColumn = js.Any.fromFunction3(onColumn))
      __obj.asInstanceOf[RowSpanningAccumulator]
    }
    
    extension [Self <: RowSpanningAccumulator](x: Self) {
      
      inline def setOnColumn(value: (String, Double, Double) => Unit): Self = StObject.set(x, "onColumn", js.Any.fromFunction3(value))
    }
  }
}
