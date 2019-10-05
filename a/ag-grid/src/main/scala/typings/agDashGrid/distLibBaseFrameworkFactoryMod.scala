package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesGridOptionsMod.GridOptions
import typings.agDashGrid.distLibInterfacesIFrameworkFactoryMod.IFrameworkFactory
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/baseFrameworkFactory", JSImport.Namespace)
@js.native
object distLibBaseFrameworkFactoryMod extends js.Object {
  @js.native
  class BaseFrameworkFactory () extends IFrameworkFactory {
    def colDefCellEditor(colDef: ColDef): Anon_ICellEditorComp | String = js.native
    def colDefCellRenderer(colDef: ColDef): Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    def colDefFilter(colDef: ColDef): Anon_IFilterComp | String = js.native
    def colDefFloatingCellRenderer(colDef: ColDef): Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    def dateComponent(gridOptions: GridOptions): Anon_IDateComp = js.native
    def gridOptionsFullWidthCellRenderer(gridOptions: GridOptions): Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    def gridOptionsGroupRowInnerRenderer(gridOptions: GridOptions): Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    def gridOptionsGroupRowRenderer(gridOptions: GridOptions): Anon_ICellRendererComp | ICellRendererFunc | String = js.native
    def setTimeout(action: js.Any): Unit = js.native
    def setTimeout(action: js.Any, timeout: js.Any): Unit = js.native
  }
  
}

