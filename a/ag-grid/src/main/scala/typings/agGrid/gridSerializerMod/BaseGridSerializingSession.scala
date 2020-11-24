package typings.agGrid.gridSerializerMod

import typings.agGrid.columnControllerMod.ColumnController
import typings.agGrid.columnMod.Column
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.valueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
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
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: ColumnController,
    valueService: ValueService,
    gridOptionsWrapper: GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: ColumnController,
    valueService: ValueService,
    gridOptionsWrapper: GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: ColumnController,
    valueService: ValueService,
    gridOptionsWrapper: GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  
  def cellAndHeaderEscaper(rawValue: String): String = js.native
  
  var columnController: ColumnController = js.native
  
  /* private */ def createValueForGroupNode(node: js.Any): js.Any = js.native
  
  def extractHeaderValue(column: Column): String = js.native
  
  def extractRowCellValue(column: Column, index: Double, `type`: String): js.Any = js.native
  def extractRowCellValue(column: Column, index: Double, `type`: String, node: RowNode): js.Any = js.native
  
  /* private */ def getHeaderName(callback: js.Any, column: js.Any): js.Any = js.native
  
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  
  /* private */ def processCell(rowNode: js.Any, column: js.Any, value: js.Any, processCellCallback: js.Any, `type`: js.Any): js.Any = js.native
  
  def processCellCallback(params: ProcessCellForExportParams): String = js.native
  
  def processHeaderCallback(params: ProcessHeaderForExportParams): String = js.native
  
  var valueService: ValueService = js.native
}
