package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateSlideCellRendererMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer")
  @js.native
  class AnimateSlideCellRenderer ()
    extends Component
       with ICellRenderer {
    
    def addSlideAnimation(): Unit = js.native
    
    var eCurrent: js.Any = js.native
    
    var ePrevious: js.Any = js.native
    
    @JSName("init")
    def init_MAnimateSlideCellRenderer(params: js.Any): Unit = js.native
    
    var lastValue: js.Any = js.native
    
    var params: js.Any = js.native
    
    var refreshCount: js.Any = js.native
  }
  /* static members */
  object AnimateSlideCellRenderer {
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
