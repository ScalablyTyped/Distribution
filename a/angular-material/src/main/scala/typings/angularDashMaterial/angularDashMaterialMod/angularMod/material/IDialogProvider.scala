package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import typings.angularDashMaterial.Anon_Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider extends js.Object {
  def addPreset(presetName: String, presetOptions: Anon_Methods): IDialogProvider
}

object IDialogProvider {
  @scala.inline
  def apply(addPreset: (String, Anon_Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
  
    __obj.asInstanceOf[IDialogProvider]
  }
}

