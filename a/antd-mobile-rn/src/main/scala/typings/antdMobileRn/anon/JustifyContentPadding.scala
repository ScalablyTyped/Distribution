package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyContentPadding extends StObject {
  
  var alignItems: String
  
  var justifyContent: String
  
  var padding: Double
}
object JustifyContentPadding {
  
  @scala.inline
  def apply(alignItems: String, justifyContent: String, padding: Double): JustifyContentPadding = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyContentPadding]
  }
  
  @scala.inline
  implicit class JustifyContentPaddingMutableBuilder[Self <: JustifyContentPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
