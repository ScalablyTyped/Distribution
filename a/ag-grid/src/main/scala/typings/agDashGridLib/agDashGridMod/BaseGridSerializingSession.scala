package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends agDashGridLib.distLibGridSerializerMod.BaseGridSerializingSession[T] {
  def this(columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper) = this()
  def this(columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper, processCellCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, 
      java.lang.String
    ]) = this()
  def this(columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper, processCellCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, 
      java.lang.String
    ], processHeaderCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams, 
      java.lang.String
    ]) = this()
  def this(columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper, processCellCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams, 
      java.lang.String
    ], processHeaderCallback: js.Function1[
      /* params */ agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams, 
      java.lang.String
    ], cellAndHeaderEscaper: js.Function1[/* rawValue */ java.lang.String, java.lang.String]) = this()
}

