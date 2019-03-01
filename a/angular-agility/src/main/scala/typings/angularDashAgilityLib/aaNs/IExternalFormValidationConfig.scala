package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExternalFormValidationConfig extends js.Object {
  var globals: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Any] = js.undefined
  var resolve: js.UndefOr[js.Any] = js.undefined
  var resolveFn: js.UndefOr[js.Function1[/* modelValue */ java.lang.String, java.lang.String]] = js.undefined
  var validations: js.Any
}

object IExternalFormValidationConfig {
  @scala.inline
  def apply(
    validations: js.Any,
    globals: js.Any = null,
    ignore: js.Any = null,
    resolve: js.Any = null,
    resolveFn: js.Function1[/* modelValue */ java.lang.String, java.lang.String] = null
  ): IExternalFormValidationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validations")(validations)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (resolveFn != null) __obj.updateDynamic("resolveFn")(resolveFn)
    __obj.asInstanceOf[IExternalFormValidationConfig]
  }
}

