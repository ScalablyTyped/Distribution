package typings
package agDashGridLib.distLibBaseFrameworkFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/baseFrameworkFactory", "BaseFrameworkFactory")
@js.native
class BaseFrameworkFactory ()
  extends agDashGridLib.distLibInterfacesIFrameworkFactoryMod.IFrameworkFactory {
  def colDefCellEditor(colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef): agDashGridLib.Anon_ICellEditorComp | java.lang.String = js.native
  def colDefCellRenderer(colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef): agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  def colDefFilter(colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef): agDashGridLib.Anon_IFilterComp | java.lang.String = js.native
  def colDefFloatingCellRenderer(colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef): agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  def dateComponent(gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions): agDashGridLib.Anon_IDateComp = js.native
  def gridOptionsFullWidthCellRenderer(gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions): agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  def gridOptionsGroupRowInnerRenderer(gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions): agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  def gridOptionsGroupRowRenderer(gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions): agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String = js.native
  def setTimeout(action: js.Any): scala.Unit = js.native
  def setTimeout(action: js.Any, timeout: js.Any): scala.Unit = js.native
}

