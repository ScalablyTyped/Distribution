package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueChangeRecord[K, V] extends StObject {
  
  /**
    * Current value for the key or `null` if removed.
    */
  val currentValue: V | Null = js.native
  
  /**
    * Current key in the Map.
    */
  val key: K = js.native
  
  /**
    * Previous value for the key or `null` if added.
    */
  val previousValue: V | Null = js.native
}
object KeyValueChangeRecord {
  
  @scala.inline
  def apply[K, V](key: K): KeyValueChangeRecord[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueChangeRecord[K, V]]
  }
  
  @scala.inline
  implicit class KeyValueChangeRecordMutableBuilder[Self <: KeyValueChangeRecord[_, _], K, V] (val x: Self with (KeyValueChangeRecord[K, V])) extends AnyVal {
    
    @scala.inline
    def setCurrentValue(value: V): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValueNull: Self = StObject.set(x, "currentValue", null)
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValue(value: V): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueNull: Self = StObject.set(x, "previousValue", null)
  }
}
