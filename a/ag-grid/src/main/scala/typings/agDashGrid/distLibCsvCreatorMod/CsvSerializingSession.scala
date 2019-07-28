package typings.agDashGrid.distLibCsvCreatorMod

import typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController
import typings.agDashGrid.distLibExportParamsMod.ProcessCellForExportParams
import typings.agDashGrid.distLibExportParamsMod.ProcessHeaderForExportParams
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibGridSerializerMod.BaseGridSerializingSession
import typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "CsvSerializingSession")
@js.native
class CsvSerializingSession protected () extends BaseGridSerializingSession[String] {
  def this(
    columnController: ColumnController,
    valueService: ValueService,
    gridOptionsWrapper: GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    suppressQuotes: Boolean,
    columnSeparator: String
  ) = this()
  var columnSeparator: js.Any = js.native
  var lineOpened: js.Any = js.native
  var result: js.Any = js.native
  var suppressQuotes: js.Any = js.native
  /* private */ def onNewBodyRowColumn(column: js.Any, index: js.Any): js.Any = js.native
  /* private */ def onNewBodyRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
  /* private */ def onNewHeaderGroupingRowColumn(header: js.Any, index: js.Any, span: js.Any): js.Any = js.native
  /* private */ def onNewHeaderRowColumn(column: js.Any, index: js.Any): js.Any = js.native
  /* private */ def onNewHeaderRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
  /* private */ def putInQuotes(value: js.Any, suppressQuotes: js.Any): js.Any = js.native
}

