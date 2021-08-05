package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar extends StObject {
  
  var avatar: Boolean
  
  var paragraph: Boolean
  
  var title: Boolean
}
object Avatar {
  
  inline def apply(avatar: Boolean, paragraph: Boolean, title: Boolean): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  
  extension [Self <: Avatar](x: Self) {
    
    inline def setAvatar(value: Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
