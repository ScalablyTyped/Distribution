package typings.activexPowerpoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeArray[T] extends StObject {
  
  var _brand: SafeArray[T]
}
object SafeArray {
  
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(_brand = _brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  
  @scala.inline
  implicit class SafeArrayMutableBuilder[Self <: SafeArray[?], T] (val x: Self & SafeArray[T]) extends AnyVal {
    
    @scala.inline
    def set_brand(value: SafeArray[T]): Self = StObject.set(x, "_brand", value.asInstanceOf[js.Any])
  }
}
