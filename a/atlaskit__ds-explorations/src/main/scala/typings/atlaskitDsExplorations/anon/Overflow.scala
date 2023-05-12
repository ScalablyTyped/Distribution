package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflow extends StObject {
  
  val overflow: SerializedStyles
  
  @JSName("overflow.perimeter")
  val overflowDotperimeter: SerializedStyles
  
  @JSName("overflow.spread")
  val overflowDotspread: SerializedStyles
  
  val overlay: SerializedStyles
  
  val raised: SerializedStyles
}
object Overflow {
  
  inline def apply(
    overflow: SerializedStyles,
    overflowDotperimeter: SerializedStyles,
    overflowDotspread: SerializedStyles,
    overlay: SerializedStyles,
    raised: SerializedStyles
  ): Overflow = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any])
    __obj.updateDynamic("overflow.perimeter")(overflowDotperimeter.asInstanceOf[js.Any])
    __obj.updateDynamic("overflow.spread")(overflowDotspread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
    
    inline def setOverflow(value: SerializedStyles): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowDotperimeter(value: SerializedStyles): Self = StObject.set(x, "overflow.perimeter", value.asInstanceOf[js.Any])
    
    inline def setOverflowDotspread(value: SerializedStyles): Self = StObject.set(x, "overflow.spread", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: SerializedStyles): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: SerializedStyles): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
