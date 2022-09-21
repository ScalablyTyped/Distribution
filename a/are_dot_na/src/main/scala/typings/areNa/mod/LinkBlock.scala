package typings.areNa.mod

import typings.areNa.areNaStrings.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Block of type "Link"
  */
trait LinkBlock
  extends StObject
     with Block {
  
  @JSName("class")
  var class_LinkBlock: Link
  
  @JSName("content")
  var content_LinkBlock: Null
  
  @JSName("content_html")
  var content_html_LinkBlock: Null
  
  @JSName("image")
  var image_LinkBlock: Image
}
object LinkBlock {
  
  inline def apply(
    base_class: String,
    comment_count: Double,
    content: Null,
    content_html: Null,
    created_at: Timestamp,
    generated_title: String,
    id: Double,
    image: Image,
    state: String,
    updated_at: Timestamp,
    user: User
  ): LinkBlock = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_html = content_html.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], generated_title = generated_title.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], description = null, description_html = null, source = null, title = null)
    __obj.updateDynamic("class")("Link")
    __obj.asInstanceOf[LinkBlock]
  }
  
  extension [Self <: LinkBlock](x: Self) {
    
    inline def setClass(value: Link): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContent_html(value: Null): Self = StObject.set(x, "content_html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
