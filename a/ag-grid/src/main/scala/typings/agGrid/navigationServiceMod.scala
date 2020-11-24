package typings.agGrid

import typings.agGrid.gridPanelMod.GridPanel
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/gridPanel/navigationService", JSImport.Namespace)
@js.native
object navigationServiceMod extends js.Object {
  
  @js.native
  class NavigationService () extends js.Object {
    
    var animationFrameService: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var focusedCellController: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    def handlePageScrollingKey(event: KeyboardEvent): Boolean = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* private */ def isTimeSinceLastPageEventToRecent(): js.Any = js.native
    
    var mouseEventService: js.Any = js.native
    
    /* private */ def navigateTo(
      scrollIndex: js.Any,
      scrollType: js.Any,
      scrollColumn: js.Any,
      focusIndex: js.Any,
      focusColumn: js.Any
    ): js.Any = js.native
    
    /* private */ def onCtrlLeftOrRight(key: js.Any, gridCell: js.Any): js.Any = js.native
    
    /* private */ def onCtrlUpOrDown(key: js.Any, gridCell: js.Any): js.Any = js.native
    
    /* private */ def onHomeOrEndKey(key: js.Any): js.Any = js.native
    
    /* private */ def onPageDown(gridCell: js.Any): js.Any = js.native
    
    /* private */ def onPageUp(gridCell: js.Any): js.Any = js.native
    
    var paginationProxy: js.Any = js.native
    
    var rangeController: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    var scrollWidth: js.Any = js.native
    
    /* private */ def setTimeLastPageEventProcessed(): js.Any = js.native
    
    var timeLastPageEventProcessed: js.Any = js.native
  }
}
