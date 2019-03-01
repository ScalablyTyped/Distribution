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
  def apply(addPreset: js.Function2[java.lang.String, angularDashMaterialLib.Anon_Methods, IDialogProvider]): IDialogProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPreset")(addPreset)
    __obj.asInstanceOf[IDialogProvider]
  }
}

