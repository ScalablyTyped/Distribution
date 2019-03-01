package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[scala.Boolean] = js.undefined
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var getterSetter: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var updateOn: js.UndefOr[java.lang.String] = js.undefined
}

object IModelOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: scala.Int | scala.Double = null,
    getterSetter: java.lang.String = null,
    timezone: java.lang.String = null,
    updateOn: java.lang.String = null
  ): IModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (getterSetter != null) __obj.updateDynamic("getterSetter")(getterSetter)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn)
    __obj.asInstanceOf[IModelOptions]
  }
}

