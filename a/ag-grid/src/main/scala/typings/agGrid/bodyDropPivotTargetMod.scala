package typings.agGrid

import typings.agGrid.bodyDropTargetMod.DropListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/bodyDropPivotTarget", JSImport.Namespace)
@js.native
object bodyDropPivotTargetMod extends js.Object {
  
  @js.native
  class BodyDropPivotTarget protected () extends DropListener {
    def this(pinned: String) = this()
    
    /* private */ def clearColumnsList(): js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var columnsToAggregate: js.Any = js.native
    
    var columnsToGroup: js.Any = js.native
    
    var columnsToPivot: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var pinned: js.Any = js.native
  }
}
