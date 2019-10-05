package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRenderer
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateShowChangeCellRenderer", JSImport.Namespace)
@js.native
object distLibRenderingCellRenderersAnimateShowChangeCellRendererMod extends js.Object {
  @js.native
  class AnimateShowChangeCellRenderer ()
    extends Component
       with ICellRenderer {
    var eDelta: js.Any = js.native
    var eValue: js.Any = js.native
    var lastValue: js.Any = js.native
    var refreshCount: js.Any = js.native
    /* private */ def hideDeltaValue(): js.Any = js.native
    @JSName("init")
    def init_MAnimateShowChangeCellRenderer(params: js.Any): Unit = js.native
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    /* CompleteClass */
    override def refresh(params: js.Any): Boolean = js.native
    /* private */ def setTimerToRemoveDelta(): js.Any = js.native
    /* private */ def showDelta(params: js.Any, delta: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object AnimateShowChangeCellRenderer extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

