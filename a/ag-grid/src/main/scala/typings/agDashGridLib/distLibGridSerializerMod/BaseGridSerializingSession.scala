package typings
package agDashGridLib.distLibGridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridSerializer", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected () extends GridSerializingSession[T] {
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
  var columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  var valueService: agDashGridLib.distLibValueServiceValueServiceMod.ValueService = js.native
  /* CompleteClass */
  override def addCustomFooter(customFooter: T): scala.Unit = js.native
  /**
    * ROW METHODS
    */
  /* CompleteClass */
  override def addCustomHeader(customHeader: T): scala.Unit = js.native
  def cellAndHeaderEscaper(rawValue: java.lang.String): java.lang.String = js.native
  /* private */ def createValueForGroupNode(node: js.Any): js.Any = js.native
  def extractHeaderValue(column: agDashGridLib.distLibEntitiesColumnMod.Column): java.lang.String = js.native
  def extractRowCellValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    index: scala.Double,
    `type`: java.lang.String
  ): js.Any = js.native
  def extractRowCellValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    index: scala.Double,
    `type`: java.lang.String,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Any = js.native
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
  override def parse(): java.lang.String = js.native
  /**
    * INITIAL METHOD
    */
  /* CompleteClass */
  override def prepare(columnsToExport: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  /* private */ def processCell(rowNode: js.Any, column: js.Any, value: js.Any, processCellCallback: js.Any, `type`: js.Any): js.Any = js.native
  def processCellCallback(params: agDashGridLib.distLibExportParamsMod.ProcessCellForExportParams): java.lang.String = js.native
  def processHeaderCallback(params: agDashGridLib.distLibExportParamsMod.ProcessHeaderForExportParams): java.lang.String = js.native
}

