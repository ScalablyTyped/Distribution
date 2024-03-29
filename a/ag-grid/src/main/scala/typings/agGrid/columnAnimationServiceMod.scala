package typings.agGrid

import typings.agGrid.gridPanelMod.GridPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnAnimationServiceMod {
  
  @JSImport("ag-grid/dist/lib/rendering/columnAnimationService", "ColumnAnimationService")
  @js.native
  class ColumnAnimationService () extends StObject {
    
    /* private */ var active: js.Any = js.native
    
    /* private */ var animationThreadCount: js.Any = js.native
    
    /* private */ def ensureAnimationCssClassPresent(): js.Any = js.native
    
    /* private */ var executeLaterFuncs: js.Any = js.native
    
    def executeLaterVMTurn(func: js.Function): Unit = js.native
    
    /* private */ var executeNextFuncs: js.Any = js.native
    
    def executeNextVMTurn(func: js.Function): Unit = js.native
    
    def finish(): Unit = js.native
    
    def flush(): Unit = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    def isActive(): Boolean = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def start(): Unit = js.native
  }
}
