package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsJustifyContent extends StObject {
  
  var alignItems: String
  
  var justifyContent: String
}
object AlignItemsJustifyContent {
  
  @scala.inline
  def apply(alignItems: String, justifyContent: String): AlignItemsJustifyContent = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsJustifyContent]
  }
  
  @scala.inline
  implicit class AlignItemsJustifyContentMutableBuilder[Self <: AlignItemsJustifyContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
