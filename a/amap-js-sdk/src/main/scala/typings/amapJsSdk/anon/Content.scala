package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var offset: Pixel
}
object Content {
  
  inline def apply(content: String, offset: Pixel): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
