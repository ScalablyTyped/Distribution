package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index[T] extends StObject {
  
  var data: T
  
  var index: Double
}
object Index {
  
  inline def apply[T](data: T, index: Double): Index[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  
  extension [Self <: Index[?], T](x: Self & Index[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
