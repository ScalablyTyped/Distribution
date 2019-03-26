package typings
package agDashGridLib.distLibRenderingRowCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
@js.native
class LoadingCellRenderer ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var eLoadingIcon: js.Any = js.native
  var eLoadingText: js.Any = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  @JSName("init")
  def init_MLoadingCellRenderer(params: agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams): scala.Unit = js.native
  def refresh(params: js.Any): scala.Boolean = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
@js.native
object LoadingCellRenderer extends js.Object {
  var TEMPLATE: js.Any = js.native
}

