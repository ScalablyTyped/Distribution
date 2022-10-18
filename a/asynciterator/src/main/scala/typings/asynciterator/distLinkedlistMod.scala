package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLinkedlistMod {
  
  @JSImport("asynciterator/dist/linkedlist", "LinkedList")
  @js.native
  open class LinkedList[V] () extends StObject {
    
    /* private */ var _head: Any = js.native
    
    /* private */ var _length: Any = js.native
    
    /* private */ var _tail: Any = js.native
    
    def clear(): Unit = js.native
    
    def empty: Boolean = js.native
    
    def first: js.UndefOr[V] = js.native
    
    def last: js.UndefOr[V] = js.native
    
    def length: Double = js.native
    
    def push(value: V): Unit = js.native
    
    def shift(): js.UndefOr[V] = js.native
  }
}
