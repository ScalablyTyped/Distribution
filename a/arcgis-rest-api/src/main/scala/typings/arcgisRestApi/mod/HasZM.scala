package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasZM extends StObject {
  
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  var hasZ: js.UndefOr[Boolean] = js.undefined
}
object HasZM {
  
  inline def apply(): HasZM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasZM]
  }
  
  extension [Self <: HasZM](x: Self) {
    
    inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
  }
}
