package typings
package agDashGridLib.distLibRenderingCellRendererServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererService", "CellRendererService")
@js.native
class CellRendererService () extends js.Object {
  var componentRecipes: js.Any = js.native
  var componentResolver: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def bindToHtml(
    cellRendererPromise: agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp],
    eTarget: stdLib.HTMLElement
  ): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def useCellRenderer(target: agDashGridLib.distLibEntitiesColDefMod.ColDef, eTarget: stdLib.HTMLElement, params: js.Any): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def useFilterCellRenderer(target: agDashGridLib.distLibEntitiesColDefMod.ColDef, eTarget: stdLib.HTMLElement, params: js.Any): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def useFullWidthGroupRowInnerCellRenderer(eTarget: stdLib.HTMLElement, params: js.Any): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def useInnerCellRenderer(
    target: agDashGridLib.distLibRenderingCellRenderersGroupCellRendererMod.GroupCellRendererParams,
    originalColumn: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    eTarget: stdLib.HTMLElement,
    params: js.Any
  ): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
  def useRichSelectCellRenderer(target: agDashGridLib.distLibEntitiesColDefMod.ColDef, eTarget: stdLib.HTMLElement, params: js.Any): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp] = js.native
}

