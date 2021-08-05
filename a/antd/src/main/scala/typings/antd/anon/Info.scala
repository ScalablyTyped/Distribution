package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var error: Unit
  
  var info: ComponentStackString
}
object Info {
  
  inline def apply(error: Unit, info: ComponentStackString): Info = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: ComponentStackString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
