package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingVerticalNumber extends StObject {
  
  var paddingVertical: Double
}
object PaddingVerticalNumber {
  
  inline def apply(paddingVertical: Double): PaddingVerticalNumber = {
    val __obj = js.Dynamic.literal(paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingVerticalNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingVerticalNumber] (val x: Self) extends AnyVal {
    
    inline def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
