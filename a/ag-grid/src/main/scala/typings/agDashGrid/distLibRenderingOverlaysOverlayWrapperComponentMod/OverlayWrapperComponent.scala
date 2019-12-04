package typings.agDashGrid.distLibRenderingOverlaysOverlayWrapperComponentMod

import typings.agDashGrid.distLibComponentsFrameworkComponentRecipesMod.ComponentRecipes
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.agDashGrid.distLibInterfacesIComponentMod.IComponent because Already inherited
- typings.agDashGrid.distLibRenderingOverlaysOverlayWrapperComponentMod.IOverlayWrapperComp because var conflicts: afterGuiAttached, destroy, init. Inlined showLoadingOverlay, showNoRowsOverlay, hideOverlay */ @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
@js.native
class OverlayWrapperComponent () extends Component {
  var componentRecipes: ComponentRecipes = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  @JSName("init")
  def init_MOverlayWrapperComponent(): Unit = js.native
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  /* private */ def showOverlay(eOverlayWrapper: js.Any, overlay: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
@js.native
object OverlayWrapperComponent extends js.Object {
  var LOADING_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
  var NO_ROWS_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
}

