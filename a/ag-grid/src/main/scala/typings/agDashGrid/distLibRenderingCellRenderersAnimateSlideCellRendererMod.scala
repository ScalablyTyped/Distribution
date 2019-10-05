package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRenderer
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", JSImport.Namespace)
@js.native
object distLibRenderingCellRenderersAnimateSlideCellRendererMod extends js.Object {
  @js.native
  class AnimateSlideCellRenderer ()
    extends Component
       with ICellRenderer {
    var eCurrent: js.Any = js.native
    var ePrevious: js.Any = js.native
    var lastValue: js.Any = js.native
    var params: js.Any = js.native
    var refreshCount: js.Any = js.native
    def addSlideAnimation(): Unit = js.native
    @JSName("init")
    def init_MAnimateSlideCellRenderer(params: js.Any): Unit = js.native
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    /* CompleteClass */
    override def refresh(params: js.Any): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AnimateSlideCellRenderer extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

