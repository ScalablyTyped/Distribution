package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionMarginTop extends StObject {
  
  var flexDirection: String
  
  var marginTop: Double
}
object FlexDirectionMarginTop {
  
  @scala.inline
  def apply(flexDirection: String, marginTop: Double): FlexDirectionMarginTop = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionMarginTop]
  }
  
  @scala.inline
  implicit class FlexDirectionMarginTopMutableBuilder[Self <: FlexDirectionMarginTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}
