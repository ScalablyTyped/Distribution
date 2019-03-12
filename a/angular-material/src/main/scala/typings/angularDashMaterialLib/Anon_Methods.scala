package typings
package angularDashMaterialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Methods extends js.Object {
  var methods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  def options(): angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs.IDialogOptions
}

object Anon_Methods {
  @scala.inline
  def apply(
    options: () => angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs.IDialogOptions,
    methods: js.Array[java.lang.String] = null
  ): Anon_Methods = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction0(options))
    if (methods != null) __obj.updateDynamic("methods")(methods)
    __obj.asInstanceOf[Anon_Methods]
  }
}

