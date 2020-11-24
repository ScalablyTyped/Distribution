package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/headerContainer", JSImport.Namespace)
@js.native
object headerContainerMod extends js.Object {
  
  @js.native
  class HeaderContainer protected () extends js.Object {
    def this(eContainer: HTMLElement, eViewport: HTMLElement, pinned: String) = this()
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createHeaderRowComps(): js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var dropTarget: js.Any = js.native
    
    var eContainer: js.Any = js.native
    
    var eViewport: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* renderedHeaderElement */ Component, Unit]): Unit = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var headerRowComps: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* private */ def onColumnResized(): js.Any = js.native
    
    /* private */ def onColumnRowGroupChanged(): js.Any = js.native
    
    /* private */ def onColumnValueChanged(): js.Any = js.native
    
    /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
    
    /* private */ def onGridColumnsChanged(): js.Any = js.native
    
    /* private */ def onScrollVisibilityChanged(): js.Any = js.native
    
    var pinned: js.Any = js.native
    
    def refresh(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ def removeHeaderRowComps(): js.Any = js.native
    
    var scrollVisibleService: js.Any = js.native
    
    var scrollWidth: js.Any = js.native
    
    /* private */ def setWidthOfPinnedContainer(): js.Any = js.native
    
    /* private */ def setupDragAndDrop(gridComp: js.Any): js.Any = js.native
  }
}
