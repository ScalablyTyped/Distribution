package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeight extends StObject {
  
  var contentHeight: Double
}
object ContentHeight {
  
  inline def apply(contentHeight: Double): ContentHeight = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentHeight] (val x: Self) extends AnyVal {
    
    inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
  }
}
