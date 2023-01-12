package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constructor extends StObject {
  
  var constructor: Any
}
object Constructor {
  
  inline def apply(constructor: Any): Constructor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
  }
}
