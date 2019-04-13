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
  def get(name: angularLib.angularLibStrings.DOLLARanchorScroll): angularLib.angularMod.IAnchorScrollService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARcacheFactory): angularLib.angularMod.ICacheFactoryService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARcompile): angularLib.angularMod.ICompileService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARcontroller): angularLib.angularMod.IControllerService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARdocument): angularLib.angularMod.IDocumentService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARexceptionHandler): angularLib.angularMod.IExceptionHandlerService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARfilter): angularLib.angularMod.IFilterService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARhttp): angularLib.angularMod.IHttpService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARhttpBackend): angularLib.angularMod.IHttpBackendService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARhttpParamSerializer): angularLib.angularMod.IHttpParamSerializer = js.native
  def get(name: angularLib.angularLibStrings.DOLLARhttpParamSerializerJQLike): angularLib.angularMod.IHttpParamSerializer = js.native
  def get(name: angularLib.angularLibStrings.DOLLARinterpolate): angularLib.angularMod.IInterpolateService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARinterval): angularLib.angularMod.IIntervalService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARlocale): angularLib.angularMod.ILocaleService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARlocation): angularLib.angularMod.ILocationService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARlog): angularLib.angularMod.ILogService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARparse): angularLib.angularMod.IParseService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARq): angularLib.angularMod.IQService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARrootElement): angularLib.angularMod.IRootElementService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARrootScope): angularLib.angularMod.IRootScopeService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARsce): angularLib.angularMod.ISCEService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARsceDelegate): angularLib.angularMod.ISCEDelegateService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARtemplateCache): angularLib.angularMod.ITemplateCacheService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARtemplateRequest): angularLib.angularMod.ITemplateRequestService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARtimeout): angularLib.angularMod.ITimeoutService = js.native
  def get(name: angularLib.angularLibStrings.DOLLARwindow): angularLib.angularMod.IWindowService = js.native
  def get[T](name: angularLib.angularLibStrings.DOLLARxhrFactory): angularLib.angularMod.IXhrFactory[T] = js.native
  def get[T](name: java.lang.String): T = js.native
  def get[T](name: java.lang.String, caller: java.lang.String): T = js.native
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

