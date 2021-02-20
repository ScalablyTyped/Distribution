package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexDirectionJustifyContent extends StObject {
  
  var flexDirection: String = js.native
  
  var justifyContent: String = js.native
}
object FlexDirectionJustifyContent {
  
  @scala.inline
  def apply(flexDirection: String, justifyContent: String): FlexDirectionJustifyContent = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionJustifyContent]
  }
  
  @scala.inline
  implicit class FlexDirectionJustifyContentMutableBuilder[Self <: FlexDirectionJustifyContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
