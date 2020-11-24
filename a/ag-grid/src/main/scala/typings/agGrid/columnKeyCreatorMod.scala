package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/columnController/columnKeyCreator", JSImport.Namespace)
@js.native
object columnKeyCreatorMod extends js.Object {
  
  @js.native
  class ColumnKeyCreator () extends js.Object {
    
    var existingKeys: js.Any = js.native
    
    def getUniqueKey(colId: String, colField: String): String = js.native
  }
}
