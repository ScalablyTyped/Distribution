package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateShowChangeCellRendererMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateShowChangeCellRenderer", "AnimateShowChangeCellRenderer")
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
    
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    /* CompleteClass */
    override def refresh(params: js.Any): Boolean = js.native
    
    var refreshCount: js.Any = js.native
    
    /* private */ def setTimerToRemoveDelta(): js.Any = js.native
    
    /* private */ def showDelta(params: js.Any, delta: js.Any): js.Any = js.native
  }
  /* static members */
  object AnimateShowChangeCellRenderer {
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateShowChangeCellRenderer", "AnimateShowChangeCellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateShowChangeCellRenderer", "AnimateShowChangeCellRenderer.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
