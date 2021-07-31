package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirection extends StObject {
  
  var alignItems: String
  
  var flexDirection: String
  
  var justifyContent: String
}
object FlexDirection {
  
  @scala.inline
  def apply(alignItems: String, flexDirection: String, justifyContent: String): FlexDirection = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirection]
  }
  
  @scala.inline
  implicit class FlexDirectionMutableBuilder[Self <: FlexDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
