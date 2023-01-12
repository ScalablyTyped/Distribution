package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLike[Key, Value] extends StObject {
  
  def entries(): js.Array[js.Tuple2[Key, Value]]
  
  def get(key: Key): js.UndefOr[Value]
  
  def has(key: Key): Boolean
  
  def keys(): js.Array[Key]
  
  def values(): js.Array[Value]
}
object MapLike {
  
  inline def apply[Key, Value](
    entries: () => js.Array[js.Tuple2[Key, Value]],
    get: Key => js.UndefOr[Value],
    has: Key => Boolean,
    keys: () => js.Array[Key],
    values: () => js.Array[Value]
  ): MapLike[Key, Value] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[MapLike[Key, Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapLike[?, ?], Key, Value] (val x: Self & (MapLike[Key, Value])) extends AnyVal {
    
    inline def setEntries(value: () => js.Array[js.Tuple2[Key, Value]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setGet(value: Key => js.UndefOr[Value]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: Key => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(value: () => js.Array[Key]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setValues(value: () => js.Array[Value]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
