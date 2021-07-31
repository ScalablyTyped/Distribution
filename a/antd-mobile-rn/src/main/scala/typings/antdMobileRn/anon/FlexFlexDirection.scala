package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexFlexDirection extends StObject {
  
  var flex: Double
  
  var flexDirection: String
}
object FlexFlexDirection {
  
  @scala.inline
  def apply(flex: Double, flexDirection: String): FlexFlexDirection = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexFlexDirection]
  }
  
  @scala.inline
  implicit class FlexFlexDirectionMutableBuilder[Self <: FlexFlexDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
  }
}
