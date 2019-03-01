package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var elementAttributes: js.UndefOr[java.lang.String] = js.undefined
  var fieldGroup: js.UndefOr[IFieldArray] = js.undefined
  var form: js.UndefOr[js.Object] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var hideExpression: js.UndefOr[java.lang.String | IExpressionFunction] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var model: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var options: js.UndefOr[IFormOptionsAPI] = js.undefined
  var templateOptions: js.UndefOr[ITemplateOptions] = js.undefined
  var wrapper: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IFieldGroup {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    elementAttributes: java.lang.String = null,
    fieldGroup: IFieldArray = null,
    form: js.Object = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    hideExpression: java.lang.String | IExpressionFunction = null,
    key: java.lang.String | scala.Double = null,
    model: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    options: IFormOptionsAPI = null,
    templateOptions: ITemplateOptions = null,
    wrapper: java.lang.String | js.Array[java.lang.String] = null
  ): IFieldGroup = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes)
    if (fieldGroup != null) __obj.updateDynamic("fieldGroup")(fieldGroup)
    if (form != null) __obj.updateDynamic("form")(form)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (hideExpression != null) __obj.updateDynamic("hideExpression")(hideExpression.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldGroup]
  }
}

