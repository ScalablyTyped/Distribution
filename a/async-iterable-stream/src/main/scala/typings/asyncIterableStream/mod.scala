package typings.asyncIterableStream

import typings.std.AsyncIterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-iterable-stream", JSImport.Namespace)
  @js.native
  abstract class ^[T] () extends AsyncIterableStream[T]
  
  @js.native
  trait AsyncIterableStream[T]
    extends AsyncIterator[T]
       with AsyncIterable[T] {
    
    def createAsyncIterable(): AsyncIterable[T] = js.native
    def createAsyncIterable(timeout: Double): AsyncIterable[T] = js.native
    
    def createAsyncIterator(): AsyncIterator[T] = js.native
    def createAsyncIterator(timeout: Double): AsyncIterator[T] = js.native
    
    def next(timeout: Double): js.Promise[IteratorResult[T, _]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  @js.native
  trait AsyncIterator[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, _]] = js.native
    
    def `return`(): Unit = js.native
  }
  object AsyncIterator {
    
    @scala.inline
    def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): AsyncIterator[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
      __obj.asInstanceOf[AsyncIterator[T]]
    }
    
    @scala.inline
    implicit class AsyncIteratorMutableBuilder[Self <: AsyncIterator[_], T] (val x: Self with AsyncIterator[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => js.Promise[IteratorResult[T, _]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReturn(value: () => Unit): Self = StObject.set(x, "return", js.Any.fromFunction0(value))
    }
  }
}
