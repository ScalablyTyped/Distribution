package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.dateComponentMod.IDateComp
import typings.agGrid.dateComponentMod.IDateParams
import typings.agGrid.floatingFilterMod.IFloatingFilterParams
import typings.agGrid.floatingFilterWrapperMod.IFloatingFilterWrapperComp
import typings.agGrid.groupCellRendererMod.GroupCellRendererParams
import typings.agGrid.headerCompMod.IHeaderComp
import typings.agGrid.headerCompMod.IHeaderParams
import typings.agGrid.headerGroupCompMod.IHeaderGroupComp
import typings.agGrid.headerGroupCompMod.IHeaderGroupParams
import typings.agGrid.iCellRendererMod.ICellRendererComp
import typings.agGrid.iCellRendererMod.ICellRendererParams
import typings.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
import typings.agGrid.iSetFilterParamsMod.ISetFilterParams
import typings.agGrid.loadingOverlayComponentMod.ILoadingOverlayComp
import typings.agGrid.noRowsOverlayComponentMod.INoRowsOverlayComp
import typings.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp
import typings.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentRecipes", JSImport.Namespace)
@js.native
object componentRecipesMod extends js.Object {
  @js.native
  class ComponentRecipes () extends js.Object {
    var columnApi: js.Any = js.native
    var componentResolver: js.Any = js.native
    var filterManager: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptions: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    /* private */ def getFilterComponentPrototype[A, B](colDef: js.Any): js.Any = js.native
    def newCellRenderer(target: ColDef, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: IRichCellEditorParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newCellRenderer(target: ISetFilterParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newDateComponent(params: IDateParams): Promise[IDateComp] = js.native
    /* private */ def newEmptyFloatingFilterWrapperComponent(column: js.Any): js.Any = js.native
    def newFloatingFilterWrapperComponent[M, P /* <: IFloatingFilterParams[M, _] */](column: Column, params: IFloatingFilterParams[M, _]): IFloatingFilterWrapperComp[M, _, _, _] = js.native
    def newFullRowGroupRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newFullWidthGroupRowInnerCellRenderer(params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newHeaderComponent(params: IHeaderParams): Promise[IHeaderComp] = js.native
    def newHeaderGroupComponent(params: IHeaderGroupParams): Promise[IHeaderGroupComp] = js.native
    def newInnerCellRenderer(target: GroupCellRendererParams, params: ICellRendererParams): Promise[ICellRendererComp] = js.native
    def newLoadingOverlayComponent(): Promise[ILoadingOverlayComp] = js.native
    def newNoRowsOverlayComponent(): Promise[INoRowsOverlayComp] = js.native
    def newOverlayWrapperComponent(): IOverlayWrapperComp = js.native
  }
  
  /* static members */
  @js.native
  object ComponentRecipes extends js.Object {
    var filterToFloatingFilterNames: js.Any = js.native
  }
  
}

