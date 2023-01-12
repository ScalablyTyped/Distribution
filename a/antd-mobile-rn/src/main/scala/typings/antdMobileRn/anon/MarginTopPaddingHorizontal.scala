package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginTopPaddingHorizontal extends StObject {
  
  var marginTop: Double
  
  var paddingHorizontal: Double
}
object MarginTopPaddingHorizontal {
  
  inline def apply(marginTop: Double, paddingHorizontal: Double): MarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopPaddingHorizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
