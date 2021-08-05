package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cols extends StObject {
  
  var cols: js.Array[Key]
  
  var selMinute: js.Any
}
object Cols {
  
  inline def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  
  extension [Self <: Cols](x: Self) {
    
    inline def setCols(value: js.Array[Key]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: Key*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    inline def setSelMinute(value: js.Any): Self = StObject.set(x, "selMinute", value.asInstanceOf[js.Any])
  }
}
