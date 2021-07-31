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
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ def addRtlSupport(): js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    var doingVirtualPaging: js.Any = js.native
    
    var eGridDiv: js.Any = js.native
    
    var eRootWrapperBody: js.Any = js.native
    
    def ensureNodeVisible(comparator: js.Any): Unit = js.native
    def ensureNodeVisible(comparator: js.Any, position: String): Unit = js.native
    
    var enterprise: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var filterManager: js.Any = js.native
    
    var finished: js.Any = js.native
    
    var focusedCellController: js.Any = js.native
    
    var frameworkFactory: js.Any = js.native
    
    def getPreferredWidth(): Double = js.native
    
    def getRootGui(): HTMLElement = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptions: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    @JSName("init")
    def init_MGridCore(): Unit = js.native
    
    def isToolPanelShowing(): Boolean = js.native
    
    var logger: js.Any = js.native
    
    var loggerFactory: LoggerFactory = js.native
    
    /* private */ def onGridSizeChanged(): js.Any = js.native
    
    var pivotCompFactory: js.Any = js.native
    
    var popupService: js.Any = js.native
    
    var quickFilterOnScope: js.Any = js.native
    
    var rowGroupCompFactory: js.Any = js.native
    
    var rowModel: js.Any = js.native
    
    var rowRenderer: js.Any = js.native
    
    def showToolPanel(show: js.Any): Unit = js.native
    
    var statusBar: js.Any = js.native
    
    var toolPanelComp: js.Any = js.native
  }
  /* static members */
  object GridCore {
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore.TEMPLATE_ENTERPRISE")
    @js.native
    def TEMPLATE_ENTERPRISE: js.Any = js.native
    @scala.inline
    def TEMPLATE_ENTERPRISE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE_ENTERPRISE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridCore", "GridCore.TEMPLATE_NORMAL")
    @js.native
    def TEMPLATE_NORMAL: js.Any = js.native
    @scala.inline
    def TEMPLATE_NORMAL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE_NORMAL")(x.asInstanceOf[js.Any])
  }
}
