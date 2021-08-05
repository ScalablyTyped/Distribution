package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingHorizontalPaddingVertical extends StObject {
  
  var paddingHorizontal: Double
  
  var paddingVertical: Double
}
object PaddingHorizontalPaddingVertical {
  
  inline def apply(paddingHorizontal: Double, paddingVertical: Double): PaddingHorizontalPaddingVertical = {
    val __obj = js.Dynamic.literal(paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingHorizontalPaddingVertical]
  }
  
  extension [Self <: PaddingHorizontalPaddingVertical](x: Self) {
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
