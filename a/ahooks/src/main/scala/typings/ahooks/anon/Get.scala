package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get[K, T] extends StObject {
  
  def get(key: K): js.UndefOr[T]
  
  def remove(key: K): Unit
  
  def reset(): Unit
  
  def set(key: K, entry: T): Unit
  
  def setAll(newMap: js.Iterable[js.Tuple2[K, T]]): Unit
}
object Get {
  
  inline def apply[K, T](
    get: K => js.UndefOr[T],
    remove: K => Unit,
    reset: () => Unit,
    set: (K, T) => Unit,
    setAll: js.Iterable[js.Tuple2[K, T]] => Unit
  ): Get[K, T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), setAll = js.Any.fromFunction1(setAll))
    __obj.asInstanceOf[Get[K, T]]
  }
  
  extension [Self <: Get[?, ?], K, T](x: Self & (Get[K, T])) {
    
    inline def setGet(value: K => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: K => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSet(value: (K, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetAll(value: js.Iterable[js.Tuple2[K, T]] => Unit): Self = StObject.set(x, "setAll", js.Any.fromFunction1(value))
  }
}
