package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[V] extends StObject {
  
  var value: V
}
object Value {
  
  @scala.inline
  def apply[V](value: V): Value[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[V]]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value[?], V] (val x: Self & Value[V]) extends AnyVal {
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
