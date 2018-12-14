package typings
package angularLib.angularMod.angularNs.autoNs

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
  var modules: org.scalablytyped.runtime.StringDictionary[angularLib.angularMod.angularNs.IModule] = js.native
  var strictDi: scala.Boolean = js.native
  def annotate(fn: angularLib.angularMod.Global.Function): js.Array[java.lang.String] = js.native
  def annotate(fn: angularLib.angularMod.Global.Function, strictDi: scala.Boolean): js.Array[java.lang.String] = js.native
  def annotate(inlineAnnotatedFunction: js.Array[_]): js.Array[java.lang.String] = js.native
  def get[T](name: java.lang.String): T = js.native
  def get[T](name: java.lang.String, caller: java.lang.String): T = js.native
  @JSName("get")
  def get_$anchorScroll(name: angularLib.angularLibStrings.DOLLARanchorScroll): angularLib.angularMod.angularNs.IAnchorScrollService = js.native
  @JSName("get")
  def get_$cacheFactory(name: angularLib.angularLibStrings.DOLLARcacheFactory): angularLib.angularMod.angularNs.ICacheFactoryService = js.native
  @JSName("get")
  def get_$compile(name: angularLib.angularLibStrings.DOLLARcompile): angularLib.angularMod.angularNs.ICompileService = js.native
  @JSName("get")
  def get_$controller(name: angularLib.angularLibStrings.DOLLARcontroller): angularLib.angularMod.angularNs.IControllerService = js.native
  @JSName("get")
  def get_$document(name: angularLib.angularLibStrings.DOLLARdocument): angularLib.angularMod.angularNs.IDocumentService = js.native
  @JSName("get")
  def get_$exceptionHandler(name: angularLib.angularLibStrings.DOLLARexceptionHandler): angularLib.angularMod.angularNs.IExceptionHandlerService = js.native
  @JSName("get")
  def get_$filter(name: angularLib.angularLibStrings.DOLLARfilter): angularLib.angularMod.angularNs.IFilterService = js.native
  @JSName("get")
  def get_$http(name: angularLib.angularLibStrings.DOLLARhttp): angularLib.angularMod.angularNs.IHttpService = js.native
  @JSName("get")
  def get_$httpBackend(name: angularLib.angularLibStrings.DOLLARhttpBackend): angularLib.angularMod.angularNs.IHttpBackendService = js.native
  @JSName("get")
  def get_$httpParamSerializer(name: angularLib.angularLibStrings.DOLLARhttpParamSerializer): angularLib.angularMod.angularNs.IHttpParamSerializer = js.native
  @JSName("get")
  def get_$httpParamSerializerJQLike(name: angularLib.angularLibStrings.DOLLARhttpParamSerializerJQLike): angularLib.angularMod.angularNs.IHttpParamSerializer = js.native
  @JSName("get")
  def get_$interpolate(name: angularLib.angularLibStrings.DOLLARinterpolate): angularLib.angularMod.angularNs.IInterpolateService = js.native
  @JSName("get")
  def get_$interval(name: angularLib.angularLibStrings.DOLLARinterval): angularLib.angularMod.angularNs.IIntervalService = js.native
  @JSName("get")
  def get_$locale(name: angularLib.angularLibStrings.DOLLARlocale): angularLib.angularMod.angularNs.ILocaleService = js.native
  @JSName("get")
  def get_$location(name: angularLib.angularLibStrings.DOLLARlocation): angularLib.angularMod.angularNs.ILocationService = js.native
  @JSName("get")
  def get_$log(name: angularLib.angularLibStrings.DOLLARlog): angularLib.angularMod.angularNs.ILogService = js.native
  @JSName("get")
  def get_$parse(name: angularLib.angularLibStrings.DOLLARparse): angularLib.angularMod.angularNs.IParseService = js.native
  @JSName("get")
  def get_$q(name: angularLib.angularLibStrings.DOLLARq): angularLib.angularMod.angularNs.IQService = js.native
  @JSName("get")
  def get_$rootElement(name: angularLib.angularLibStrings.DOLLARrootElement): angularLib.angularMod.angularNs.IRootElementService = js.native
  @JSName("get")
  def get_$rootScope(name: angularLib.angularLibStrings.DOLLARrootScope): angularLib.angularMod.angularNs.IRootScopeService = js.native
  @JSName("get")
  def get_$sce(name: angularLib.angularLibStrings.DOLLARsce): angularLib.angularMod.angularNs.ISCEService = js.native
  @JSName("get")
  def get_$sceDelegate(name: angularLib.angularLibStrings.DOLLARsceDelegate): angularLib.angularMod.angularNs.ISCEDelegateService = js.native
  @JSName("get")
  def get_$templateCache(name: angularLib.angularLibStrings.DOLLARtemplateCache): angularLib.angularMod.angularNs.ITemplateCacheService = js.native
  @JSName("get")
  def get_$templateRequest(name: angularLib.angularLibStrings.DOLLARtemplateRequest): angularLib.angularMod.angularNs.ITemplateRequestService = js.native
  @JSName("get")
  def get_$timeout(name: angularLib.angularLibStrings.DOLLARtimeout): angularLib.angularMod.angularNs.ITimeoutService = js.native
  @JSName("get")
  def get_$window(name: angularLib.angularLibStrings.DOLLARwindow): angularLib.angularMod.angularNs.IWindowService = js.native
  @JSName("get")
  def get_$xhrFactory[T](name: angularLib.angularLibStrings.DOLLARxhrFactory): angularLib.angularMod.angularNs.IXhrFactory[T] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def instantiate[T](typeConstructor: angularLib.Anon_Args[T]): T = js.native
  def instantiate[T](typeConstructor: angularLib.Anon_Args[T], locals: js.Any): T = js.native
  def invoke[T](
    func: angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */_, T])]
  ): T = js.native
  def invoke[T](
    func: angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */_, T])],
    context: js.Any
  ): T = js.native
  def invoke[T](
    func: angularLib.angularMod.angularNs.Injectable[angularLib.angularMod.Global.Function | (js.Function1[/* repeated */_, T])],
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
      angularLib.angularMod.angularNs.IModule | java.lang.String | (angularLib.angularMod.angularNs.Injectable[js.Function1[/* repeated */_, scala.Unit]])
    ]
  ): scala.Unit = js.native
}

