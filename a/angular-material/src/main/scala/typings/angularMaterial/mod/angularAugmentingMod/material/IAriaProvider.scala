package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAriaProvider extends StObject {
  
  def disableWarnings(): Unit
}
object IAriaProvider {
  
  inline def apply(disableWarnings: () => Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(disableWarnings = js.Any.fromFunction0(disableWarnings))
    __obj.asInstanceOf[IAriaProvider]
  }
  
  extension [Self <: IAriaProvider](x: Self) {
    
    inline def setDisableWarnings(value: () => Unit): Self = StObject.set(x, "disableWarnings", js.Any.fromFunction0(value))
  }
}
