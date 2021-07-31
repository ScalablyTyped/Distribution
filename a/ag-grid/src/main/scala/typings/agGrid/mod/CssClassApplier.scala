package typings.agGrid.mod

import typings.agGrid.colDefMod.AbstractColDef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "CssClassApplier")
@js.native
class CssClassApplier ()
  extends typings.agGrid.cssClassApplierMod.CssClassApplier
/* static members */
object CssClassApplier {
  
  @JSImport("ag-grid", "CssClassApplier")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: String,
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Array[String],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addColumnClassesFromCollDef(
    classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addHeaderClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.columnGroupMod.ColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHeaderClassesFromColDef")(abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addToolPanelClassesFromColDef(
    abstractColDef: AbstractColDef,
    eHeaderCell: HTMLElement,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column,
    columnGroup: typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToolPanelClassesFromColDef")(abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
