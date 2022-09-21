package typings.angularAgility

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAugmentedJQueryStatic
import typings.angular.mod.ISCEService
import typings.angular.mod.IScope
import typings.angular.mod.IServiceProvider
import typings.angular.mod.auto.IInjectorService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aa {
  
  trait IExternalFormValidationConfig extends StObject {
    
    var globals: js.UndefOr[Any] = js.undefined
    
    var ignore: js.UndefOr[Any] = js.undefined
    
    var resolve: js.UndefOr[Any] = js.undefined
    
    var resolveFn: js.UndefOr[js.Function1[/* modelValue */ String, String]] = js.undefined
    
    var validations: Any
  }
  object IExternalFormValidationConfig {
    
    inline def apply(validations: Any): IExternalFormValidationConfig = {
      val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExternalFormValidationConfig]
    }
    
    extension [Self <: IExternalFormValidationConfig](x: Self) {
      
      inline def setGlobals(value: Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setIgnore(value: Any): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setResolve(value: Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveFn(value: /* modelValue */ String => String): Self = StObject.set(x, "resolveFn", js.Any.fromFunction1(value))
      
      inline def setResolveFnUndefined: Self = StObject.set(x, "resolveFn", js.undefined)
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setValidations(value: Any): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    }
  }
  
  type IFieldGroupStrategies = StringDictionary[js.Function1[/* element */ IAugmentedJQueryStatic, Unit]]
  
  trait IFormExtensionsProvider
    extends StObject
       with IServiceProvider {
    
    def confirmResetStrategy(): Boolean
    
    var defaultFieldGroupStrategy: String
    
    var defaultLabelStrategy: String
    
    var defaultNotifyTarget: String
    
    var defaultOnNavigateAwayStrategy: String
    
    var defaultSpinnerClickStrategy: String
    
    var defaultValMsgPlacementStrategy: String
    
    var fieldGroupStrategies: IFieldGroupStrategies
    
    var globalSettings: IGlobalSettings
    
    var labelStrategies: ILabelStrategies
    
    var onNavigateAwayStrategies: IOnNavigateAwayStrategies
    
    var spinnerClickStrategies: ISpinnerClickStrategies
    
    var valMsgForTemplate: String
    
    var valMsgPlacementStrategies: IValMsgPlacementStrategies
    
    var validIconStrategy: IValidIconStrategy
    
    var validationMessages: IValidationMessages
  }
  object IFormExtensionsProvider {
    
    inline def apply(
      $get: Any,
      confirmResetStrategy: () => Boolean,
      defaultFieldGroupStrategy: String,
      defaultLabelStrategy: String,
      defaultNotifyTarget: String,
      defaultOnNavigateAwayStrategy: String,
      defaultSpinnerClickStrategy: String,
      defaultValMsgPlacementStrategy: String,
      fieldGroupStrategies: IFieldGroupStrategies,
      globalSettings: IGlobalSettings,
      labelStrategies: ILabelStrategies,
      onNavigateAwayStrategies: IOnNavigateAwayStrategies,
      spinnerClickStrategies: ISpinnerClickStrategies,
      valMsgForTemplate: String,
      valMsgPlacementStrategies: IValMsgPlacementStrategies,
      validIconStrategy: IValidIconStrategy,
      validationMessages: IValidationMessages
    ): IFormExtensionsProvider = {
      val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], confirmResetStrategy = js.Any.fromFunction0(confirmResetStrategy), defaultFieldGroupStrategy = defaultFieldGroupStrategy.asInstanceOf[js.Any], defaultLabelStrategy = defaultLabelStrategy.asInstanceOf[js.Any], defaultNotifyTarget = defaultNotifyTarget.asInstanceOf[js.Any], defaultOnNavigateAwayStrategy = defaultOnNavigateAwayStrategy.asInstanceOf[js.Any], defaultSpinnerClickStrategy = defaultSpinnerClickStrategy.asInstanceOf[js.Any], defaultValMsgPlacementStrategy = defaultValMsgPlacementStrategy.asInstanceOf[js.Any], fieldGroupStrategies = fieldGroupStrategies.asInstanceOf[js.Any], globalSettings = globalSettings.asInstanceOf[js.Any], labelStrategies = labelStrategies.asInstanceOf[js.Any], onNavigateAwayStrategies = onNavigateAwayStrategies.asInstanceOf[js.Any], spinnerClickStrategies = spinnerClickStrategies.asInstanceOf[js.Any], valMsgForTemplate = valMsgForTemplate.asInstanceOf[js.Any], valMsgPlacementStrategies = valMsgPlacementStrategies.asInstanceOf[js.Any], validIconStrategy = validIconStrategy.asInstanceOf[js.Any], validationMessages = validationMessages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormExtensionsProvider]
    }
    
    extension [Self <: IFormExtensionsProvider](x: Self) {
      
      inline def setConfirmResetStrategy(value: () => Boolean): Self = StObject.set(x, "confirmResetStrategy", js.Any.fromFunction0(value))
      
      inline def setDefaultFieldGroupStrategy(value: String): Self = StObject.set(x, "defaultFieldGroupStrategy", value.asInstanceOf[js.Any])
      
      inline def setDefaultLabelStrategy(value: String): Self = StObject.set(x, "defaultLabelStrategy", value.asInstanceOf[js.Any])
      
      inline def setDefaultNotifyTarget(value: String): Self = StObject.set(x, "defaultNotifyTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultOnNavigateAwayStrategy(value: String): Self = StObject.set(x, "defaultOnNavigateAwayStrategy", value.asInstanceOf[js.Any])
      
      inline def setDefaultSpinnerClickStrategy(value: String): Self = StObject.set(x, "defaultSpinnerClickStrategy", value.asInstanceOf[js.Any])
      
      inline def setDefaultValMsgPlacementStrategy(value: String): Self = StObject.set(x, "defaultValMsgPlacementStrategy", value.asInstanceOf[js.Any])
      
      inline def setFieldGroupStrategies(value: IFieldGroupStrategies): Self = StObject.set(x, "fieldGroupStrategies", value.asInstanceOf[js.Any])
      
      inline def setGlobalSettings(value: IGlobalSettings): Self = StObject.set(x, "globalSettings", value.asInstanceOf[js.Any])
      
      inline def setLabelStrategies(value: ILabelStrategies): Self = StObject.set(x, "labelStrategies", value.asInstanceOf[js.Any])
      
      inline def setOnNavigateAwayStrategies(value: IOnNavigateAwayStrategies): Self = StObject.set(x, "onNavigateAwayStrategies", value.asInstanceOf[js.Any])
      
      inline def setSpinnerClickStrategies(value: ISpinnerClickStrategies): Self = StObject.set(x, "spinnerClickStrategies", value.asInstanceOf[js.Any])
      
      inline def setValMsgForTemplate(value: String): Self = StObject.set(x, "valMsgForTemplate", value.asInstanceOf[js.Any])
      
      inline def setValMsgPlacementStrategies(value: IValMsgPlacementStrategies): Self = StObject.set(x, "valMsgPlacementStrategies", value.asInstanceOf[js.Any])
      
      inline def setValidIconStrategy(value: IValidIconStrategy): Self = StObject.set(x, "validIconStrategy", value.asInstanceOf[js.Any])
      
      inline def setValidationMessages(value: IValidationMessages): Self = StObject.set(x, "validationMessages", value.asInstanceOf[js.Any])
    }
  }
  
  type IGlobalSettings = StringDictionary[Any]
  
  type ILabelStrategies = StringDictionary[
    js.Function3[
      /* element */ IAugmentedJQueryStatic, 
      /* labelText */ String, 
      /* isRequired */ Boolean, 
      Unit
    ]
  ]
  
  trait INotifyConfig extends StObject {
    
    var name: String
    
    var namedDefaults: INotifyDefaults
    
    var options: INotifyOptions
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateName: js.UndefOr[String] = js.undefined
  }
  object INotifyConfig {
    
    inline def apply(name: String, namedDefaults: INotifyDefaults, options: INotifyOptions): INotifyConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedDefaults = namedDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotifyConfig]
    }
    
    extension [Self <: INotifyConfig](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamedDefaults(value: INotifyDefaults): Self = StObject.set(x, "namedDefaults", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: INotifyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
      
      inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait INotifyConfigProvider
    extends StObject
       with IServiceProvider {
    
    def addOrUpdateNotifyConfig(name: String, opts: INotifyConfig): Unit
    
    var defaultNotifyConfig: String
    
    var defaultTargetContainerName: String
    
    var notifyConfigs: Any
    
    def optionsTransformer(options: INotifyOptions, $sce: ISCEService): Unit
  }
  object INotifyConfigProvider {
    
    inline def apply(
      $get: Any,
      addOrUpdateNotifyConfig: (String, INotifyConfig) => Unit,
      defaultNotifyConfig: String,
      defaultTargetContainerName: String,
      notifyConfigs: Any,
      optionsTransformer: (INotifyOptions, ISCEService) => Unit
    ): INotifyConfigProvider = {
      val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], addOrUpdateNotifyConfig = js.Any.fromFunction2(addOrUpdateNotifyConfig), defaultNotifyConfig = defaultNotifyConfig.asInstanceOf[js.Any], defaultTargetContainerName = defaultTargetContainerName.asInstanceOf[js.Any], notifyConfigs = notifyConfigs.asInstanceOf[js.Any], optionsTransformer = js.Any.fromFunction2(optionsTransformer))
      __obj.asInstanceOf[INotifyConfigProvider]
    }
    
    extension [Self <: INotifyConfigProvider](x: Self) {
      
      inline def setAddOrUpdateNotifyConfig(value: (String, INotifyConfig) => Unit): Self = StObject.set(x, "addOrUpdateNotifyConfig", js.Any.fromFunction2(value))
      
      inline def setDefaultNotifyConfig(value: String): Self = StObject.set(x, "defaultNotifyConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultTargetContainerName(value: String): Self = StObject.set(x, "defaultTargetContainerName", value.asInstanceOf[js.Any])
      
      inline def setNotifyConfigs(value: Any): Self = StObject.set(x, "notifyConfigs", value.asInstanceOf[js.Any])
      
      inline def setOptionsTransformer(value: (INotifyOptions, ISCEService) => Unit): Self = StObject.set(x, "optionsTransformer", js.Any.fromFunction2(value))
    }
  }
  
  trait INotifyDefaults extends StObject {
    
    def danger(message: String, options: Any, notifier: Any): Any
    @JSName("danger")
    var danger_Original: INotifyPredicate
    
    def error(message: String, options: Any, notifier: Any): Any
    @JSName("error")
    var error_Original: INotifyPredicate
    
    def info(message: String, options: Any, notifier: Any): Any
    @JSName("info")
    var info_Original: INotifyPredicate
    
    def success(message: String, options: Any, notifier: Any): Any
    @JSName("success")
    var success_Original: INotifyPredicate
    
    def warning(message: String, options: Any, notifier: Any): Any
    @JSName("warning")
    var warning_Original: INotifyPredicate
  }
  object INotifyDefaults {
    
    inline def apply(
      danger: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any,
      error: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any,
      info: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any,
      success: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any,
      warning: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any
    ): INotifyDefaults = {
      val __obj = js.Dynamic.literal(danger = js.Any.fromFunction3(danger), error = js.Any.fromFunction3(error), info = js.Any.fromFunction3(info), success = js.Any.fromFunction3(success), warning = js.Any.fromFunction3(warning))
      __obj.asInstanceOf[INotifyDefaults]
    }
    
    extension [Self <: INotifyDefaults](x: Self) {
      
      inline def setDanger(value: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any): Self = StObject.set(x, "danger", js.Any.fromFunction3(value))
      
      inline def setError(value: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setInfo(value: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any): Self = StObject.set(x, "info", js.Any.fromFunction3(value))
      
      inline def setSuccess(value: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      inline def setWarning(value: (/* message */ String, /* options */ Any, /* notifier */ Any) => Any): Self = StObject.set(x, "warning", js.Any.fromFunction3(value))
    }
  }
  
  trait INotifyOptions extends StObject {
    
    var allowHtml: Boolean
    
    var cssClasses: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var messageType: String
  }
  object INotifyOptions {
    
    inline def apply(allowHtml: Boolean, message: String, messageType: String): INotifyOptions = {
      val __obj = js.Dynamic.literal(allowHtml = allowHtml.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotifyOptions]
    }
    
    extension [Self <: INotifyOptions](x: Self) {
      
      inline def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
      
      inline def setCssClasses(value: String): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      inline def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    }
  }
  
  type INotifyPredicate = js.Function3[/* message */ String, /* options */ Any, /* notifier */ Any, Any]
  
  type IOnNavigateAwayStrategies = StringDictionary[
    js.Function3[
      /* rootFormScope */ IScope, 
      /* rootForm */ IAugmentedJQueryStatic, 
      /* $injector */ IInjectorService, 
      Unit
    ]
  ]
  
  type ISpinnerClickStrategies = StringDictionary[js.Function1[/* element */ IAugmentedJQueryStatic, Unit]]
  
  type IValMsgPlacementStrategies = StringDictionary[
    js.Function3[
      /* formFieldElement */ IAugmentedJQueryStatic, 
      /* formName */ String, 
      /* formFieldName */ String, 
      Unit
    ]
  ]
  
  trait IValidIconStrategy extends StObject {
    
    def getContainer(element: IAugmentedJQueryStatic): Unit
    
    var invalidIcon: String
    
    var validIcon: String
  }
  object IValidIconStrategy {
    
    inline def apply(getContainer: IAugmentedJQueryStatic => Unit, invalidIcon: String, validIcon: String): IValidIconStrategy = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidIconStrategy]
    }
    
    extension [Self <: IValidIconStrategy](x: Self) {
      
      inline def setGetContainer(value: IAugmentedJQueryStatic => Unit): Self = StObject.set(x, "getContainer", js.Any.fromFunction1(value))
      
      inline def setInvalidIcon(value: String): Self = StObject.set(x, "invalidIcon", value.asInstanceOf[js.Any])
      
      inline def setValidIcon(value: String): Self = StObject.set(x, "validIcon", value.asInstanceOf[js.Any])
    }
  }
  
  type IValidationMessages = StringDictionary[String]
}
