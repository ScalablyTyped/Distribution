package typings.antDesignCssinjs

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCacheMod {
  
  @JSImport("@ant-design/cssinjs/es/Cache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Entity {
    
    /** @private Internal cache map. Do not access this directly */
    /* CompleteClass */
    var cache: Map[String, ValueType] = js.native
    
    /* CompleteClass */
    override def get(keys: js.Array[KeyType]): ValueType | Null = js.native
    
    /* CompleteClass */
    override def update(keys: js.Array[KeyType], valueFn: js.Function1[/* origin */ ValueType | Null, ValueType | Null]): Unit = js.native
  }
  
  trait Entity extends StObject {
    
    /** @private Internal cache map. Do not access this directly */
    var cache: Map[String, ValueType]
    
    def get(keys: js.Array[KeyType]): ValueType | Null
    
    def update(keys: js.Array[KeyType], valueFn: js.Function1[/* origin */ ValueType | Null, ValueType | Null]): Unit
  }
  object Entity {
    
    inline def apply(
      cache: Map[String, ValueType],
      get: js.Array[KeyType] => ValueType | Null,
      update: (js.Array[KeyType], js.Function1[/* origin */ ValueType | Null, ValueType | Null]) => Unit
    ): Entity = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Entity]
    }
    
    extension [Self <: Entity](x: Self) {
      
      inline def setCache(value: Map[String, ValueType]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setGet(value: js.Array[KeyType] => ValueType | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (js.Array[KeyType], js.Function1[/* origin */ ValueType | Null, ValueType | Null]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  type KeyType = String | Double
  
  type ValueType = js.Tuple2[Double, Any]
}
