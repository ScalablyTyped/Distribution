package typings.atlaskitPrimitives.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width0 extends StObject {
  
  @JSName("width.0")
  val widthDot0: /* var(--ds-width-0) */ String
  
  @JSName("width.050")
  val widthDot050: /* var(--ds-width-050) */ String
  
  @JSName("width.100")
  val widthDot100: /* var(--ds-width-100) */ String
}
object Width0 {
  
  inline def apply(): Width0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("width.0")("var(--ds-width-0)")
    __obj.updateDynamic("width.050")("var(--ds-width-050)")
    __obj.updateDynamic("width.100")("var(--ds-width-100)")
    __obj.asInstanceOf[Width0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Width0] (val x: Self) extends AnyVal {
    
    inline def setWidthDot0(value: /* var(--ds-width-0) */ String): Self = StObject.set(x, "width.0", value.asInstanceOf[js.Any])
    
    inline def setWidthDot050(value: /* var(--ds-width-050) */ String): Self = StObject.set(x, "width.050", value.asInstanceOf[js.Any])
    
    inline def setWidthDot100(value: /* var(--ds-width-100) */ String): Self = StObject.set(x, "width.100", value.asInstanceOf[js.Any])
  }
}
