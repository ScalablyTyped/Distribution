package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noRowsOverlayComponentMod {
  
  @JSImport("ag-grid/dist/lib/rendering/overlays/noRowsOverlayComponent", "NoRowsOverlayComponent")
  @js.native
  class NoRowsOverlayComponent () extends Component {
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MNoRowsOverlayComponent(params: INoRowsOverlayParams): Unit = js.native
  }
  /* static members */
  object NoRowsOverlayComponent {
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/noRowsOverlayComponent", "NoRowsOverlayComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/noRowsOverlayComponent", "NoRowsOverlayComponent.DEFAULT_NO_ROWS_TEMPLATE")
    @js.native
    def DEFAULT_NO_ROWS_TEMPLATE: js.Any = js.native
    @scala.inline
    def DEFAULT_NO_ROWS_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_NO_ROWS_TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  type INoRowsOverlayComp = IComponent[INoRowsOverlayParams]
  
  @js.native
  trait INoRowsOverlayParams extends StObject
}
