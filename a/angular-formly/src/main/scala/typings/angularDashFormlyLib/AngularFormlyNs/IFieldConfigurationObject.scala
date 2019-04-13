package typings
package angularDashFormlyLib.AngularFormlyNs

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
  var model: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object IFieldConfigurationObject {
  @scala.inline
  def apply(
    asyncValidators: org.scalablytyped.runtime.StringDictionary[java.lang.String | IExpressionFunction | IValidator] = null,
    className: java.lang.String = null,
    controller: java.lang.String | js.Function = null,
    data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    defaultValue: js.Any = null,
    elementAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    expressionProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String | IExpressionFunction | IValidator] = null,
    formControl: angularLib.angularMod.IFormController | js.Array[angularLib.angularMod.IFormController] = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    hideExpression: java.lang.String | IExpressionFunction = null,
    id: java.lang.String = null,
    initialValue: js.Any = null,
    key: java.lang.String | scala.Double = null,
    link: angularLib.angularMod.IDirectiveLinkFn[
      angularLib.angularMod.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.IAttributes, 
      angularLib.angularMod.IController
    ] = null,
    model: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    modelOptions: IModelOptions = null,
    name: java.lang.String = null,
    ngModelAttrs: angularDashFormlyLib.Anon_Attribute = null,
    ngModelElAttrs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    noFormControl: js.UndefOr[scala.Boolean] = js.undefined,
    optionsTypes: java.lang.String | js.Array[java.lang.String] = null,
    resetModel: () => scala.Unit = null,
    runExpressions: () => scala.Unit = null,
    template: java.lang.String | angularDashFormlyLib.Anon_FieldConfiguration = null,
    templateManipulators: ITemplateManipulators = null,
    templateOptions: ITemplateOptions = null,
    templateUrl: java.lang.String | angularDashFormlyLib.Anon_FieldConfiguration = null,
    `type`: java.lang.String = null,
    updateInitialValue: () => scala.Unit = null,
    validation: angularDashFormlyLib.Anon_ErrorExistsAndShouldBeVisible = null,
    validators: org.scalablytyped.runtime.StringDictionary[java.lang.String | IExpressionFunction | IValidator] = null,
    value: js.Function0[_] with (js.Function1[/* val */ js.Any, scala.Unit]) = null,
    watcher: IWatcher | js.Array[IWatcher] = null,
    wrapper: java.lang.String | js.Array[java.lang.String] = null
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

