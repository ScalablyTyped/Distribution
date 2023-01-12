package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowPaddingTop extends StObject {
  
  var borderRadius: Double
  
  var overflow: String
  
  var paddingTop: Double
  
  var width: Double
}
object OverflowPaddingTop {
  
  inline def apply(borderRadius: Double, overflow: String, paddingTop: Double, width: Double): OverflowPaddingTop = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowPaddingTop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowPaddingTop] (val x: Self) extends AnyVal {
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
