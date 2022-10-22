package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array[T] extends StObject {
  
  var array: js.Array[T]
  
  var fromIndex: Double
  
  var toIndex: Double
}
object Array {
  
  inline def apply[T](array: js.Array[T], fromIndex: Double, toIndex: Double): Array[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  
  extension [Self <: Array[?], T](x: Self & Array[T]) {
    
    inline def setArray(value: js.Array[T]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: T*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
