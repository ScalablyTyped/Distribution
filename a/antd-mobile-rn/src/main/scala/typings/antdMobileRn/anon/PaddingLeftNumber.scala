package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingLeftNumber extends StObject {
  
  var paddingLeft: Double
}
object PaddingLeftNumber {
  
  inline def apply(paddingLeft: Double): PaddingLeftNumber = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeftNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaddingLeftNumber] (val x: Self) extends AnyVal {
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
  }
}
