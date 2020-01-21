package typings.angularMaterial

import typings.angularMaterial.mod.angularAugmentingMod.material.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethods extends js.Object {
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  def options(): IDialogOptions
}

object AnonMethods {
  @scala.inline
  def apply(options: () => IDialogOptions, methods: js.Array[String] = null): AnonMethods = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction0(options))
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethods]
  }
}

