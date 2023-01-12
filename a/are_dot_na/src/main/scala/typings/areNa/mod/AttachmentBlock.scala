package typings.areNa.mod

import typings.areNa.areNaStrings.Attachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Block of type "Attachment"
  */
trait AttachmentBlock
  extends StObject
     with Block {
  
  @JSName("class")
  var class_AttachmentBlock: Attachment
  
  @JSName("content")
  var content_AttachmentBlock: Null
  
  @JSName("content_html")
  var content_html_AttachmentBlock: Null
  
  @JSName("image")
  var image_AttachmentBlock: Null
}
object AttachmentBlock {
  
  inline def apply(
    base_class: String,
    comment_count: Double,
    content: Null,
    content_html: Null,
    created_at: Timestamp,
    generated_title: String,
    id: Double,
    image: Null,
    state: String,
    updated_at: Timestamp,
    user: User
  ): AttachmentBlock = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_html = content_html.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], generated_title = generated_title.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], description = null, description_html = null, source = null, title = null)
    __obj.updateDynamic("class")("Attachment")
    __obj.asInstanceOf[AttachmentBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentBlock] (val x: Self) extends AnyVal {
    
    inline def setClass(value: Attachment): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContent_html(value: Null): Self = StObject.set(x, "content_html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Null): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
