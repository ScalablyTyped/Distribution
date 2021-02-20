package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAriaProvider extends StObject {
  
  def disableWarnings(): Unit = js.native
}
object IAriaProvider {
  
  @scala.inline
  def apply(disableWarnings: () => Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(disableWarnings = js.Any.fromFunction0(disableWarnings))
    __obj.asInstanceOf[IAriaProvider]
  }
  
  @scala.inline
  implicit class IAriaProviderMutableBuilder[Self <: IAriaProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableWarnings(value: () => Unit): Self = StObject.set(x, "disableWarnings", js.Any.fromFunction0(value))
  }
}
