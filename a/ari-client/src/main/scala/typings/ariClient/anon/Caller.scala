package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caller extends StObject {
  
  var caller: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Caller {
  
  inline def apply(): Caller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Caller]
  }
  
  extension [Self <: Caller](x: Self) {
    
    inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
