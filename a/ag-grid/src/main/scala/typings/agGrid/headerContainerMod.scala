package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerContainerMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/headerContainer", "HeaderContainer")
  @js.native
  class HeaderContainer protected () extends StObject {
    def this(eContainer: HTMLElement, eViewport: HTMLElement, pinned: String) = this()
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createHeaderRowComps(): js.Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var dragAndDropService: js.Any = js.native
    
    /* private */ var dropTarget: js.Any = js.native
    
    /* private */ var eContainer: js.Any = js.native
    
    /* private */ var eViewport: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* renderedHeaderElement */ Component, Unit]): Unit = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var headerRowComps: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* private */ def onColumnResized(): js.Any = js.native
    
    /* private */ def onColumnRowGroupChanged(): js.Any = js.native
    
    /* private */ def onColumnValueChanged(): js.Any = js.native
    
    /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
    
    /* private */ def onGridColumnsChanged(): js.Any = js.native
    
    /* private */ def onScrollVisibilityChanged(): js.Any = js.native
    
    /* private */ var pinned: js.Any = js.native
    
    def refresh(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ def removeHeaderRowComps(): js.Any = js.native
    
    /* private */ var scrollVisibleService: js.Any = js.native
    
    /* private */ var scrollWidth: js.Any = js.native
    
    /* private */ def setWidthOfPinnedContainer(): js.Any = js.native
    
    /* private */ def setupDragAndDrop(gridComp: js.Any): js.Any = js.native
  }
}
