package typings.angular.angularMod.autoNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.Anon_Args
import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IAnchorScrollService
import typings.angular.angularMod.ICacheFactoryService
import typings.angular.angularMod.ICompileService
import typings.angular.angularMod.IControllerService
import typings.angular.angularMod.IDocumentService
import typings.angular.angularMod.IExceptionHandlerService
import typings.angular.angularMod.IFilterService
import typings.angular.angularMod.IHttpBackendService
import typings.angular.angularMod.IHttpParamSerializer
import typings.angular.angularMod.IHttpService
import typings.angular.angularMod.IInterpolateService
import typings.angular.angularMod.IIntervalService
import typings.angular.angularMod.ILocaleService
import typings.angular.angularMod.ILocationService
import typings.angular.angularMod.ILogService
import typings.angular.angularMod.IModule
import typings.angular.angularMod.IParseService
import typings.angular.angularMod.IQService
import typings.angular.angularMod.IRootElementService
import typings.angular.angularMod.IRootScopeService
import typings.angular.angularMod.ISCEDelegateService
import typings.angular.angularMod.ISCEService
import typings.angular.angularMod.ITemplateCacheService
import typings.angular.angularMod.ITemplateRequestService
import typings.angular.angularMod.ITimeoutService
import typings.angular.angularMod.IWindowService
import typings.angular.angularMod.IXhrFactory
import typings.angular.angularMod.Injectable
import typings.angular.angularStrings.DOLLARanchorScroll
import typings.angular.angularStrings.DOLLARcacheFactory
import typings.angular.angularStrings.DOLLARcompile
import typings.angular.angularStrings.DOLLARcontroller
import typings.angular.angularStrings.DOLLARdocument
import typings.angular.angularStrings.DOLLARexceptionHandler
import typings.angular.angularStrings.DOLLARfilter
import typings.angular.angularStrings.DOLLARhttp
import typings.angular.angularStrings.DOLLARhttpBackend
import typings.angular.angularStrings.DOLLARhttpParamSerializer
import typings.angular.angularStrings.DOLLARhttpParamSerializerJQLike
import typings.angular.angularStrings.DOLLARinterpolate
import typings.angular.angularStrings.DOLLARinterval
import typings.angular.angularStrings.DOLLARlocale
import typings.angular.angularStrings.DOLLARlocation
import typings.angular.angularStrings.DOLLARlog
import typings.angular.angularStrings.DOLLARparse
import typings.angular.angularStrings.DOLLARq
import typings.angular.angularStrings.DOLLARrootElement
import typings.angular.angularStrings.DOLLARrootScope
import typings.angular.angularStrings.DOLLARsce
import typings.angular.angularStrings.DOLLARsceDelegate
import typings.angular.angularStrings.DOLLARtemplateCache
import typings.angular.angularStrings.DOLLARtemplateRequest
import typings.angular.angularStrings.DOLLARtimeout
import typings.angular.angularStrings.DOLLARwindow
import typings.angular.angularStrings.DOLLARxhrFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def get_anchorScroll(name: DOLLARanchorScroll): IAnchorScrollService = js.native
  @JSName("get")
  def get_cacheFactory(name: DOLLARcacheFactory): ICacheFactoryService = js.native
  @JSName("get")
  def get_compile(name: DOLLARcompile): ICompileService = js.native
  @JSName("get")
  def get_controller(name: DOLLARcontroller): IControllerService = js.native
  @JSName("get")
  def get_document(name: DOLLARdocument): IDocumentService = js.native
  @JSName("get")
  def get_exceptionHandler(name: DOLLARexceptionHandler): IExceptionHandlerService = js.native
  @JSName("get")
  def get_filter(name: DOLLARfilter): IFilterService = js.native
  @JSName("get")
  def get_http(name: DOLLARhttp): IHttpService = js.native
  @JSName("get")
  def get_httpBackend(name: DOLLARhttpBackend): IHttpBackendService = js.native
  @JSName("get")
  def get_httpParamSerializer(name: DOLLARhttpParamSerializer): IHttpParamSerializer = js.native
  @JSName("get")
  def get_httpParamSerializerJQLike(name: DOLLARhttpParamSerializerJQLike): IHttpParamSerializer = js.native
  @JSName("get")
  def get_interpolate(name: DOLLARinterpolate): IInterpolateService = js.native
  @JSName("get")
  def get_interval(name: DOLLARinterval): IIntervalService = js.native
  @JSName("get")
  def get_locale(name: DOLLARlocale): ILocaleService = js.native
  @JSName("get")
  def get_location(name: DOLLARlocation): ILocationService = js.native
  @JSName("get")
  def get_log(name: DOLLARlog): ILogService = js.native
  @JSName("get")
  def get_parse(name: DOLLARparse): IParseService = js.native
  @JSName("get")
  def get_q(name: DOLLARq): IQService = js.native
  @JSName("get")
  def get_rootElement(name: DOLLARrootElement): IRootElementService = js.native
  @JSName("get")
  def get_rootScope(name: DOLLARrootScope): IRootScopeService = js.native
  @JSName("get")
  def get_sce(name: DOLLARsce): ISCEService = js.native
  @JSName("get")
  def get_sceDelegate(name: DOLLARsceDelegate): ISCEDelegateService = js.native
  @JSName("get")
  def get_templateCache(name: DOLLARtemplateCache): ITemplateCacheService = js.native
  @JSName("get")
  def get_templateRequest(name: DOLLARtemplateRequest): ITemplateRequestService = js.native
  @JSName("get")
  def get_timeout(name: DOLLARtimeout): ITimeoutService = js.native
  @JSName("get")
  def get_window(name: DOLLARwindow): IWindowService = js.native
  @JSName("get")
  def get_xhrFactory[T](name: DOLLARxhrFactory): IXhrFactory[T] = js.native
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

