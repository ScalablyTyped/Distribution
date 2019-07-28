package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibEntitiesColDefMod.AbstractColDef
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "CssClassApplier")
@js.native
class CssClassApplier ()
  extends typings.agDashGrid.distLibHeaderRenderingCssClassApplierMod.CssClassApplier

/* static members */
@JSImport("ag-grid", "CssClassApplier")
@js.native
object CssClassApplier extends js.Object {
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
  ): Unit = js.native
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    columnGroup: typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
  ): Unit = js.native
}

