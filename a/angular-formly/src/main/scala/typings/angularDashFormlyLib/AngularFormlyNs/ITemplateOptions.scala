package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
	 */

trait ITemplateOptions
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  // both attribute or regular attribute
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var groupProp: js.UndefOr[java.lang.String] = js.undefined
  //Bootstrap types
  var label: js.UndefOr[java.lang.String] = js.undefined
    // default: value
  var labelProp: js.UndefOr[java.lang.String] = js.undefined
  //attribute only
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minlength: js.UndefOr[scala.Double] = js.undefined
  //expression types
  var onBlur: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onChange: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onClick: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onFocus: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeydown: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeypress: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var onKeyup: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  // types for select/radio fields
  var options: js.UndefOr[js.Array[ISelectOption]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
    // default: group
  var valueProp: js.UndefOr[java.lang.String] = js.undefined
}

