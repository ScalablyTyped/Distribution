package typings.agDashGrid.distLibHeaderRenderingCssClassApplierMod

import typings.agDashGrid.distLibEntitiesColDefMod.AbstractColDef
import typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", "CssClassApplier")
@js.native
class CssClassApplier () extends js.Object

/* static members */
@JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", "CssClassApplier")
@js.native
object CssClassApplier extends js.Object {
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: OriginalColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: ColumnGroup
  ): Unit = js.native
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: OriginalColumnGroup
  ): Unit = js.native
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: ColumnGroup
  ): Unit = js.native
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: GridOptionsWrapper,
    column: Column,
    columnGroup: OriginalColumnGroup
  ): Unit = js.native
}

