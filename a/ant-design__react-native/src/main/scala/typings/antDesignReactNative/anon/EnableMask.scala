package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableMask extends StObject {
  
  var enableMask: js.UndefOr[Boolean] = js.undefined
  
  var enableStack: js.UndefOr[Boolean] = js.undefined
}
object EnableMask {
  
  inline def apply(): EnableMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableMask]
  }
  
  extension [Self <: EnableMask](x: Self) {
    
    inline def setEnableMask(value: Boolean): Self = StObject.set(x, "enableMask", value.asInstanceOf[js.Any])
    
    inline def setEnableMaskUndefined: Self = StObject.set(x, "enableMask", js.undefined)
    
    inline def setEnableStack(value: Boolean): Self = StObject.set(x, "enableStack", value.asInstanceOf[js.Any])
    
    inline def setEnableStackUndefined: Self = StObject.set(x, "enableStack", js.undefined)
  }
}
