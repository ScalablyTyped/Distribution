package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angularMaterial.anon.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDialogProvider extends StObject {
  
  def addPreset(presetName: String, presetOptions: Methods): IDialogProvider
}
object IDialogProvider {
  
  inline def apply(addPreset: (String, Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
    __obj.asInstanceOf[IDialogProvider]
  }
  
  extension [Self <: IDialogProvider](x: Self) {
    
    inline def setAddPreset(value: (String, Methods) => IDialogProvider): Self = StObject.set(x, "addPreset", js.Any.fromFunction2(value))
  }
}
