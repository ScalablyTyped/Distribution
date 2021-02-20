package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexFlexDirectionJustifyContent extends StObject {
  
  var flex: Double = js.native
  
  var flexDirection: String = js.native
  
  var justifyContent: String = js.native
}
object FlexFlexDirectionJustifyContent {
  
  @scala.inline
  def apply(flex: Double, flexDirection: String, justifyContent: String): FlexFlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexFlexDirectionJustifyContent]
  }
  
  @scala.inline
  implicit class FlexFlexDirectionJustifyContentMutableBuilder[Self <: FlexFlexDirectionJustifyContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
