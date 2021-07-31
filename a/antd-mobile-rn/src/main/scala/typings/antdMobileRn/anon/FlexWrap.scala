package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexWrap extends StObject {
  
  var flexDirection: String
  
  var flexWrap: String
}
object FlexWrap {
  
  @scala.inline
  def apply(flexDirection: String, flexWrap: String): FlexWrap = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexWrap = flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrap]
  }
  
  @scala.inline
  implicit class FlexWrapMutableBuilder[Self <: FlexWrap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
  }
}
