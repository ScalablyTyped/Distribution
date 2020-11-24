package typings.agGrid.mod

import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends typings.agGrid.gridSerializerMod.BaseGridSerializingSession[T] {
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.UndefOr[scala.Nothing],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.UndefOr[scala.Nothing],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
  def this(
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    valueService: typings.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
}
