package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var Content: String
  
  val ContentControl: typings.activexWord.Word.ContentControl
}
object Content {
  
  @scala.inline
  def apply(Content: String, ContentControl: typings.activexWord.Word.ContentControl): Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControl(value: typings.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
