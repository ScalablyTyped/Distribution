package typings.agDashGrid.distLibRenderingOverlaysLoadingOverlayComponentMod

import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.agDashGrid.distLibRenderingOverlaysLoadingOverlayComponentMod.ILoadingOverlayComp because Already inherited */ @JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
@js.native
class LoadingOverlayComponent () extends Component {
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  @JSName("init")
  def init_MLoadingOverlayComponent(params: ILoadingOverlayParams): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/overlays/loadingOverlayComponent", "LoadingOverlayComponent")
@js.native
object LoadingOverlayComponent extends js.Object {
  var DEFAULT_LOADING_OVERLAY_TEMPLATE: js.Any = js.native
}

