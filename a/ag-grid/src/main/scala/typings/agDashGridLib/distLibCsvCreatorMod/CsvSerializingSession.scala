package typings
package agDashGridLib.distLibCsvCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "CsvSerializingSession")
@js.native
class CsvSerializingSession protected ()
  extends agDashGridLib.distLibGridSerializerMod.BaseGridSerializingSession[java.lang.String] {
  def this(columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper, processCellCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, 
      java.lang.String
    ], processHeaderCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams, 
      java.lang.String
    ], suppressQuotes: scala.Boolean, columnSeparator: java.lang.String) = this()
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

