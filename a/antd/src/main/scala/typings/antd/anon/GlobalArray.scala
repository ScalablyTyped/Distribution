package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalArray extends StObject {
  
  var global: js.Array[scala.Nothing]
}
object GlobalArray {
  
  inline def apply(global: js.Array[scala.Nothing]): GlobalArray = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalArray] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: js.Array[scala.Nothing]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalVarargs(value: scala.Nothing*): Self = StObject.set(x, "global", js.Array(value*))
  }
}
