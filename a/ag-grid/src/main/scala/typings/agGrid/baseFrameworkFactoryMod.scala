package typings.agGrid

import typings.agGrid.anon.Instantiable
import typings.agGrid.anon.InstantiableICellEditorComp
import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.anon.InstantiableIFilterComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.gridOptionsMod.GridOptions
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseFrameworkFactoryMod {
  
  @JSImport("ag-grid/dist/lib/baseFrameworkFactory", "BaseFrameworkFactory")
  @js.native
  class BaseFrameworkFactory () extends IFrameworkFactory {
    
    def colDefCellEditor(colDef: ColDef): InstantiableICellEditorComp | String = js.native
    
    def colDefCellRenderer(colDef: ColDef): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def colDefFilter(colDef: ColDef): InstantiableIFilterComp | String = js.native
    
    def colDefFloatingCellRenderer(colDef: ColDef): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def dateComponent(gridOptions: GridOptions): Instantiable = js.native
    
    def gridOptionsFullWidthCellRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def gridOptionsGroupRowInnerRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def gridOptionsGroupRowRenderer(gridOptions: GridOptions): InstantiableICellRendererComp | ICellRendererFunc | String = js.native
    
    def setTimeout(action: js.Any): Unit = js.native
    def setTimeout(action: js.Any, timeout: js.Any): Unit = js.native
  }
}
