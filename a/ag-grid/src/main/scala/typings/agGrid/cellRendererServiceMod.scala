package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.groupCellRendererMod.GroupCellRendererParams
import typings.agGrid.iCellRendererMod.ICellRendererComp
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererService", JSImport.Namespace)
@js.native
object cellRendererServiceMod extends js.Object {
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
  
}

