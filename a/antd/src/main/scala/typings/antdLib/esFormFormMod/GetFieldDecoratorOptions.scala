package typings
package antdLib.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldDecoratorOptions extends js.Object {
  /** 是否和其他控件互斥，特别用于 Radio 单选控件 */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  /** 可以把 onChange 的参数转化为控件的值，例如 DatePicker 可设为：(date, dateString) => dateString */
  var getValueFromEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  /** Get the component props according to field value. */
  var getValueProps: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /** 子节点的初始值，类型、可选值均由子节点决定 */
  var initialValue: js.UndefOr[js.Any] = js.undefined
  /** Normalize value to form component */
  var normalize: js.UndefOr[
    js.Function3[/* value */ js.Any, /* prevValue */ js.Any, /* allValues */ js.Any, _]
  ] = js.undefined
  /** 是否一直保留子节点的信息 */
  var preserve: js.UndefOr[scala.Boolean] = js.undefined
  /** 校验规则，参见 [async-validator](https://github.com/yiminghe/async-validator) */
  var rules: js.UndefOr[js.Array[ValidationRule]] = js.undefined
  /** 收集子节点的值的时机 */
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  /** Whether stop validate on first rule of error for this field.  */
  var validateFirst: js.UndefOr[scala.Boolean] = js.undefined
  /** 校验子节点值的时机 */
  var validateTrigger: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** 子节点的值的属性，如 Checkbox 的是 'checked' */
  var valuePropName: js.UndefOr[java.lang.String] = js.undefined
}

object GetFieldDecoratorOptions {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    getValueFromEvent: /* repeated */ js.Any => _ = null,
    getValueProps: /* value */ js.Any => _ = null,
    initialValue: js.Any = null,
    normalize: (/* value */ js.Any, /* prevValue */ js.Any, /* allValues */ js.Any) => _ = null,
    preserve: js.UndefOr[scala.Boolean] = js.undefined,
    rules: js.Array[ValidationRule] = null,
    trigger: java.lang.String = null,
    validateFirst: js.UndefOr[scala.Boolean] = js.undefined,
    validateTrigger: java.lang.String | js.Array[java.lang.String] = null,
    valuePropName: java.lang.String = null
  ): GetFieldDecoratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (getValueFromEvent != null) __obj.updateDynamic("getValueFromEvent")(js.Any.fromFunction1(getValueFromEvent))
    if (getValueProps != null) __obj.updateDynamic("getValueProps")(js.Any.fromFunction1(getValueProps))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue)
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction3(normalize))
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(validateFirst)) __obj.updateDynamic("validateFirst")(validateFirst)
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (valuePropName != null) __obj.updateDynamic("valuePropName")(valuePropName)
    __obj.asInstanceOf[GetFieldDecoratorOptions]
  }
}

