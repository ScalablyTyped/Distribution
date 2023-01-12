package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current[T] extends StObject {
  
  val current: T
}
object Current {
  
  inline def apply[T](current: T): Current[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Current[?], T] (val x: Self & Current[T]) extends AnyVal {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
