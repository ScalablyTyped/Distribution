package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/animateSlideCellRenderer", JSImport.Namespace)
@js.native
object animateSlideCellRendererMod extends js.Object {
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
  }
  
  /* static members */
  @js.native
  object AnimateSlideCellRenderer extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

