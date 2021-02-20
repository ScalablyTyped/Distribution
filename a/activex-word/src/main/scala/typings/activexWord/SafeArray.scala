package typings.activexWord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeArray[T] extends StObject {
  
  var _brand: SafeArray[T] = js.native
}
object SafeArray {
  
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(_brand = _brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  
  @scala.inline
  implicit class SafeArrayMutableBuilder[Self <: SafeArray[_], T] (val x: Self with SafeArray[T]) extends AnyVal {
    
    @scala.inline
    def set_brand(value: SafeArray[T]): Self = StObject.set(x, "_brand", value.asInstanceOf[js.Any])
  }
}
