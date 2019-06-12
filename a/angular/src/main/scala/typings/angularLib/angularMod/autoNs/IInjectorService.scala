package typings
package angularLib.angularMod.autoNs

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
  var modules: org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.IModule] = js.native
  var strictDi: scala.Boolean = js.native
  def annotate(fn: angularLib.angularMod.Global.Function): js.Array[java.lang.String] = js.native
  def annotate(fn: angularLib.angularMod.Global.Function, strictDi: scala.Boolean): js.Array[java.lang.String] = js.native
  def annotate(inlineAnnotatedFunction: js.Array[_]): js.Array[java.lang.String] = js.native
  def get[T](name: java.lang.String): T = js.native
  def get[T](name: java.lang.String, caller: java.lang.String): T = js.native
  @JSName("get")
  def get_anchorScroll(name: angularLib.angularLibStrings.DOLLARanchorScroll): angularLib.angularMod.IAnchorScrollService = js.native
  @JSName("get")
  def get_cacheFactory(name: angularLib.angularLibStrings.DOLLARcacheFactory): angularLib.angularMod.ICacheFactoryService = js.native
  @JSName("get")
  def get_compile(name: angularLib.angularLibStrings.DOLLARcompile): angularLib.angularMod.ICompileService = js.native
  @JSName("get")
  def get_controller(name: angularLib.angularLibStrings.DOLLARcontroller): angularLib.angularMod.IControllerService = js.native
  @JSName("get")
  def get_document(name: angularLib.angularLibStrings.DOLLARdocument): angularLib.angularMod.IDocumentService = js.native
  @JSName("get")
  def get_exceptionHandler(name: angularLib.angularLibStrings.DOLLARexceptionHandler): angularLib.angularMod.IExceptionHandlerService = js.native
  @JSName("get")
  def get_filter(name: angularLib.angularLibStrings.DOLLARfilter): angularLib.angularMod.IFilterService = js.native
  @JSName("get")
  def get_http(name: angularLib.angularLibStrings.DOLLARhttp): angularLib.angularMod.IHttpService = js.native
  @JSName("get")
  def get_httpBackend(name: angularLib.angularLibStrings.DOLLARhttpBackend): angularLib.angularMod.IHttpBackendService = js.native
  @JSName("get")
  def get_httpParamSerializer(name: angularLib.angularLibStrings.DOLLARhttpParamSerializer): angularLib.angularMod.IHttpParamSerializer = js.native
  @JSName("get")
  def get_httpParamSerializerJQLike(name: angularLib.angularLibStrings.DOLLARhttpParamSerializerJQLike): angularLib.angularMod.IHttpParamSerializer = js.native
  @JSName("get")
  def get_interpolate(name: angularLib.angularLibStrings.DOLLARinterpolate): angularLib.angularMod.IInterpolateService = js.native
  @JSName("get")
  def get_interval(name: angularLib.angularLibStrings.DOLLARinterval): angularLib.angularMod.IIntervalService = js.native
  @JSName("get")
  def get_locale(name: angularLib.angularLibStrings.DOLLARlocale): angularLib.angularMod.ILocaleService = js.native
  @JSName("get")
  def get_location(name: angularLib.angularLibStrings.DOLLARlocation): angularLib.angularMod.ILocationService = js.native
  @JSName("get")
  def get_log(name: angularLib.angularLibStrings.DOLLARlog): angularLib.angularMod.ILogService = js.native
  @JSName("get")
  def get_parse(name: angularLib.angularLibStrings.DOLLARparse): angularLib.angularMod.IParseService = js.native
  @JSName("get")
  def get_q(name: angularLib.angularLibStrings.DOLLARq): angularLib.angularMod.IQService = js.native
  @JSName("get")
  def get_rootElement(name: angularLib.angularLibStrings.DOLLARrootElement): angularLib.angularMod.IRootElementService = js.native
  @JSName("get")
  def get_rootScope(name: angularLib.angularLibStrings.DOLLARrootScope): angularLib.angularMod.IRootScopeService = js.native
  @JSName("get")
  def get_sce(name: angularLib.angularLibStrings.DOLLARsce): angularLib.angularMod.ISCEService = js.native
  @JSName("get")
  def get_sceDelegate(name: angularLib.angularLibStrings.DOLLARsceDelegate): angularLib.angularMod.ISCEDelegateService = js.native
  @JSName("get")
  def get_templateCache(name: angularLib.angularLibStrings.DOLLARtemplateCache): angularLib.angularMod.ITemplateCacheService = js.native
  @JSName("get")
  def get_templateRequest(name: angularLib.angularLibStrings.DOLLARtemplateRequest): angularLib.angularMod.ITemplateRequestService = js.native
  @JSName("get")
  def get_timeout(name: angularLib.angularLibStrings.DOLLARtimeout): angularLib.angularMod.ITimeoutService = js.native
  @JSName("get")
  def get_window(name: angularLib.angularLibStrings.DOLLARwindow): angularLib.angularMod.IWindowService = js.native
  @JSName("get")
  def get_xhrFactory[T](name: angularLib.angularLibStrings.DOLLARxhrFactory): angularLib.angularMod.IXhrFactory[T] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def instantiate[T](typeConstructor: angularLib.Anon_Args[T]): T = js.native
  def instantiate[T](typeConstructor: angularLib.Anon_Args[T], locals: js.Any): T = js.native
  def invoke[T](
    func: angularLib.angularMod.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */ _, T])]
  ): T = js.native
  def invoke[T](
    func: angularLib.angularMod.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */ _, T])],
    context: js.Any
  ): T = js.native
  def invoke[T](
    func: angularLib.angularMod.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */ _, T])],
    context: js.Any,
    locals: js.Any
  ): T = js.native
  /**
    * Add the specified modules to the current injector.
    * This method will add each of the injectables to the injector and execute all of the config and run blocks for each module passed to the method.
    * @param modules A module, module name or annotated injection function.
    */
  def loadNewModules(
    modules: js.Array[
      angularLib.angularMod.IModule | java.lang.String | (angularLib.angularMod.Injectable[js.Function1[/* repeated */ _, scala.Unit]])
    ]
  ): scala.Unit = js.native
}

