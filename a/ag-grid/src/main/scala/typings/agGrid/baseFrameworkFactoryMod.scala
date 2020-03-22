package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.gridOptionsMod.GridOptions
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/baseFrameworkFactory", JSImport.Namespace)
@js.native
object baseFrameworkFactoryMod extends js.Object {
  @js.native
  class BaseFrameworkFactory () extends IFrameworkFactory {
    def colDefCellEditor(colDef: ColDef): AnonInstantiableICellEditorComp | String = js.native
    def colDefCellRenderer(colDef: ColDef): AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    def colDefFilter(colDef: ColDef): AnonInstantiableIFilterComp | String = js.native
    def colDefFloatingCellRenderer(colDef: ColDef): AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    def dateComponent(gridOptions: GridOptions): AnonInstantiable = js.native
    def gridOptionsFullWidthCellRenderer(gridOptions: GridOptions): AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    def gridOptionsGroupRowInnerRenderer(gridOptions: GridOptions): AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    def gridOptionsGroupRowRenderer(gridOptions: GridOptions): AnonInstantiableICellRendererComp | ICellRendererFunc | String = js.native
    def setTimeout(action: js.Any): Unit = js.native
    def setTimeout(action: js.Any, timeout: js.Any): Unit = js.native
  }
  
}

