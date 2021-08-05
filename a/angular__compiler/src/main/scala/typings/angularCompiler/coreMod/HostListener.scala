package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostListener extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var eventName: js.UndefOr[String] = js.undefined
}
object HostListener {
  
  inline def apply(): HostListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostListener]
  }
  
  extension [Self <: HostListener](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
  }
}
