package typings.agDashGrid.distLibRenderingRowCompMod

import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
@js.native
class LoadingCellRenderer () extends Component {
  var eLoadingIcon: js.Any = js.native
  var eLoadingText: js.Any = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  @JSName("init")
  def init_MLoadingCellRenderer(params: ICellRendererParams): Unit = js.native
  def refresh(params: js.Any): Boolean = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
@js.native
object LoadingCellRenderer extends js.Object {
  var TEMPLATE: js.Any = js.native
}

