package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateSlideCellRendererMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer")
  @js.native
  class AnimateSlideCellRenderer ()
    extends Component
       with ICellRenderer {
    
    def addSlideAnimation(): Unit = js.native
    
    /* private */ var eCurrent: js.Any = js.native
    
    /* private */ var ePrevious: js.Any = js.native
    
    @JSName("init")
    def init_MAnimateSlideCellRenderer(params: js.Any): Unit = js.native
    
    /* private */ var lastValue: js.Any = js.native
    
    /* private */ var params: js.Any = js.native
    
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    /* CompleteClass */
    override def refresh(params: js.Any): Boolean = js.native
    
    /* private */ var refreshCount: js.Any = js.native
  }
  /* static members */
  object AnimateSlideCellRenderer {
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", "AnimateSlideCellRenderer.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
