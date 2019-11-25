package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldGroup extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var elementAttributes: js.UndefOr[String] = js.undefined
  var fieldGroup: js.UndefOr[IFieldArray] = js.undefined
  var form: js.UndefOr[js.Object] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var hideExpression: js.UndefOr[String | IExpressionFunction] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  var options: js.UndefOr[IFormOptionsAPI] = js.undefined
  var templateOptions: js.UndefOr[ITemplateOptions] = js.undefined
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IFieldGroup {
  @scala.inline
  def apply(
    className: String = null,
    data: StringDictionary[js.Any] = null,
    elementAttributes: String = null,
    fieldGroup: IFieldArray = null,
    form: js.Object = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    hideExpression: String | IExpressionFunction = null,
    key: String | Double = null,
    model: String | StringDictionary[js.Any] = null,
    options: IFormOptionsAPI = null,
    templateOptions: ITemplateOptions = null,
    wrapper: String | js.Array[String] = null
  ): IFieldGroup = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (fieldGroup != null) __obj.updateDynamic("fieldGroup")(fieldGroup.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (hideExpression != null) __obj.updateDynamic("hideExpression")(hideExpression.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldGroup]
  }
}

