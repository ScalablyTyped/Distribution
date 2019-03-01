package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationRule extends js.Object {
  /** validate the value from a list of possible values */
  var enum: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** validate the exact length of a field */
  var len: js.UndefOr[scala.Double] = js.undefined
  /** validate the max length of a field */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** validation error message */
  var message: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** validate the min length of a field */
  var min: js.UndefOr[scala.Double] = js.undefined
  /** validate from a regular expression */
  var pattern: js.UndefOr[stdLib.RegExp] = js.undefined
  /** indicates whether field is required */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /** transform a value before validation */
  var transform: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /** built-in validation type, available options: https://github.com/yiminghe/async-validator#type */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** custom validate function (Note: callback must be called) */
  var validator: js.UndefOr[
    js.Function5[
      /* rule */ js.Any, 
      /* value */ js.Any, 
      /* callback */ js.Any, 
      /* source */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** treat required fields that only contain whitespace as errors */
  var whitespace: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidationRule {
  @scala.inline
  def apply(
    enum: java.lang.String | js.Array[java.lang.String] = null,
    len: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    message: reactLib.reactMod.ReactNs.ReactNode = null,
    min: scala.Int | scala.Double = null,
    pattern: stdLib.RegExp = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function1[/* value */ js.Any, _] = null,
    `type`: java.lang.String = null,
    validator: js.Function5[
      /* rule */ js.Any, 
      /* value */ js.Any, 
      /* callback */ js.Any, 
      /* source */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    whitespace: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationRule = {
    val __obj = js.Dynamic.literal()
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace)
    __obj.asInstanceOf[ValidationRule]
  }
}

