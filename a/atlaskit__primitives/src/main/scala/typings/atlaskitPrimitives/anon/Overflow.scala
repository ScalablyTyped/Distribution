package typings.atlaskitPrimitives.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflow extends StObject {
  
  val overflow: /* var(--ds-shadow-overflow) */ String
  
  @JSName("overflow.perimeter")
  val overflowDotperimeter: /* var(--ds-shadow-overflow-perimeter) */ String
  
  @JSName("overflow.spread")
  val overflowDotspread: /* var(--ds-shadow-overflow-spread) */ String
  
  val overlay: /* var(--ds-shadow-overlay) */ String
  
  val raised: /* var(--ds-shadow-raised) */ String
}
object Overflow {
  
  inline def apply(): Overflow = {
    val __obj = js.Dynamic.literal(overflow = "var(--ds-shadow-overflow)", overlay = "var(--ds-shadow-overlay)", raised = "var(--ds-shadow-raised)")
    __obj.updateDynamic("overflow.perimeter")("var(--ds-shadow-overflow-perimeter)")
    __obj.updateDynamic("overflow.spread")("var(--ds-shadow-overflow-spread)")
    __obj.asInstanceOf[Overflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
    
    inline def setOverflow(value: /* var(--ds-shadow-overflow) */ String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowDotperimeter(value: /* var(--ds-shadow-overflow-perimeter) */ String): Self = StObject.set(x, "overflow.perimeter", value.asInstanceOf[js.Any])
    
    inline def setOverflowDotspread(value: /* var(--ds-shadow-overflow-spread) */ String): Self = StObject.set(x, "overflow.spread", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: /* var(--ds-shadow-overlay) */ String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: /* var(--ds-shadow-raised) */ String): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
