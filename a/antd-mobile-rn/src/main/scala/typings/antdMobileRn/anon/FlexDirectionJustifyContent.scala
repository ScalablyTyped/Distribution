package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionJustifyContent extends StObject {
  
  var flexDirection: String
  
  var justifyContent: String
}
object FlexDirectionJustifyContent {
  
  inline def apply(flexDirection: String, justifyContent: String): FlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionJustifyContent]
  }
  
  extension [Self <: FlexDirectionJustifyContent](x: Self) {
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
