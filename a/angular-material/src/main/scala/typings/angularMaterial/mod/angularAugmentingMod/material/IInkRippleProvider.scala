package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRippleProvider extends StObject {
  
  def disableInkRipple(): Unit
}
object IInkRippleProvider {
  
  inline def apply(disableInkRipple: () => Unit): IInkRippleProvider = {
    val __obj = js.Dynamic.literal(disableInkRipple = js.Any.fromFunction0(disableInkRipple))
    __obj.asInstanceOf[IInkRippleProvider]
  }
  
  extension [Self <: IInkRippleProvider](x: Self) {
    
    inline def setDisableInkRipple(value: () => Unit): Self = StObject.set(x, "disableInkRipple", js.Any.fromFunction0(value))
  }
}
