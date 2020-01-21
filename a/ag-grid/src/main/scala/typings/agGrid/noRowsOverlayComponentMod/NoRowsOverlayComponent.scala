package typings.agGrid.noRowsOverlayComponentMod

import typings.agGrid.componentMod.Component
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/overlays/noRowsOverlayComponent", "NoRowsOverlayComponent")
@js.native
class NoRowsOverlayComponent () extends Component {
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  @JSName("init")
  def init_MNoRowsOverlayComponent(params: INoRowsOverlayParams): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/overlays/noRowsOverlayComponent", "NoRowsOverlayComponent")
@js.native
object NoRowsOverlayComponent extends js.Object {
  var DEFAULT_NO_ROWS_TEMPLATE: js.Any = js.native
}

