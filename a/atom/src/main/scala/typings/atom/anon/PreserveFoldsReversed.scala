package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFoldsReversed extends StObject {
  
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object PreserveFoldsReversed {
  
  inline def apply(): PreserveFoldsReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFoldsReversed]
  }
  
  extension [Self <: PreserveFoldsReversed](x: Self) {
    
    inline def setAutoscroll(value: Boolean): Self = StObject.set(x, "autoscroll", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollUndefined: Self = StObject.set(x, "autoscroll", js.undefined)
    
    inline def setPreserveFolds(value: Boolean): Self = StObject.set(x, "preserveFolds", value.asInstanceOf[js.Any])
    
    inline def setPreserveFoldsUndefined: Self = StObject.set(x, "preserveFolds", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
