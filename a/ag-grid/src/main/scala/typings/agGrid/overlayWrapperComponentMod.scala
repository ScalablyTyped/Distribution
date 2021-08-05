package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.componentRecipesMod.ComponentRecipes
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayWrapperComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.overlayWrapperComponentMod.IOverlayWrapperComp because var conflicts: afterGuiAttached, destroy, init. Inlined showLoadingOverlay, showNoRowsOverlay, hideOverlay */ @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
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
  object OverlayWrapperComponent {
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent.LOADING_WRAPPER_OVERLAY_TEMPLATE")
    @js.native
    def LOADING_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
    inline def LOADING_WRAPPER_OVERLAY_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING_WRAPPER_OVERLAY_TEMPLATE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/overlays/overlayWrapperComponent", "OverlayWrapperComponent.NO_ROWS_WRAPPER_OVERLAY_TEMPLATE")
    @js.native
    def NO_ROWS_WRAPPER_OVERLAY_TEMPLATE: js.Any = js.native
    inline def NO_ROWS_WRAPPER_OVERLAY_TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_ROWS_WRAPPER_OVERLAY_TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  trait IOverlayWrapperComp
    extends StObject
       with IComponent[IOverlayWrapperParams] {
    
    def hideOverlay(eOverlayWrapper: HTMLElement): Unit
    
    def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit
    
    def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit
  }
  object IOverlayWrapperComp {
    
    inline def apply(
      getGui: () => HTMLElement,
      hideOverlay: HTMLElement => Unit,
      showLoadingOverlay: HTMLElement => Unit,
      showNoRowsOverlay: HTMLElement => Unit
    ): IOverlayWrapperComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), hideOverlay = js.Any.fromFunction1(hideOverlay), showLoadingOverlay = js.Any.fromFunction1(showLoadingOverlay), showNoRowsOverlay = js.Any.fromFunction1(showNoRowsOverlay))
      __obj.asInstanceOf[IOverlayWrapperComp]
    }
    
    extension [Self <: IOverlayWrapperComp](x: Self) {
      
      inline def setHideOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction1(value))
      
      inline def setShowLoadingOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "showLoadingOverlay", js.Any.fromFunction1(value))
      
      inline def setShowNoRowsOverlay(value: HTMLElement => Unit): Self = StObject.set(x, "showNoRowsOverlay", js.Any.fromFunction1(value))
    }
  }
  
  trait IOverlayWrapperParams extends StObject
}
