package typings.agGrid

import typings.agGrid.gridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/columnAnimationService", JSImport.Namespace)
@js.native
object columnAnimationServiceMod extends js.Object {
  
  @js.native
  class ColumnAnimationService () extends js.Object {
    
    var active: js.Any = js.native
    
    var animationThreadCount: js.Any = js.native
    
    /* private */ def ensureAnimationCssClassPresent(): js.Any = js.native
    
    var executeLaterFuncs: js.Any = js.native
    
    def executeLaterVMTurn(func: js.Function): Unit = js.native
    
    var executeNextFuncs: js.Any = js.native
    
    def executeNextVMTurn(func: js.Function): Unit = js.native
    
    def finish(): Unit = js.native
    
    def flush(): Unit = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    def isActive(): Boolean = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def start(): Unit = js.native
  }
}
