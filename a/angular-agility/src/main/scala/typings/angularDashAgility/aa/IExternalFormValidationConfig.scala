package typings.angularDashAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExternalFormValidationConfig extends js.Object {
  var globals: js.UndefOr[js.Any] = js.undefined
  var ignore: js.UndefOr[js.Any] = js.undefined
  var resolve: js.UndefOr[js.Any] = js.undefined
  var resolveFn: js.UndefOr[js.Function1[/* modelValue */ String, String]] = js.undefined
  var validations: js.Any
}

object IExternalFormValidationConfig {
  @scala.inline
  def apply(
    validations: js.Any,
    globals: js.Any = null,
    ignore: js.Any = null,
    resolve: js.Any = null,
    resolveFn: /* modelValue */ String => String = null
  ): IExternalFormValidationConfig = {
    val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolveFn != null) __obj.updateDynamic("resolveFn")(js.Any.fromFunction1(resolveFn))
    __obj.asInstanceOf[IExternalFormValidationConfig]
  }
}

