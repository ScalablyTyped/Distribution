package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValue[K, V] extends StObject {
  
  var key: K
  
  var value: V
}
object KeyValue {
  
  inline def apply[K, V](key: K, value: V): KeyValue[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue[K, V]]
  }
  
  extension [Self <: KeyValue[?, ?], K, V](x: Self & (KeyValue[K, V])) {
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
