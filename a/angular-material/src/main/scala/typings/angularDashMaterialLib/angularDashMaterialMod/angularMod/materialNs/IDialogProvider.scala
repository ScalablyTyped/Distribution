package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider extends js.Object {
  def addPreset(presetName: java.lang.String, presetOptions: angularDashMaterialLib.Anon_Methods): IDialogProvider
}

object IDialogProvider {
  @scala.inline
  def apply(addPreset: (java.lang.String, angularDashMaterialLib.Anon_Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
  
    __obj.asInstanceOf[IDialogProvider]
  }
}

