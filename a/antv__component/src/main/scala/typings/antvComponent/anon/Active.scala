package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: LabelStyle = js.native
  
  var inactive: LabelStyleFillString = js.native
}
object Active {
  
  @scala.inline
  def apply(active: LabelStyle, inactive: LabelStyleFillString): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: LabelStyle): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: LabelStyleFillString): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
  }
}
