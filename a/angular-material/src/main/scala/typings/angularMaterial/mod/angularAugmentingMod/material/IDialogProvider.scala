package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angularMaterial.anon.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogProvider extends js.Object {
  
  def addPreset(presetName: String, presetOptions: Methods): IDialogProvider = js.native
}
object IDialogProvider {
  
  @scala.inline
  def apply(addPreset: (String, Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
    __obj.asInstanceOf[IDialogProvider]
  }
  
  @scala.inline
  implicit class IDialogProviderOps[Self <: IDialogProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddPreset(value: (String, Methods) => IDialogProvider): Self = this.set("addPreset", js.Any.fromFunction2(value))
  }
}
