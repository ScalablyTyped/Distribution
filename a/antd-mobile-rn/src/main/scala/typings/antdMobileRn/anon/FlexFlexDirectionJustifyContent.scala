package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexFlexDirectionJustifyContent extends StObject {
  
  var flex: Double
  
  var flexDirection: String
  
  var justifyContent: String
}
object FlexFlexDirectionJustifyContent {
  
  inline def apply(flex: Double, flexDirection: String, justifyContent: String): FlexFlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexFlexDirectionJustifyContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexFlexDirectionJustifyContent] (val x: Self) extends AnyVal {
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
