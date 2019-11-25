package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IController
import typings.angular.angularMod.IFormController
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IScope
import typings.angular.angularMod.ITranscludeFunction
import typings.angularDashFormly.Anon_Attribute
import typings.angularDashFormly.Anon_ErrorExistsAndShouldBeVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldRuntimeObject extends IFieldObject {
  var model: StringDictionary[js.Any]
}

object IFieldRuntimeObject {
  @scala.inline
  def apply(
    model: StringDictionary[js.Any],
    asyncValidators: StringDictionary[String | IExpressionFunction | IValidator] = null,
    className: String = null,
    controller: String | js.Function = null,
    data: StringDictionary[js.Any] = null,
    defaultValue: js.Any = null,
    elementAttributes: StringDictionary[String] = null,
    expressionProperties: StringDictionary[String | IExpressionFunction | IValidator] = null,
    formControl: IFormController | js.Array[IFormController] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    hideExpression: String | IExpressionFunction = null,
    id: String = null,
    initialValue: js.Any = null,
    key: String | Double = null,
    link: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit = null,
    modelOptions: IModelOptions = null,
    name: String = null,
    ngModelAttrs: Anon_Attribute = null,
    ngModelElAttrs: StringDictionary[String] = null,
    noFormControl: js.UndefOr[Boolean] = js.undefined,
    optionsTypes: String | js.Array[String] = null,
    resetModel: () => Unit = null,
    runExpressions: () => Unit = null,
    template: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]]) = null,
    templateManipulators: ITemplateManipulators = null,
    templateOptions: ITemplateOptions = null,
    templateUrl: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]]) = null,
    `type`: String = null,
    updateInitialValue: () => Unit = null,
    validation: Anon_ErrorExistsAndShouldBeVisible = null,
    validators: StringDictionary[String | IExpressionFunction | IValidator] = null,
    value: js.Function0[_] with (js.Function1[/* val */ js.Any, Unit]) = null,
    watcher: IWatcher | js.Array[IWatcher] = null,
    wrapper: String | js.Array[String] = null
  ): IFieldRuntimeObject = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (expressionProperties != null) __obj.updateDynamic("expressionProperties")(expressionProperties.asInstanceOf[js.Any])
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (hideExpression != null) __obj.updateDynamic("hideExpression")(hideExpression.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(js.Any.fromFunction5(link))
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ngModelAttrs != null) __obj.updateDynamic("ngModelAttrs")(ngModelAttrs.asInstanceOf[js.Any])
    if (ngModelElAttrs != null) __obj.updateDynamic("ngModelElAttrs")(ngModelElAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(noFormControl)) __obj.updateDynamic("noFormControl")(noFormControl.asInstanceOf[js.Any])
    if (optionsTypes != null) __obj.updateDynamic("optionsTypes")(optionsTypes.asInstanceOf[js.Any])
    if (resetModel != null) __obj.updateDynamic("resetModel")(js.Any.fromFunction0(resetModel))
    if (runExpressions != null) __obj.updateDynamic("runExpressions")(js.Any.fromFunction0(runExpressions))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateManipulators != null) __obj.updateDynamic("templateManipulators")(templateManipulators.asInstanceOf[js.Any])
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateInitialValue != null) __obj.updateDynamic("updateInitialValue")(js.Any.fromFunction0(updateInitialValue))
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watcher != null) __obj.updateDynamic("watcher")(watcher.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldRuntimeObject]
  }
}

