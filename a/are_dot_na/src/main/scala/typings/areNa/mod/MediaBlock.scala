package typings.areNa.mod

import typings.areNa.areNaStrings.Media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Block of type "Media"
  */
trait MediaBlock
  extends StObject
     with Block {
  
  @JSName("class")
  var class_MediaBlock: Media
  
  @JSName("content")
  var content_MediaBlock: Null
  
  @JSName("content_html")
  var content_html_MediaBlock: Null
  
  @JSName("image")
  var image_MediaBlock: Null
}
object MediaBlock {
  
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
  ): MediaBlock = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], content_html = content_html.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], generated_title = generated_title.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], description = null, description_html = null, source = null, title = null)
    __obj.updateDynamic("class")("Media")
    __obj.asInstanceOf[MediaBlock]
  }
  
  extension [Self <: MediaBlock](x: Self) {
    
    inline def setClass(value: Media): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContent_html(value: Null): Self = StObject.set(x, "content_html", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Null): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
