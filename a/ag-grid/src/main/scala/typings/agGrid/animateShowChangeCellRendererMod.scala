package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateShowChangeCellRenderer", JSImport.Namespace)
@js.native
object animateShowChangeCellRendererMod extends js.Object {
  
  @js.native
  class AnimateShowChangeCellRenderer ()
    extends Component
       with ICellRenderer {
    
    var eDelta: js.Any = js.native
    
    var eValue: js.Any = js.native
    
    /* private */ def hideDeltaValue(): js.Any = js.native
    
    @JSName("init")
    def init_MAnimateShowChangeCellRenderer(params: js.Any): Unit = js.native
    
    var lastValue: js.Any = js.native
    
    var refreshCount: js.Any = js.native
    
    /* private */ def setTimerToRemoveDelta(): js.Any = js.native
    
    /* private */ def showDelta(params: js.Any, delta: js.Any): js.Any = js.native
  }
  /* static members */
  @js.native
  object AnimateShowChangeCellRenderer extends js.Object {
    
    var TEMPLATE: js.Any = js.native
  }
}
