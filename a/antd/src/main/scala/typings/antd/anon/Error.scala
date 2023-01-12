package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: Unit
  
  var info: ComponentStackString
}
object Error {
  
  inline def apply(error: Unit, info: ComponentStackString): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: ComponentStackString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
