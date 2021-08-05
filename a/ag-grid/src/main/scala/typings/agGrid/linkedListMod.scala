package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedListMod {
  
  @JSImport("ag-grid/dist/lib/misc/linkedList", "LinkedList")
  @js.native
  class LinkedList[T] () extends StObject {
    
    def add(item: T): Unit = js.native
    
    /* private */ var first: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var last: js.Any = js.native
    
    def remove(): T = js.native
  }
}
