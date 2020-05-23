package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angularMaterial.anon.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider extends js.Object {
  def addPreset(presetName: String, presetOptions: Methods): IDialogProvider
}

object IDialogProvider {
  @scala.inline
  def apply(addPreset: (String, Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
    __obj.asInstanceOf[IDialogProvider]
  }
}

