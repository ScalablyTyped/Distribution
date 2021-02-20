package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSize extends StObject {
  
  var contentSize: HeightWidth = js.native
  
  var eventCount: Double = js.native
  
  var target: Double = js.native
  
  var text: String = js.native
}
object ContentSize {
  
  @scala.inline
  def apply(contentSize: HeightWidth, eventCount: Double, target: Double, text: String): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
  
  @scala.inline
  implicit class ContentSizeMutableBuilder[Self <: ContentSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSize(value: HeightWidth): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
