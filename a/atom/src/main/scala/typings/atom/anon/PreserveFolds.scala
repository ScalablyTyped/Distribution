package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFolds extends StObject {
  
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object PreserveFolds {
  
  inline def apply(): PreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFolds]
  }
  
  extension [Self <: PreserveFolds](x: Self) {
    
    inline def setPreserveFolds(value: Boolean): Self = StObject.set(x, "preserveFolds", value.asInstanceOf[js.Any])
    
    inline def setPreserveFoldsUndefined: Self = StObject.set(x, "preserveFolds", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
