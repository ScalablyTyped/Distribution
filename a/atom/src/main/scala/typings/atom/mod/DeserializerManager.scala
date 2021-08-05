package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializerManager extends StObject {
  
  /** Register the given class(es) as deserializers. */
  def add(deserializers: Deserializer*): Disposable
  
  /** Deserialize the state and params. */
  def deserialize(state: js.Object): js.UndefOr[js.Object]
}
object DeserializerManager {
  
  inline def apply(add: /* repeated */ Deserializer => Disposable, deserialize: js.Object => js.UndefOr[js.Object]): DeserializerManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), deserialize = js.Any.fromFunction1(deserialize))
    __obj.asInstanceOf[DeserializerManager]
  }
  
  extension [Self <: DeserializerManager](x: Self) {
    
    inline def setAdd(value: /* repeated */ Deserializer => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDeserialize(value: js.Object => js.UndefOr[js.Object]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
  }
}
