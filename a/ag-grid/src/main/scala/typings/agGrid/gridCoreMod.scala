package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.loggerMod.LoggerFactory
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridCoreMod {
  
  @JSImport("ag-grid/dist/lib/gridCore", "GridCore")
  @js.native
  class GridCore () extends Component {
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ def addRtlSupport(): js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ var doingVirtualPaging: js.Any = js.native
    
    /* private */ var eGridDiv: js.Any = js.native
    
    /* private */ var eRootWrapperBody: js.Any = js.native
    
    def ensureNodeVisible(comparator: js.Any): Unit = js.native
    def ensureNodeVisible(comparator: js.Any, position: String): Unit = js.native
    
    /* private */ var enterprise: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var filterManager: js.Any = js.native
    
    /* private */ var finished: js.Any = js.native
    
    /* private */ var focusedCellController: js.Any = js.native
    
    /* private */ var frameworkFactory: js.Any = js.native
    
    def getPreferredWidth(): Double = js.native
    
    def getRootGui(): HTMLElement = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptions: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    @JSName("init")
    def init_MGridCore(): Unit = js.native
    
    def isToolPanelShowing(): Boolean = js.native
    
    /* private */ var logger: js.Any = js.native
    
    var loggerFactory: LoggerFactory = js.native
    
    /* private */ def onGridSizeChanged(): js.Any = js.native
    
    /* private */ var pivotCompFactory: js.Any = js.native
    
    /* private */ var popupService: js.Any = js.native
    
    /* private */ var quickFilterOnScope: js.Any = js.native
    
    /* private */ var rowGroupCompFactory: js.Any = js.native
    
    /* private */ var rowModel: js.Any = js.native
    
    /* private */ var rowRenderer: js.Any = js.native
    
    def showToolPanel(show: js.Any): Unit = js.native
    
    /* private */ var statusBar: js.Any = js.native
    
    /* private */ var toolPanelComp: js.Any = js.native
  }
  /* static members */
  object GridCore {
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore.TEMPLATE_ENTERPRISE")
    @js.native
    def TEMPLATE_ENTERPRISE: js.Any = js.native
    inline def TEMPLATE_ENTERPRISE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE_ENTERPRISE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore.TEMPLATE_NORMAL")
    @js.native
    def TEMPLATE_NORMAL: js.Any = js.native
    inline def TEMPLATE_NORMAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE_NORMAL")(x.asInstanceOf[js.Any])
  }
}
