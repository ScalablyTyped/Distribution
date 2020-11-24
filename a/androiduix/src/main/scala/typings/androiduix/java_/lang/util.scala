package typings.androiduix.java_.lang

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("java.lang.util")
@js.native
object util extends js.Object {
  
  @js.native
  object concurrent extends js.Object {
    
    @js.native
    trait CopyOnWriteArrayList[T] extends js.Object {
      
      def add(items: T*): Unit = js.native
      
      def addAll(array: CopyOnWriteArrayList[T]): Unit = js.native
      
      /* private */ def checkNewData(): js.Any = js.native
      
      var isDataNew: js.Any = js.native
      
      def iterator(): js.Array[T] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator_FCopyOnWriteArrayList: js.Function0[IterableIterator[T]] = js.native
      
      var mData: js.Any = js.native
      
      def remove(item: T): Unit = js.native
      
      def size(): Double = js.native
    }
  }
}
