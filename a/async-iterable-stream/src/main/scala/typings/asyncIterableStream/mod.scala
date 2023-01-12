package typings.asyncIterableStream

import typings.std.AsyncIterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("async-iterable-stream", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with AsyncIterableStream[T] {
    
    /* CompleteClass */
    override def next(): js.Promise[IteratorResult[T, Any]] = js.native
    
    /* CompleteClass */
    override def `return`(): Unit = js.native
  }
  
  @js.native
  trait AsyncIterableStream[T]
    extends StObject
       with AsyncIterator[T]
       with AsyncIterable[T] {
    
    def createAsyncIterable(): AsyncIterable[T] = js.native
    def createAsyncIterable(timeout: Double): AsyncIterable[T] = js.native
    
    def createAsyncIterator(): AsyncIterator[T] = js.native
    def createAsyncIterator(timeout: Double): AsyncIterator[T] = js.native
    
    def next(timeout: Double): js.Promise[IteratorResult[T, Any]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  trait AsyncIterator[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]]
    
    def `return`(): Unit
  }
  object AsyncIterator {
    
    inline def apply[T](next: () => js.Promise[IteratorResult[T, Any]], `return`: () => Unit): AsyncIterator[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
      __obj.asInstanceOf[AsyncIterator[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncIterator[?], T] (val x: Self & AsyncIterator[T]) extends AnyVal {
      
      inline def setNext(value: () => js.Promise[IteratorResult[T, Any]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReturn(value: () => Unit): Self = StObject.set(x, "return", js.Any.fromFunction0(value))
    }
  }
}
