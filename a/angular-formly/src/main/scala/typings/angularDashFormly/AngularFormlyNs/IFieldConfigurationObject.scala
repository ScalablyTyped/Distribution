package typings.angularDashFormly.AngularFormlyNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.angularMod.IAttributes
import typings.angular.angularMod.IController
import typings.angular.angularMod.IDirectiveLinkFn
import typings.angular.angularMod.IFormController
import typings.angular.angularMod.IScope
import typings.angularDashFormly.Anon_Attribute
import typings.angularDashFormly.Anon_ErrorExistsAndShouldBeVisible
import typings.angularDashFormly.Fn_FieldConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldConfigurationObject extends IFieldObject {
  /**
  		 * By default, the model passed to the formly-field directive is the same as the model passed to the
  		 * formly-form. However, if the field has a model specified, then it is used for that field (and that
  		 * field only). In addition, a deep watch is added to the formly-field directive's scope to run the
  		 * expressionProperties when the specified model changes.
  		 *
  		 * Note, the formly-form directive will allow you to specify a string which is an (almost) formly
  		 * expression which allows you to define the model as relative to the scope of the form.
  		 *
  		 * see http://docs.angular-formly.com/docs/field-configuration-object#model-object--string
  		 */
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
}

object IFieldConfigurationObject {
  @scala.inline
  def apply(
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
    link: IDirectiveLinkFn[IScope, JQLite, IAttributes, IController] = null,
    model: String | StringDictionary[js.Any] = null,
    modelOptions: IModelOptions = null,
    name: String = null,
    ngModelAttrs: Anon_Attribute = null,
    ngModelElAttrs: StringDictionary[String] = null,
    noFormControl: js.UndefOr[Boolean] = js.undefined,
    optionsTypes: String | js.Array[String] = null,
    resetModel: () => Unit = null,
    runExpressions: () => Unit = null,
    template: String | Fn_FieldConfiguration = null,
    templateManipulators: ITemplateManipulators = null,
    templateOptions: ITemplateOptions = null,
    templateUrl: String | Fn_FieldConfiguration = null,
    `type`: String = null,
    updateInitialValue: () => Unit = null,
    validation: Anon_ErrorExistsAndShouldBeVisible = null,
    validators: StringDictionary[String | IExpressionFunction | IValidator] = null,
    value: js.Function0[_] with (js.Function1[/* val */ js.Any, Unit]) = null,
    watcher: IWatcher | js.Array[IWatcher] = null,
    wrapper: String | js.Array[String] = null
  ): IFieldConfigurationObject = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators)
    if (className != null) __obj.updateDynamic("className")(className)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes)
    if (expressionProperties != null) __obj.updateDynamic("expressionProperties")(expressionProperties)
    if (formControl != null) __obj.updateDynamic("formControl")(formControl.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (hideExpression != null) __obj.updateDynamic("hideExpression")(hideExpression.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ngModelAttrs != null) __obj.updateDynamic("ngModelAttrs")(ngModelAttrs)
    if (ngModelElAttrs != null) __obj.updateDynamic("ngModelElAttrs")(ngModelElAttrs)
    if (!js.isUndefined(noFormControl)) __obj.updateDynamic("noFormControl")(noFormControl)
    if (optionsTypes != null) __obj.updateDynamic("optionsTypes")(optionsTypes.asInstanceOf[js.Any])
    if (resetModel != null) __obj.updateDynamic("resetModel")(js.Any.fromFunction0(resetModel))
    if (runExpressions != null) __obj.updateDynamic("runExpressions")(js.Any.fromFunction0(runExpressions))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateManipulators != null) __obj.updateDynamic("templateManipulators")(templateManipulators)
    if (templateOptions != null) __obj.updateDynamic("templateOptions")(templateOptions)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateInitialValue != null) __obj.updateDynamic("updateInitialValue")(js.Any.fromFunction0(updateInitialValue))
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    if (value != null) __obj.updateDynamic("value")(value)
    if (watcher != null) __obj.updateDynamic("watcher")(watcher.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldConfigurationObject]
  }
}

