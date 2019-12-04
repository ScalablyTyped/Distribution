package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterParams
import typings.agDashGrid.distLibFilterFloatingFilterWrapperMod.IFloatingFilterWrapperComp
import typings.agDashGrid.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod.IHeaderGroupComp
import typings.agDashGrid.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod.IHeaderGroupParams
import typings.agDashGrid.distLibHeaderRenderingHeaderHeaderCompMod.IHeaderComp
import typings.agDashGrid.distLibHeaderRenderingHeaderHeaderCompMod.IHeaderParams
import typings.agDashGrid.distLibInterfacesIRichCellEditorParamsMod.IRichCellEditorParams
import typings.agDashGrid.distLibInterfacesISetFilterParamsMod.ISetFilterParams
import typings.agDashGrid.distLibRenderingCellRenderersGroupCellRendererMod.GroupCellRendererParams
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams
import typings.agDashGrid.distLibRenderingDateComponentMod.IDateComp
import typings.agDashGrid.distLibRenderingDateComponentMod.IDateParams
import typings.agDashGrid.distLibRenderingOverlaysLoadingOverlayComponentMod.ILoadingOverlayComp
import typings.agDashGrid.distLibRenderingOverlaysNoRowsOverlayComponentMod.INoRowsOverlayComp
import typings.agDashGrid.distLibRenderingOverlaysOverlayWrapperComponentMod.IOverlayWrapperComp
import typings.agDashGrid.distLibUtilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentRecipes", JSImport.Namespace)
@js.native
object distLibComponentsFrameworkComponentRecipesMod extends js.Object {
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

