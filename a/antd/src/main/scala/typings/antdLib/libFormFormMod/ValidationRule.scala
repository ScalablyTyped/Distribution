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

