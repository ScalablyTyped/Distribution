package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasZM extends StObject {
  
  var hasM: js.UndefOr[Boolean] = js.undefined
  
  var hasZ: js.UndefOr[Boolean] = js.undefined
}
object HasZM {
  
  @scala.inline
  def apply(): HasZM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasZM]
  }
  
  @scala.inline
  implicit class HasZMMutableBuilder[Self <: HasZM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
  }
}
