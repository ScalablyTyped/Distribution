package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.groupCellRendererMod.GroupCellRendererParams
import typings.agGrid.iCellRendererMod.ICellRendererComp
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellRendererServiceMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRendererService", "CellRendererService")
  @js.native
  class CellRendererService () extends StObject {
    
    def bindToHtml(cellRendererPromise: Promise[ICellRendererComp], eTarget: HTMLElement): Promise[ICellRendererComp] = js.native
    
    var componentRecipes: js.Any = js.native
    
    var componentResolver: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def useCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    
    def useFilterCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    
    def useFullWidthGroupRowInnerCellRenderer(eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    
    def useInnerCellRenderer(target: GroupCellRendererParams, originalColumn: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
    
    def useRichSelectCellRenderer(target: ColDef, eTarget: HTMLElement, params: js.Any): Promise[ICellRendererComp] = js.native
  }
}
