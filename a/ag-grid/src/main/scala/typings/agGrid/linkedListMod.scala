package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/misc/linkedList", JSImport.Namespace)
@js.native
object linkedListMod extends js.Object {
  
  @js.native
  class LinkedList[T] () extends js.Object {
    
    def add(item: T): Unit = js.native
    
    var first: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    var last: js.Any = js.native
    
    def remove(): T = js.native
  }
}
