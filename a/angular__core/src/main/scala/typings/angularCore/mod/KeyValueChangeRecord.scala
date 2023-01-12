package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueChangeRecord[K, V] extends StObject {
  
  /**
    * Current value for the key or `null` if removed.
    */
  val currentValue: V | Null
  
  /**
    * Current key in the Map.
    */
  val key: K
  
  /**
    * Previous value for the key or `null` if added.
    */
  val previousValue: V | Null
}
object KeyValueChangeRecord {
  
  inline def apply[K, V](key: K): KeyValueChangeRecord[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], currentValue = null, previousValue = null)
    __obj.asInstanceOf[KeyValueChangeRecord[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyValueChangeRecord[?, ?], K, V] (val x: Self & (KeyValueChangeRecord[K, V])) extends AnyVal {
    
    inline def setCurrentValue(value: V): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setCurrentValueNull: Self = StObject.set(x, "currentValue", null)
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreviousValue(value: V): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueNull: Self = StObject.set(x, "previousValue", null)
  }
}
