package typings.agGrid

import typings.agGrid.colDefMod.AbstractColDef
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.columnMod.Column
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssClassApplierMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", "CssClassApplier")
  @js.native
  class CssClassApplier () extends StObject
  /* static members */
  object CssClassApplier {
    
    @JSImport("ag-grid/dist/lib/headerRendering/cssClassApplier", "CssClassApplier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addColumnClassesFromCollDef(
      classesOrFunc: String,
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addColumnClassesFromCollDef(
      classesOrFunc: js.Array[String],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addColumnClassesFromCollDef(
      classesOrFunc: js.Function1[/* params */ js.Any, String | js.Array[String]],
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnClassesFromCollDef")(classesOrFunc.asInstanceOf[js.Any], abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHeaderClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: ColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHeaderClassesFromColDef")(abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addToolPanelClassesFromColDef(
      abstractColDef: AbstractColDef,
      eHeaderCell: HTMLElement,
      gridOptionsWrapper: GridOptionsWrapper,
      column: Column,
      columnGroup: OriginalColumnGroup
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToolPanelClassesFromColDef")(abstractColDef.asInstanceOf[js.Any], eHeaderCell.asInstanceOf[js.Any], gridOptionsWrapper.asInstanceOf[js.Any], column.asInstanceOf[js.Any], columnGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
