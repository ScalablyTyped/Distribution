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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see http://docs.angular-formly.com/docs/field-configuration-object
trait IFieldObject extends StObject {
  
  /**
    * Added in 6.18.0
    *
    * Demo
    * see http://angular-formly.com/#/example/other/unique-value-async-validation
    */
  var asyncValidators: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.undefined
  
  /**
    * You can specify your own class that will be applied to the formly-field directive (or ng-form of
    * a fieldGroup).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#classname-string
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * This is a great way to add custom behavior to a specific field. It is injectable with the $scope of the
    * field, and anything else you have in your injector.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#controller-controller-name-as-string--controller-f
    */
  var controller: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * This is reserved for the developer. You have our guarantee to be able to use this and not worry about
    * future versions of formly overriding your usage and preventing you from upgrading :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#data-object
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Use defaultValue to initialize it the model. If this is provided and the value of the
    * model at compile-time is undefined, then the value of the model will be assigned to defaultValue.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#defaultvalue-any
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * An object where the key is a property to be set on the main field config and the value is an
    * expression used to assign that property. The value is a formly expressions. The returned value is
    * wrapped in $q.when so you can return a promise from your function :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#expressionproperties-object
    */
  var expressionProperties: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.undefined
  
  //ALL PROPERTIES BELOW ARE ADDED (So you should not be setting them yourself.)
  /**
    * This is the NgModelController for the field. It provides you with awesome stuff like $errors :-)
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#formcontrol-ngmodelcontroller
    */
  var formControl: js.UndefOr[IFormController | js.Array[IFormController]] = js.undefined
  
  /**
    * Uses ng-if. Whether to hide the field. Defaults to false. If you wish this to be conditional, use
    * hideExpression. See below.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#hide-boolean
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is similar to expressionProperties with a slight difference. You should (hopefully) never
    * notice the difference with the most common use case. This is available due to limitations with
    * expressionProperties and ng-if not working together very nicely.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#hideexpression-string--function
    */
  var hideExpression: js.UndefOr[String | IExpressionFunction] = js.undefined
  
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
  var id: js.UndefOr[String] = js.undefined
  
  var initialValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Can be set instead of type or template to use a custom html template form field. Works
    * just like a directive templateUrl and uses the $templateCache
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#key-string
    */
  var key: js.UndefOr[String | Double] = js.undefined
  
  /**
    * This allows you to specify a link function. It is invoked after your template has finished compiling.
    * You are passed the normal arguments for a normal link function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#link-link-function
    */
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.undefined
  
  /**
    * Allows you to take advantage of ng-model-options directive. Formly's built-in templateManipulator (see
    * below) will add this attribute to your ng-model element automatically if this property exists. Note,
    * if you use the getter/setter option, formly's templateManipulator will change the value of ng-model
    * to options.value which is a getterSetter that formly adds to field options.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#modeloptions
    */
  var modelOptions: js.UndefOr[IModelOptions] = js.undefined
  
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
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This is used by ngModelAttrsTemplateManipulator to automatically add attributes to the ng-model element
    * of field templates. You will likely not use this often. This object is a little complex, but extremely
    * powerful. It's best to explain this api via an example. For more information, see the guide on ngModelAttrs.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#ngmodelattrs-object
    */
  var ngModelAttrs: js.UndefOr[Dictkey] = js.undefined
  
  /**
    * This allows you to place attributes with string values on the ng-model element.
    * Easy to use alternative to ngModelAttrs option.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#ngmodelelattrs-object
    */
  var ngModelElAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Used to tell angular-formly to not attempt to add the formControl property to your object. This is useful
    * for things like validation, but not necessary if your "field" doesn't use ng-model (if it's just a horizontal
    * line for example). Defaults to undefined.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#noformcontrol-boolean
    */
  var noFormControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to specify extra types to get options from. Duplicate options are overridden in later priority
    * (index 1 will override index 0 properties). Also, these are applied after the type's defaultOptions and
    * hence will override any duplicates of those properties as well.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#optionstypes-string--array-of-strings
    */
  var optionsTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Will reset the field's model and the field control to the last initialValue. This is used by the
    * formly-form's options.resetModel function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#resetmodel-function
    */
  var resetModel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * It is not likely that you'll ever want to invoke this function. It simply runs the expressionProperties expressions.
    * It is used internally and you shouldn't have to use it, but you can if you want to, and any breaking changes to the
    * way it works will result in a major version change, so you can rely on its api.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#runexpressions-function
    */
  var runExpressions: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * Allows you to specify custom template manipulators for this specific field. (use defaultOptions in a
    * type configuration if you want it to apply to all fields of a certain type).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templatemanipulator-object-of-arrays-of-functions
    */
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.undefined
  
  /**
    * This is reserved for the templates. Any template-specific options go in here. Look at your specific
    * template implementation to know the options required for this.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templateoptions-object
    */
  var templateOptions: js.UndefOr[ITemplateOptions] = js.undefined
  
  /**
    * Can be set instead of type or template to use a custom html template form field. Works
    * just like a directive templateUrl and uses the $templateCache
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#templateurl-string--function
    */
  var templateUrl: js.UndefOr[
    String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
  ] = js.undefined
  
  /**
    * The type of field to be rendered. This is the recommended method
    * for defining fields. Types must be pre-defined using formlyConfig.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#type-string
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Will reset the field's initialValue to the current state of the model. Useful if you load the model asynchronously.
    * Invoke this when the model gets set. This is used by the formly-form's options.updateInitialValue function.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#updateinitialvalue-function
    */
  var updateInitialValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * An object with a few useful properties mostly handy when used in combination with ng-messages
    */
  var validation: js.UndefOr[ErrorExistsAndShouldBeVisible] = js.undefined
  
  /**
    * An object where the keys are the name of the validator and the values are Formly Expressions;
    *
    * Async Validation
    * All function validators can return true/false/Promise. A validator passes if it returns true or a promise
    * that is resolved. A validator fails if it returns false or a promise that is rejected.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
    */
  var validators: js.UndefOr[StringDictionary[String | IExpressionFunction | IValidator]] = js.undefined
  
  /**
    * This is a getter/setter function for the value that your field is representing. Useful when using getterSetter: true
    * in the modelOptions (in fact, if you don't disable the ngModelAttrsTemplateManipulator that comes built-in with formly,
    * it will automagically change your field's ng-model attribute to use options.value.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#value-gettersetter-function
    */
  //Getter
  var value: js.UndefOr[js.Function0[js.Any]] & (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])
  
  //Setter
  /**
    * An object which has at least two properties called expression and listener. The watch.expression is added
    * to the formly-form directive's scope (to allow it to run even when hide is true). You can specify a type
    * ($watchCollection or $watchGroup) via the watcher.type property (defaults to $watch) and whether you want
    * it to be a deep watch via the watcher.deep property (defaults to false).
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
    */
  var watcher: js.UndefOr[IWatcher | js.Array[IWatcher]] = js.undefined
  
  /**
    * This makes reference to setWrapper in formlyConfig. It is expected to be the name of the wrapper. If
    * given an array, the formly field template will be wrapped by the first wrapper, then the second, then
    * the third, etc. You can also specify these as part of a type (which is the recommended approach).
    * Specifying this property will override the wrappers for the type for this field.
    *
    * http://docs.angular-formly.com/docs/field-configuration-object#wrapper-string--array-of-strings
    */
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IFieldObject {
  
  inline def apply(value: js.UndefOr[js.Function0[js.Any]] & (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): IFieldObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldObject]
  }
  
  extension [Self <: IFieldObject](x: Self) {
    
    inline def setAsyncValidators(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setController(value: String | js.Function): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setElementAttributes(value: StringDictionary[String]): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    inline def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    inline def setExpressionProperties(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = StObject.set(x, "expressionProperties", value.asInstanceOf[js.Any])
    
    inline def setExpressionPropertiesUndefined: Self = StObject.set(x, "expressionProperties", js.undefined)
    
    inline def setFormControl(value: IFormController | js.Array[IFormController]): Self = StObject.set(x, "formControl", value.asInstanceOf[js.Any])
    
    inline def setFormControlUndefined: Self = StObject.set(x, "formControl", js.undefined)
    
    inline def setFormControlVarargs(value: IFormController*): Self = StObject.set(x, "formControl", js.Array(value :_*))
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideExpression(value: String | IExpressionFunction): Self = StObject.set(x, "hideExpression", value.asInstanceOf[js.Any])
    
    inline def setHideExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = StObject.set(x, "hideExpression", js.Any.fromFunction3(value))
    
    inline def setHideExpressionUndefined: Self = StObject.set(x, "hideExpression", js.undefined)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialValue(value: js.Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "link", js.Any.fromFunction5(value))
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setModelOptions(value: IModelOptions): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
    
    inline def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNgModelAttrs(value: Dictkey): Self = StObject.set(x, "ngModelAttrs", value.asInstanceOf[js.Any])
    
    inline def setNgModelAttrsUndefined: Self = StObject.set(x, "ngModelAttrs", js.undefined)
    
    inline def setNgModelElAttrs(value: StringDictionary[String]): Self = StObject.set(x, "ngModelElAttrs", value.asInstanceOf[js.Any])
    
    inline def setNgModelElAttrsUndefined: Self = StObject.set(x, "ngModelElAttrs", js.undefined)
    
    inline def setNoFormControl(value: Boolean): Self = StObject.set(x, "noFormControl", value.asInstanceOf[js.Any])
    
    inline def setNoFormControlUndefined: Self = StObject.set(x, "noFormControl", js.undefined)
    
    inline def setOptionsTypes(value: String | js.Array[String]): Self = StObject.set(x, "optionsTypes", value.asInstanceOf[js.Any])
    
    inline def setOptionsTypesUndefined: Self = StObject.set(x, "optionsTypes", js.undefined)
    
    inline def setOptionsTypesVarargs(value: String*): Self = StObject.set(x, "optionsTypes", js.Array(value :_*))
    
    inline def setResetModel(value: () => Unit): Self = StObject.set(x, "resetModel", js.Any.fromFunction0(value))
    
    inline def setResetModelUndefined: Self = StObject.set(x, "resetModel", js.undefined)
    
    inline def setRunExpressions(value: () => Unit): Self = StObject.set(x, "runExpressions", js.Any.fromFunction0(value))
    
    inline def setRunExpressionsUndefined: Self = StObject.set(x, "runExpressions", js.undefined)
    
    inline def setTemplate(
      value: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction1(value: /* fieldConfiguration */ IFieldConfigurationObject => String | IPromise[String]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateManipulators(value: ITemplateManipulators): Self = StObject.set(x, "templateManipulators", value.asInstanceOf[js.Any])
    
    inline def setTemplateManipulatorsUndefined: Self = StObject.set(x, "templateManipulators", js.undefined)
    
    inline def setTemplateOptions(value: ITemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(
      value: String | (js.Function1[/* fieldConfiguration */ IFieldConfigurationObject, String | IPromise[String]])
    ): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlFunction1(value: /* fieldConfiguration */ IFieldConfigurationObject => String | IPromise[String]): Self = StObject.set(x, "templateUrl", js.Any.fromFunction1(value))
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateInitialValue(value: () => Unit): Self = StObject.set(x, "updateInitialValue", js.Any.fromFunction0(value))
    
    inline def setUpdateInitialValueUndefined: Self = StObject.set(x, "updateInitialValue", js.undefined)
    
    inline def setValidation(value: ErrorExistsAndShouldBeVisible): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setValidators(value: StringDictionary[String | IExpressionFunction | IValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValue(value: js.UndefOr[js.Function0[js.Any]] & (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: IWatcher | js.Array[IWatcher]): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    
    inline def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
    
    inline def setWatcherVarargs(value: IWatcher*): Self = StObject.set(x, "watcher", js.Array(value :_*))
    
    inline def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    inline def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value :_*))
  }
}
