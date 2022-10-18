package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFolds extends StObject {
  
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
}
object PreserveFolds {
  
  inline def apply(): PreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFolds]
  }
  
  extension [Self <: PreserveFolds](x: Self) {
    
    inline def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollUndefined: Self = StObject.set(x, "autoscroll", js.undefined)
    
    inline def setPreserveFolds(value: Boolean): Self = StObject.set(x, "preserveFolds", value.asInstanceOf[js.Any])
    
    inline def setPreserveFoldsUndefined: Self = StObject.set(x, "preserveFolds", js.undefined)
  }
}
