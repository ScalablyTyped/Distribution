package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibExportParamsMod.ProcessCellForExportParams
import typings.agDashGrid.distLibExportParamsMod.ProcessHeaderForExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends typings.agDashGrid.distLibGridSerializerMod.BaseGridSerializingSession[T] {
  def this(
    columnController: typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
  ) = this()
  def this(
    columnController: typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
  ) = this()
  def this(
    columnController: typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    valueService: typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
}

