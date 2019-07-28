package typings.angularDashFormly.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[Boolean] = js.undefined
  var debounce: js.UndefOr[Double] = js.undefined
  var getterSetter: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var updateOn: js.UndefOr[String] = js.undefined
}

object IModelOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[Boolean] = js.undefined,
    debounce: Int | Double = null,
    getterSetter: String = null,
    timezone: String = null,
    updateOn: String = null
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

