package typings.angularAgility

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IAugmentedJQueryStatic
import typings.angular.mod.ISCEService
import typings.angular.mod.IScope
import typings.angular.mod.IServiceProvider
import typings.angular.mod.auto.IInjectorService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aa {
  
  @js.native
  trait IExternalFormValidationConfig extends StObject {
    
    var globals: js.UndefOr[js.Any] = js.native
    
    var ignore: js.UndefOr[js.Any] = js.native
    
    var resolve: js.UndefOr[js.Any] = js.native
    
    var resolveFn: js.UndefOr[js.Function1[/* modelValue */ String, String]] = js.native
    
    var validations: js.Any = js.native
  }
  object IExternalFormValidationConfig {
    
    @scala.inline
    def apply(validations: js.Any): IExternalFormValidationConfig = {
      val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExternalFormValidationConfig]
    }
    
    @scala.inline
    implicit class IExternalFormValidationConfigMutableBuilder[Self <: IExternalFormValidationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobals(value: js.Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Any): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveFn(value: /* modelValue */ String => String): Self = StObject.set(x, "resolveFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveFnUndefined: Self = StObject.set(x, "resolveFn", js.undefined)
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setValidations(value: js.Any): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    }
  }
  
  type IFieldGroupStrategies = StringDictionary[js.Function1[/* element */ IAugmentedJQueryStatic, Unit]]
  
  @js.native
  trait IFormExtensionsProvider extends IServiceProvider {
    
    def confirmResetStrategy(): Boolean = js.native
    
    var defaultFieldGroupStrategy: String = js.native
    
    var defaultLabelStrategy: String = js.native
    
    var defaultNotifyTarget: String = js.native
    
    var defaultOnNavigateAwayStrategy: String = js.native
    
    var defaultSpinnerClickStrategy: String = js.native
    
    var defaultValMsgPlacementStrategy: String = js.native
    
    var fieldGroupStrategies: IFieldGroupStrategies = js.native
    
    var globalSettings: IGlobalSettings = js.native
    
    var labelStrategies: ILabelStrategies = js.native
    
    var onNavigateAwayStrategies: IOnNavigateAwayStrategies = js.native
    
    var spinnerClickStrategies: ISpinnerClickStrategies = js.native
    
    var valMsgForTemplate: String = js.native
    
    var valMsgPlacementStrategies: IValMsgPlacementStrategies = js.native
    
    var validIconStrategy: IValidIconStrategy = js.native
    
    var validationMessages: IValidationMessages = js.native
  }
  object IFormExtensionsProvider {
    
    @scala.inline
    def apply(
      $get: js.Any,
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
    
    @scala.inline
    implicit class IFormExtensionsProviderMutableBuilder[Self <: IFormExtensionsProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmResetStrategy(value: () => Boolean): Self = StObject.set(x, "confirmResetStrategy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDefaultFieldGroupStrategy(value: String): Self = StObject.set(x, "defaultFieldGroupStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLabelStrategy(value: String): Self = StObject.set(x, "defaultLabelStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNotifyTarget(value: String): Self = StObject.set(x, "defaultNotifyTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOnNavigateAwayStrategy(value: String): Self = StObject.set(x, "defaultOnNavigateAwayStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSpinnerClickStrategy(value: String): Self = StObject.set(x, "defaultSpinnerClickStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValMsgPlacementStrategy(value: String): Self = StObject.set(x, "defaultValMsgPlacementStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldGroupStrategies(value: IFieldGroupStrategies): Self = StObject.set(x, "fieldGroupStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSettings(value: IGlobalSettings): Self = StObject.set(x, "globalSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStrategies(value: ILabelStrategies): Self = StObject.set(x, "labelStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNavigateAwayStrategies(value: IOnNavigateAwayStrategies): Self = StObject.set(x, "onNavigateAwayStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerClickStrategies(value: ISpinnerClickStrategies): Self = StObject.set(x, "spinnerClickStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValMsgForTemplate(value: String): Self = StObject.set(x, "valMsgForTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValMsgPlacementStrategies(value: IValMsgPlacementStrategies): Self = StObject.set(x, "valMsgPlacementStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidIconStrategy(value: IValidIconStrategy): Self = StObject.set(x, "validIconStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessages(value: IValidationMessages): Self = StObject.set(x, "validationMessages", value.asInstanceOf[js.Any])
    }
  }
  
  type IGlobalSettings = StringDictionary[js.Any]
  
  type ILabelStrategies = StringDictionary[
    js.Function3[
      /* element */ IAugmentedJQueryStatic, 
      /* labelText */ String, 
      /* isRequired */ Boolean, 
      Unit
    ]
  ]
  
  @js.native
  trait INotifyConfig extends StObject {
    
    var name: String = js.native
    
    var namedDefaults: INotifyDefaults = js.native
    
    var options: INotifyOptions = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateName: js.UndefOr[String] = js.native
  }
  object INotifyConfig {
    
    @scala.inline
    def apply(name: String, namedDefaults: INotifyDefaults, options: INotifyOptions): INotifyConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedDefaults = namedDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotifyConfig]
    }
    
    @scala.inline
    implicit class INotifyConfigMutableBuilder[Self <: INotifyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedDefaults(value: INotifyDefaults): Self = StObject.set(x, "namedDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: INotifyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait INotifyConfigProvider extends IServiceProvider {
    
    def addOrUpdateNotifyConfig(name: String, opts: INotifyConfig): Unit = js.native
    
    var defaultNotifyConfig: String = js.native
    
    var defaultTargetContainerName: String = js.native
    
    var notifyConfigs: js.Any = js.native
    
    def optionsTransformer(options: INotifyOptions, $sce: ISCEService): Unit = js.native
  }
  object INotifyConfigProvider {
    
    @scala.inline
    def apply(
      $get: js.Any,
      addOrUpdateNotifyConfig: (String, INotifyConfig) => Unit,
      defaultNotifyConfig: String,
      defaultTargetContainerName: String,
      notifyConfigs: js.Any,
      optionsTransformer: (INotifyOptions, ISCEService) => Unit
    ): INotifyConfigProvider = {
      val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], addOrUpdateNotifyConfig = js.Any.fromFunction2(addOrUpdateNotifyConfig), defaultNotifyConfig = defaultNotifyConfig.asInstanceOf[js.Any], defaultTargetContainerName = defaultTargetContainerName.asInstanceOf[js.Any], notifyConfigs = notifyConfigs.asInstanceOf[js.Any], optionsTransformer = js.Any.fromFunction2(optionsTransformer))
      __obj.asInstanceOf[INotifyConfigProvider]
    }
    
    @scala.inline
    implicit class INotifyConfigProviderMutableBuilder[Self <: INotifyConfigProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOrUpdateNotifyConfig(value: (String, INotifyConfig) => Unit): Self = StObject.set(x, "addOrUpdateNotifyConfig", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefaultNotifyConfig(value: String): Self = StObject.set(x, "defaultNotifyConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTargetContainerName(value: String): Self = StObject.set(x, "defaultTargetContainerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyConfigs(value: js.Any): Self = StObject.set(x, "notifyConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsTransformer(value: (INotifyOptions, ISCEService) => Unit): Self = StObject.set(x, "optionsTransformer", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait INotifyDefaults extends StObject {
    
    def danger(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
    @JSName("danger")
    var danger_Original: INotifyPredicate = js.native
    
    def error(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
    @JSName("error")
    var error_Original: INotifyPredicate = js.native
    
    def info(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
    @JSName("info")
    var info_Original: INotifyPredicate = js.native
    
    def success(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
    @JSName("success")
    var success_Original: INotifyPredicate = js.native
    
    def warning(message: String, options: js.Any, notifier: js.Any): js.Any = js.native
    @JSName("warning")
    var warning_Original: INotifyPredicate = js.native
  }
  
  @js.native
  trait INotifyOptions extends StObject {
    
    var allowHtml: Boolean = js.native
    
    var cssClasses: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var messageType: String = js.native
  }
  object INotifyOptions {
    
    @scala.inline
    def apply(allowHtml: Boolean, message: String, messageType: String): INotifyOptions = {
      val __obj = js.Dynamic.literal(allowHtml = allowHtml.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotifyOptions]
    }
    
    @scala.inline
    implicit class INotifyOptionsMutableBuilder[Self <: INotifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClasses(value: String): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    }
  }
  
  type INotifyPredicate = js.Function3[/* message */ String, /* options */ js.Any, /* notifier */ js.Any, js.Any]
  
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
  
  @js.native
  trait IValidIconStrategy extends StObject {
    
    def getContainer(element: IAugmentedJQueryStatic): Unit = js.native
    
    var invalidIcon: String = js.native
    
    var validIcon: String = js.native
  }
  object IValidIconStrategy {
    
    @scala.inline
    def apply(getContainer: IAugmentedJQueryStatic => Unit, invalidIcon: String, validIcon: String): IValidIconStrategy = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidIconStrategy]
    }
    
    @scala.inline
    implicit class IValidIconStrategyMutableBuilder[Self <: IValidIconStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContainer(value: IAugmentedJQueryStatic => Unit): Self = StObject.set(x, "getContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvalidIcon(value: String): Self = StObject.set(x, "invalidIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidIcon(value: String): Self = StObject.set(x, "validIcon", value.asInstanceOf[js.Any])
    }
  }
  
  type IValidationMessages = StringDictionary[String]
}
