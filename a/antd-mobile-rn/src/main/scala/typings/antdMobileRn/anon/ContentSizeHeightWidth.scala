package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSizeHeightWidth extends StObject {
  
  var contentSize: HeightWidth
}
object ContentSizeHeightWidth {
  
  inline def apply(contentSize: HeightWidth): ContentSizeHeightWidth = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSizeHeightWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSizeHeightWidth] (val x: Self) extends AnyVal {
    
    inline def setContentSize(value: HeightWidth): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
  }
}
