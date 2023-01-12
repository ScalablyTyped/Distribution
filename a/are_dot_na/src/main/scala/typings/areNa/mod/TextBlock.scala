package typings.areNa.mod

import typings.areNa.areNaStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Block of type "Text"
  */
trait TextBlock
  extends StObject
     with Block {
  
  @JSName("class")
  var class_TextBlock: Text
  
  @JSName("content")
  var content_TextBlock: String
  
  @JSName("content_html")
  var content_html_TextBlock: String
  
  @JSName("image")
  var image_TextBlock: Null
}
object TextBlock {
  
  inline def apply(
    base_class: String,
    comment_count: Double,
    content: String,
    content_html: String,
    created_at: Timestamp,
    generated_title: String,
    id: Double,
    image: Null,
    state: String,
    updated_at: Timestamp,
    user: User
  ): TextBlock = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_html = content_html.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], generated_title = generated_title.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], description = null, description_html = null, source = null, title = null)
    __obj.updateDynamic("class")("Text")
    __obj.asInstanceOf[TextBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBlock] (val x: Self) extends AnyVal {
    
    inline def setClass(value: Text): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContent_html(value: String): Self = StObject.set(x, "content_html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Null): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
