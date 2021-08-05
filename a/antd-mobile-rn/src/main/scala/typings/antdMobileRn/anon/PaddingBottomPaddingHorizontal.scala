package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottomPaddingHorizontal extends StObject {
  
  var paddingBottom: Double
  
  var paddingHorizontal: Double
  
  var paddingTop: Double
}
object PaddingBottomPaddingHorizontal {
  
  inline def apply(paddingBottom: Double, paddingHorizontal: Double, paddingTop: Double): PaddingBottomPaddingHorizontal = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomPaddingHorizontal]
  }
  
  extension [Self <: PaddingBottomPaddingHorizontal](x: Self) {
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
