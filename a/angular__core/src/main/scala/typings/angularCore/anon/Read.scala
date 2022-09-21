package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Read extends StObject {
  
  var read: js.UndefOr[Any] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object Read {
  
  inline def apply(): Read = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read]
  }
  
  extension [Self <: Read](x: Self) {
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
