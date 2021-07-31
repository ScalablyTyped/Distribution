package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressCircularProvider extends StObject {
  
  def configure(options: IProgressCircularConfig): Unit
}
object IProgressCircularProvider {
  
  @scala.inline
  def apply(configure: IProgressCircularConfig => Unit): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[IProgressCircularProvider]
  }
  
  @scala.inline
  implicit class IProgressCircularProviderMutableBuilder[Self <: IProgressCircularProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: IProgressCircularConfig => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
  }
}
