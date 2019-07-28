package typings.agDashGrid.distLibRenderingCellRendererServiceMod

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibRenderingCellRenderersGroupCellRendererMod.GroupCellRendererParams
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererService", "CellRendererService")
@js.native
class CellRendererService () extends js.Object {
  var componentRecipes: js.Any = js.native
  var componentResolver: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def bindToHtml(cellRendererPromise: Promise[ICellRendererComp], eTarget: HTMLElement): Promise[ICellRendererComp] = js.native
  def useCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  def useFilterCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  def useFullWidthGroupRowInnerCellRenderer(eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  def useInnerCellRenderer(target: GroupCellRendererParams, originalColumn: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  def useRichSelectCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
}

