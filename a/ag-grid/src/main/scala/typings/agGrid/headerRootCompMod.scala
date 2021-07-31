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
    
    var autoWidthCalculator: js.Any = js.native
    
    var centerContainer: js.Any = js.native
    
    var childContainers: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    var eHeaderContainer: js.Any = js.native
    
    var eHeaderViewport: js.Any = js.native
    
    var ePinnedLeftHeader: js.Any = js.native
    
    var ePinnedRightHeader: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* renderedHeaderElement */ Component, Unit]): Unit = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    /* private */ def onPivotModeChanged(): js.Any = js.native
    
    var pinnedLeftContainer: js.Any = js.native
    
    var pinnedRightContainer: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    def refreshHeader(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    var scrollVisibleService: js.Any = js.native
    
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
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
