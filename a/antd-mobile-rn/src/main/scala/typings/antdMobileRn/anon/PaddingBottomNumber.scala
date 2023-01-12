package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottomNumber extends StObject {
  
  var paddingBottom: Double
  
  var paddingHorizontal: Double
}
object PaddingBottomNumber {
  
  inline def apply(paddingBottom: Double, paddingHorizontal: Double): PaddingBottomNumber = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingBottomNumber] (val x: Self) extends AnyVal {
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
