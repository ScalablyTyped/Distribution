package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Len extends StObject {
  
  var len: String
  
  var max: String
  
  var min: String
  
  var range: String
}
object Len {
  
  inline def apply(len: String, max: String, min: String, range: String): Len = {
    val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Len]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Len] (val x: Self) extends AnyVal {
    
    inline def setLen(value: String): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
