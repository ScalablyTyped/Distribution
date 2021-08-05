package typings.agGrid

import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.componentMod.Component
import typings.agGrid.dragAndDropServiceMod.DragItem
import typings.agGrid.dragAndDropServiceMod.DropTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerGroupWrapperCompMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupWrapperComp", "HeaderGroupWrapperComp")
  @js.native
  class HeaderGroupWrapperComp protected () extends Component {
    def this(columnGroup: ColumnGroup, dragSourceDropTarget: DropTarget, pinned: String) = this()
    
    /* private */ def addAttributes(): js.Any = js.native
    
    /* private */ def addClasses(): js.Any = js.native
    
    /* private */ def addListenersToChildrenColumns(): js.Any = js.native
    
    /* private */ def afterHeaderCompCreated(displayName: js.Any, headerGroupComp: js.Any): js.Any = js.native
    
    /* private */ def appendHeaderGroupComp(displayName: js.Any): js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var childColumnsDestroyFuncs: js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ val columnGroup: js.Any = js.native
    
    /* private */ var componentRecipes: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def destroyListenersOnChildrenColumns(): js.Any = js.native
    
    /* private */ var dragAndDropService: js.Any = js.native
    
    /* private */ val dragSourceDropTarget: js.Any = js.native
    
    /* private */ var eHeaderCellResize: js.Any = js.native
    
    def getDragItemForGroup(): DragItem = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var horizontalResizeService: js.Any = js.native
    
    /* private */ def isSuppressMoving(): js.Any = js.native
    
    /* private */ def normaliseDragChange(dragChange: js.Any): js.Any = js.native
    
    /* private */ def onColumnMovingChanged(): js.Any = js.native
    
    /* private */ def onDisplayedChildrenChanged(): js.Any = js.native
    
    def onResizeStart(shiftKey: Boolean): Unit = js.native
    
    def onResizing(finished: Boolean, resizeAmount: js.Any): Unit = js.native
    
    /* private */ def onWidthChanged(): js.Any = js.native
    
    /* private */ val pinned: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ var resizeCols: js.Any = js.native
    
    /* private */ var resizeRatios: js.Any = js.native
    
    /* private */ var resizeStartWidth: js.Any = js.native
    
    /* private */ var resizeTakeFromCols: js.Any = js.native
    
    /* private */ var resizeTakeFromRatios: js.Any = js.native
    
    /* private */ var resizeTakeFromStartWidth: js.Any = js.native
    
    /* private */ def setupMove(eHeaderGroup: js.Any, displayName: js.Any): js.Any = js.native
    
    /* private */ def setupMovingCss(): js.Any = js.native
    
    /* private */ def setupResize(): js.Any = js.native
    
    /* private */ def setupTooltip(): js.Any = js.native
    
    /* private */ def setupWidth(): js.Any = js.native
  }
  /* static members */
  object HeaderGroupWrapperComp {
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupWrapperComp", "HeaderGroupWrapperComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupWrapperComp", "HeaderGroupWrapperComp.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
