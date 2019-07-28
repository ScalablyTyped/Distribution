package typings.angularDashMaterial

import typings.angularDashMaterial.angularDashMaterialMod.angularMod.materialNs.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Methods extends js.Object {
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  def options(): IDialogOptions
}

object Anon_Methods {
  @scala.inline
  def apply(options: () => IDialogOptions, methods: js.Array[String] = null): Anon_Methods = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction0(options))
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[Anon_Methods]
  }
}

