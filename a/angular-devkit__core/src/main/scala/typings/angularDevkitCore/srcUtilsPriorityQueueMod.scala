package typings.angularDevkitCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsPriorityQueueMod {
  
  @JSImport("@angular-devkit/core/src/utils/priority-queue", "PriorityQueue")
  @js.native
  open class PriorityQueue[T] protected () extends StObject {
    def this(_comparator: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    
    /* private */ var _comparator: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    def clear(): Unit = js.native
    
    def peek(): js.UndefOr[T] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Unit = js.native
    
    def size: Double = js.native
    
    def toArray(): js.Array[T] = js.native
  }
}
