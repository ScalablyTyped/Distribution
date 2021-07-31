package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  var alignItems: String
  
  var backgroundColor: String
  
  var flex: Double
  
  var justifyContent: String
}
object AlignItems {
  
  @scala.inline
  def apply(alignItems: String, backgroundColor: String, flex: Double, justifyContent: String): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  
  @scala.inline
  implicit class AlignItemsMutableBuilder[Self <: AlignItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
