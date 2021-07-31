package typings.agGrid

import typings.agGrid.cellCompMod.CellComp
import typings.agGrid.gridCellMod.GridCell
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseEventServiceMod {
  
  @JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
  @js.native
  class MouseEventService () extends StObject {
    
    var eGridDiv: js.Any = js.native
    
    def getGridCellForEvent(event: KeyboardEvent): GridCell = js.native
    def getGridCellForEvent(event: MouseEvent): GridCell = js.native
    
    def getRenderedCellForEvent(event: Event): CellComp = js.native
    
    var gridInstanceId: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    def isEventFromThisGrid(event: KeyboardEvent): Boolean = js.native
    def isEventFromThisGrid(event: MouseEvent): Boolean = js.native
    
    /* private */ def stampDomElementWithGridInstance(): js.Any = js.native
  }
  /* static members */
  object MouseEventService {
    
    @JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService.GRID_DOM_KEY")
    @js.native
    def GRID_DOM_KEY: js.Any = js.native
    @scala.inline
    def GRID_DOM_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRID_DOM_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService.gridInstanceSequence")
    @js.native
    def gridInstanceSequence: js.Any = js.native
    @scala.inline
    def gridInstanceSequence_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridInstanceSequence")(x.asInstanceOf[js.Any])
  }
}
