package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.gridPanelMod.GridPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerRootCompMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", "HeaderRootComp")
  @js.native
  class HeaderRootComp () extends Component {
    
    /* private */ def addPreventHeaderScroll(): js.Any = js.native
    
    /* private */ var autoWidthCalculator: js.Any = js.native
    
    /* private */ var centerContainer: js.Any = js.native
    
    /* private */ var childContainers: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ var eHeaderContainer: js.Any = js.native
    
    /* private */ var eHeaderViewport: js.Any = js.native
    
    /* private */ var ePinnedLeftHeader: js.Any = js.native
    
    /* private */ var ePinnedRightHeader: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* renderedHeaderElement */ Component, Unit]): Unit = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    /* private */ def onPivotModeChanged(): js.Any = js.native
    
    /* private */ var pinnedLeftContainer: js.Any = js.native
    
    /* private */ var pinnedRightContainer: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    def refreshHeader(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ var scrollVisibleService: js.Any = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setHorizontalScroll(offset: Double): Unit = js.native
    
    def setLeftVisible(visible: Boolean): Unit = js.native
    
    def setRightVisible(visible: Boolean): Unit = js.native
  }
  /* static members */
  object HeaderRootComp {
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", "HeaderRootComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", "HeaderRootComp.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
