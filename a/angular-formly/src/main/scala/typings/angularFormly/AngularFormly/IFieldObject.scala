package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirectiveLinkFn
import typings.angular.mod.IFormController
import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angular.mod.ITranscludeFunction
import typings.angularFormly.anon.Dictkey
import typings.angularFormly.anon.ErrorExistsAndShouldBeVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see http://docs.angular-formly.com/docs/field-configuration-object
@js.native
trait IFieldObject extends js.Object {
  /**
    * Added in 6.18.0
    *
    * Demo
    * see http://angular-formly.com/#/example/other/unique-value-async-validation
    */
  var asyncValidators: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.native
  /**
    * You can specify your own class that will be applied to the formly-field directive (or ng-form of
    * a fieldGroup).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#classname-string
    */
  var className: js.UndefOr[String] = js.native
  /**
    * This is a great way to add custom behavior to a specific field. It is injectable with the $scope of the
    * field, and anything else you have in your injector.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#controller-controller-name-as-string--controller-f
    */
  var controller: js.UndefOr[String | js.Function] = js.native
  /**
    * This is reserved for the developer. You have our guarantee to be able to use this and not worry about
    * future versions of formly overriding your usage and preventing you from upgrading :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#data-object
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Use defaultValue to initialize it the model. If this is provided and the value of the
    * model at compile-time is undefined, then the value of the model will be assigned to defaultValue.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#defaultvalue-any
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An object where the key is a property to be set on the main field config and the value is an
    * expression used to assign that property. The value is a formly expressions. The returned value is
    * wrapped in $q.when so you can return a promise from your function :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#expressionproperties-object
    */
  var expressionProperties: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.native
  //ALL PROPERTIES BELOW ARE ADDED (So you should not be setting them yourself.)
  /**
    * This is the NgModelController for the field. It provides you with awesome stuff like $errors :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#formcontrol-ngmodelcontroller
    */
  var formControl: js.UndefOr[IFormController | js.Array[IFormController]] = js.native
  /**
    * Uses ng-if. Whether to hide the field. Defaults to false. If you wish this to be conditional, use
    * hideExpression. See below.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#hide-boolean
    */
  var hide: js.UndefOr[Boolean] = js.native
  /**
    * This is similar to expressionProperties with a slight difference. You should (hopefully) never
    * notice the difference with the most common use case. This is available due to limitations with
    * expressionProperties and ng-if not working together very nicely.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#hideexpression-string--function
    */
  var hideExpression: js.UndefOr[String | IExpressionFunction] = js.native
  /**
    * This allows you to specify the id of your field (which will be used for its name as well unless
    * a name is provided). Note, you can also override the id generation code using the formlyConfig
    * extra called getFieldId.
    *
    * AVOID THIS
    * If you don't have to do this, don't. Specifying IDs makes it harder to re-use things and it's
    * just extra work. Part of the beauty that angular-formly provides is the fact that you don't need
    * to concern yourself with making sure that this is unique.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#id-string
    */
  var id: js.UndefOr[String] = js.native
  var initialValue: js.UndefOr[js.Any] = js.native
  /**
    * Can be set instead of type or template to use a custom html template form field. Works
    * just like a directive templateUrl and uses the $templateCache
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#key-string
    */
  var key: js.UndefOr[String | Double] = js.native
  /**
    * This allows you to specify a link function. It is invoked after your template has finished compiling.
    * You are passed the normal arguments for a normal link function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#link-link-function
    */
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.native
  /**
    * Allows you to take advantage of ng-model-options directive. Formly's built-in templateManipulator (see
    * below) will add this attribute to your ng-model element automatically if this property exists. Note,
    * if you use the getter/setter option, formly's templateManipulator will change the value of ng-model
    * to options.value which is a getterSetter that formly adds to field options.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#modeloptions
    */
  var modelOptions: js.UndefOr[IModelOptions] = js.native
  /**
    * If you wish to, you can specify a specific name for your ng-model. This is useful if you're posting
    * the form to a server using techniques of yester-year.
    *
    * AVOID THIS
    * If you don't have to do this, don't. It's just extra work. Part of the beauty that angular-formly
    * provides is the fact that you don't need to concern yourself with stuff like this.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#name-string
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This is used by ngModelAttrsTemplateManipulator to automatically add attributes to the ng-model element
    * of field templates. You will likely not use this often. This object is a little complex, but extremely
    * powerful. It's best to explain this api via an example. For more information, see the guide on ngModelAttrs.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#ngmodelattrs-object
    */
  var ngModelAttrs: js.UndefOr[Dictkey] = js.native
  /**
    * This allows you to place attributes with string values on the ng-model element.
    * Easy to use alternative to ngModelAttrs option.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#ngmodelelattrs-object
    */
  var ngModelElAttrs: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Used to tell angular-formly to not attempt to add the formControl property to your object. This is useful
    * for things like validation, but not necessary if your "field" doesn't use ng-model (if it's just a horizontal
    * line for example). Defaults to undefined.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#noformcontrol-boolean
    */
  var noFormControl: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to specify extra types to get options from. Duplicate options are overridden in later priority
    * (index 1 will override index 0 properties). Also, these are applied after the type's defaultOptions and
    * hence will override any duplicates of those properties as well.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#optionstypes-string--array-of-strings
    */
  var optionsTypes: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Will reset the field's model and the field control to the last initialValue. This is used by the
    * formly-form's options.resetModel function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#resetmodel-function
    */
  var resetModel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * It is not likely that you'll ever want to invoke this function. It simply runs the expressionProperties expressions.
    * It is used internally and you shouldn't have to use it, but you can if you want to, and any breaking changes to the
    * way it works will result in a major version change, so you can rely on its api.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#runexpressions-function
    */
  var runExpressions: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Can be set instead of type or templateUrl to use a custom html
    * template form field. Recommended to be used with one-liners mostly
    * (like a directive), or if you're using webpack with the ability to require templates :-)
    *
    * If a function is passed, it is invoked with the field configuration object and can return
    * either a string for the template or a promise that resolves to a string.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#template-string--function
    */
  var template: js.UndefOr[
    String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
  ] = js.native
  /**
    * Allows you to specify custom template manipulators for this specific field. (use defaultOptions in a
    * type configuration if you want it to apply to all fields of a certain type).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templatemanipulator-object-of-arrays-of-functions
    */
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.native
  /**
    * This is reserved for the templates. Any template-specific options go in here. Look at your specific
    * template implementation to know the options required for this.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templateoptions-object
    */
  var templateOptions: js.UndefOr[ITemplateOptions] = js.native
  /**
    * Can be set instead of type or template to use a custom html template form field. Works
    * just like a directive templateUrl and uses the $templateCache
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templateurl-string--function
    */
  var templateUrl: js.UndefOr[
    String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
  ] = js.native
  /**
    * The type of field to be rendered. This is the recommended method
    * for defining fields. Types must be pre-defined using formlyConfig.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#type-string
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Will reset the field's initialValue to the current state of the model. Useful if you load the model asynchronously.
    * Invoke this when the model gets set. This is used by the formly-form's options.updateInitialValue function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#updateinitialvalue-function
    */
  var updateInitialValue: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An object with a few useful properties mostly handy when used in combination with ng-messages
    */
  var validation: js.UndefOr[ErrorExistsAndShouldBeVisible] = js.native
  /**
    * An object where the keys are the name of the validator and the values are Formly Expressions;
    *
    * Async Validation
    * All function validators can return true/false/Promise. A validator passes if it returns true or a promise
    * that is resolved. A validator fails if it returns false or a promise that is rejected.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
    */
  var validators: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.native
  /**
    * This is a getter/setter function for the value that your field is representing. Useful when using getterSetter: true
    * in the modelOptions (in fact, if you don't disable the ngModelAttrsTemplateManipulator that comes built-in with formly,
    * it will automagically change your field's ng-model attribute to use options.value.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#value-gettersetter-function
    */
   //Getter
  var value: js.UndefOr[js.Function0[_]] with (js.UndefOr[js.Function1[/* val */ js.Any, Unit]]) = js.native
   //Setter
  /**
    * An object which has at least two properties called expression and listener. The watch.expression is added
    * to the formly-form directive's scope (to allow it to run even when hide is true). You can specify a type
    * ($watchCollection or $watchGroup) via the watcher.type property (defaults to $watch) and whether you want
    * it to be a deep watch via the watcher.deep property (defaults to false).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
    */
  var watcher: js.UndefOr[IWatcher | js.Array[IWatcher]] = js.native
  /**
    * This makes reference to setWrapper in formlyConfig. It is expected to be the name of the wrapper. If
    * given an array, the formly field template will be wrapped by the first wrapper, then the second, then
    * the third, etc. You can also specify these as part of a type (which is the recommended approach).
    * Specifying this property will override the wrappers for the type for this field.
    *
    * http://docs.angular-formly.com/docs/field-configuration-object#wrapper-string--array-of-strings
    */
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}

object IFieldObject {
  @scala.inline
  def apply(value: js.UndefOr[js.Function0[_]] with (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): IFieldObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldObject]
  }
  @scala.inline
  implicit class IFieldObjectOps[Self <: IFieldObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: js.UndefOr[js.Function0[_]] with (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncValidators(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncValidators: Self = this.set("asyncValidators", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setController(value: String | js.Function): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setElementAttributes(value: StringDictionary[String]): Self = this.set("elementAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementAttributes: Self = this.set("elementAttributes", js.undefined)
    @scala.inline
    def setExpressionProperties(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = this.set("expressionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionProperties: Self = this.set("expressionProperties", js.undefined)
    @scala.inline
    def setFormControlVarargs(value: IFormController*): Self = this.set("formControl", js.Array(value :_*))
    @scala.inline
    def setFormControl(value: IFormController | js.Array[IFormController]): Self = this.set("formControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormControl: Self = this.set("formControl", js.undefined)
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setHideExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = this.set("hideExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setHideExpression(value: String | IExpressionFunction): Self = this.set("hideExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideExpression: Self = this.set("hideExpression", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitialValue(value: js.Any): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = this.set("link", js.Any.fromFunction5(value))
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setModelOptions(value: IModelOptions): Self = this.set("modelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelOptions: Self = this.set("modelOptions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNgModelAttrs(value: Dictkey): Self = this.set("ngModelAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgModelAttrs: Self = this.set("ngModelAttrs", js.undefined)
    @scala.inline
    def setNgModelElAttrs(value: StringDictionary[String]): Self = this.set("ngModelElAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgModelElAttrs: Self = this.set("ngModelElAttrs", js.undefined)
    @scala.inline
    def setNoFormControl(value: Boolean): Self = this.set("noFormControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFormControl: Self = this.set("noFormControl", js.undefined)
    @scala.inline
    def setOptionsTypesVarargs(value: String*): Self = this.set("optionsTypes", js.Array(value :_*))
    @scala.inline
    def setOptionsTypes(value: String | js.Array[String]): Self = this.set("optionsTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsTypes: Self = this.set("optionsTypes", js.undefined)
    @scala.inline
    def setResetModel(value: () => Unit): Self = this.set("resetModel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResetModel: Self = this.set("resetModel", js.undefined)
    @scala.inline
    def setRunExpressions(value: () => Unit): Self = this.set("runExpressions", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRunExpressions: Self = this.set("runExpressions", js.undefined)
    @scala.inline
    def setTemplateFunction1(value: /* fieldConfiguration */ IFieldConfigurationObject => String | IPromise[String]): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplate(
      value: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateManipulators(value: ITemplateManipulators): Self = this.set("templateManipulators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateManipulators: Self = this.set("templateManipulators", js.undefined)
    @scala.inline
    def setTemplateOptions(value: ITemplateOptions): Self = this.set("templateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateOptions: Self = this.set("templateOptions", js.undefined)
    @scala.inline
    def setTemplateUrlFunction1(value: /* fieldConfiguration */ IFieldConfigurationObject => String | IPromise[String]): Self = this.set("templateUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplateUrl(
      value: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
    ): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateInitialValue(value: () => Unit): Self = this.set("updateInitialValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateInitialValue: Self = this.set("updateInitialValue", js.undefined)
    @scala.inline
    def setValidation(value: ErrorExistsAndShouldBeVisible): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
    @scala.inline
    def setValidators(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    @scala.inline
    def setWatcherVarargs(value: IWatcher*): Self = this.set("watcher", js.Array(value :_*))
    @scala.inline
    def setWatcher(value: IWatcher | js.Array[IWatcher]): Self = this.set("watcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatcher: Self = this.set("watcher", js.undefined)
    @scala.inline
    def setWrapperVarargs(value: String*): Self = this.set("wrapper", js.Array(value :_*))
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

