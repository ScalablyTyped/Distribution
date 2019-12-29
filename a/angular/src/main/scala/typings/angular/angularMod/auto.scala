package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.Anon_Args
import typings.angular.angularMod._Global_.Function
import typings.angular.angularStrings.$anchorScroll
import typings.angular.angularStrings.$cacheFactory
import typings.angular.angularStrings.$compile
import typings.angular.angularStrings.$controller
import typings.angular.angularStrings.$document
import typings.angular.angularStrings.$exceptionHandler
import typings.angular.angularStrings.$filter
import typings.angular.angularStrings.$http
import typings.angular.angularStrings.$httpBackend
import typings.angular.angularStrings.$httpParamSerializer
import typings.angular.angularStrings.$httpParamSerializerJQLike
import typings.angular.angularStrings.$interpolate
import typings.angular.angularStrings.$interval
import typings.angular.angularStrings.$locale
import typings.angular.angularStrings.$location
import typings.angular.angularStrings.$log
import typings.angular.angularStrings.$parse
import typings.angular.angularStrings.$q
import typings.angular.angularStrings.$rootElement
import typings.angular.angularStrings.$rootScope
import typings.angular.angularStrings.$sce
import typings.angular.angularStrings.$sceDelegate
import typings.angular.angularStrings.$templateCache
import typings.angular.angularStrings.$templateRequest
import typings.angular.angularStrings.$timeout
import typings.angular.angularStrings.$window
import typings.angular.angularStrings.$xhrFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AUTO module (angular.js)
///////////////////////////////////////////////////////////////////////////
@JSImport("angular", "auto")
@js.native
object auto extends js.Object {
  ///////////////////////////////////////////////////////////////////////
  // InjectorService
  // see http://docs.angularjs.org/api/AUTO.$injector
  ///////////////////////////////////////////////////////////////////////
  @js.native
  trait IInjectorService extends js.Object {
    /** An object map of all the modules that have been loaded into the injector. */
    var modules: StringDictionary[IModule] = js.native
    var strictDi: Boolean = js.native
    def annotate(fn: Function): js.Array[String] = js.native
    def annotate(fn: Function, strictDi: Boolean): js.Array[String] = js.native
    def annotate(inlineAnnotatedFunction: js.Array[_]): js.Array[String] = js.native
    def get[T](name: String): T = js.native
    def get[T](name: String, caller: String): T = js.native
    @JSName("get")
    def get_anchorScroll(name: $anchorScroll): IAnchorScrollService = js.native
    @JSName("get")
    def get_cacheFactory(name: $cacheFactory): ICacheFactoryService = js.native
    @JSName("get")
    def get_compile(name: $compile): ICompileService = js.native
    @JSName("get")
    def get_controller(name: $controller): IControllerService = js.native
    @JSName("get")
    def get_document(name: $document): IDocumentService = js.native
    @JSName("get")
    def get_exceptionHandler(name: $exceptionHandler): IExceptionHandlerService = js.native
    @JSName("get")
    def get_filter(name: $filter): IFilterService = js.native
    @JSName("get")
    def get_http(name: $http): IHttpService = js.native
    @JSName("get")
    def get_httpBackend(name: $httpBackend): IHttpBackendService = js.native
    @JSName("get")
    def get_httpParamSerializer(name: $httpParamSerializer): IHttpParamSerializer = js.native
    @JSName("get")
    def get_httpParamSerializerJQLike(name: $httpParamSerializerJQLike): IHttpParamSerializer = js.native
    @JSName("get")
    def get_interpolate(name: $interpolate): IInterpolateService = js.native
    @JSName("get")
    def get_interval(name: $interval): IIntervalService = js.native
    @JSName("get")
    def get_locale(name: $locale): ILocaleService = js.native
    @JSName("get")
    def get_location(name: $location): ILocationService = js.native
    @JSName("get")
    def get_log(name: $log): ILogService = js.native
    @JSName("get")
    def get_parse(name: $parse): IParseService = js.native
    @JSName("get")
    def get_q(name: $q): IQService = js.native
    @JSName("get")
    def get_rootElement(name: $rootElement): IRootElementService = js.native
    @JSName("get")
    def get_rootScope(name: $rootScope): IRootScopeService = js.native
    @JSName("get")
    def get_sce(name: $sce): ISCEService = js.native
    @JSName("get")
    def get_sceDelegate(name: $sceDelegate): ISCEDelegateService = js.native
    @JSName("get")
    def get_templateCache(name: $templateCache): ITemplateCacheService = js.native
    @JSName("get")
    def get_templateRequest(name: $templateRequest): ITemplateRequestService = js.native
    @JSName("get")
    def get_timeout(name: $timeout): ITimeoutService = js.native
    @JSName("get")
    def get_window(name: $window): IWindowService = js.native
    @JSName("get")
    def get_xhrFactory[T](name: $xhrFactory): IXhrFactory[T] = js.native
    def has(name: String): Boolean = js.native
    def instantiate[T](typeConstructor: Anon_Args[T]): T = js.native
    def instantiate[T](typeConstructor: Anon_Args[T], locals: js.Any): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])]): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])], context: js.Any): T = js.native
    def invoke[T](func: Injectable[Function | (js.Function1[/* repeated */ _, T])], context: js.Any, locals: js.Any): T = js.native
    /**
      * Add the specified modules to the current injector.
      * This method will add each of the injectables to the injector and execute all of the config and run blocks for each module passed to the method.
      * @param modules A module, module name or annotated injection function.
      */
    def loadNewModules(modules: js.Array[IModule | String | (Injectable[js.Function1[/* repeated */ _, Unit]])]): Unit = js.native
  }
  
  ///////////////////////////////////////////////////////////////////////
  // ProvideService
  // see http://docs.angularjs.org/api/AUTO.$provide
  ///////////////////////////////////////////////////////////////////////
  @js.native
  trait IProvideService extends js.Object {
    // Documentation says it returns the registered instance, but actual
    // implementation does not return anything.
    // constant(name: string, value: any): any;
    /**
      * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
      *
      * @param name The name of the constant.
      * @param value The constant value.
      */
    def constant(name: String, value: js.Any): Unit = js.native
    /**
      * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
      *
      * @param name The name of the service to decorate.
      * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
      *
      * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
      */
    def decorator(name: String, decorator: Function): Unit = js.native
    /**
      * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
      *
      * @param name The name of the service to decorate.
      * @param inlineAnnotatedFunction This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
      *
      * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
      */
    def decorator(name: String, inlineAnnotatedFunction: js.Array[_]): Unit = js.native
    def factory(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
    def factory(name: String, serviceFactoryFunction: Function): IServiceProvider = js.native
    def provider(name: String, provider: IServiceProvider): IServiceProvider = js.native
    def provider(name: String, serviceProviderConstructor: Function): IServiceProvider = js.native
    def service(name: String, constructor: Function): IServiceProvider = js.native
    def service(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
    def value(name: String, value: js.Any): IServiceProvider = js.native
  }
  
}

