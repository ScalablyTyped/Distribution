package typings.agDashGrid.distLibGridSerializerMod

import typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibExportParamsMod.ProcessCellForExportParams
import typings.agDashGrid.distLibExportParamsMod.ProcessHeaderForExportParams
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridSerializer", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected () extends GridSerializingSession[T] {
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
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  var columnController: ColumnController = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var valueService: ValueService = js.native
  /* CompleteClass */
  override def addCustomFooter(customFooter: T): Unit = js.native
  /**
    * ROW METHODS
    */
  /* CompleteClass */
  override def addCustomHeader(customHeader: T): Unit = js.native
  def cellAndHeaderEscaper(rawValue: String): String = js.native
  /* private */ def createValueForGroupNode(node: js.Any): js.Any = js.native
  def extractHeaderValue(column: Column): String = js.native
  def extractRowCellValue(column: Column, index: Double, `type`: String): js.Any = js.native
  def extractRowCellValue(column: Column, index: Double, `type`: String, node: RowNode): js.Any = js.native
  /* private */ def getHeaderName(callback: js.Any, column: js.Any): js.Any = js.native
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
}

