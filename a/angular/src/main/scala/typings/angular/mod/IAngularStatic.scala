package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.JQuery
import typings.angular.JQueryStatic
import typings.angular.anon.CodeName
import typings.angular.mod.auto.IInjectorService
import typings.angular.mod.global.Function
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// see http://docs.angularjs.org/api
///////////////////////////////////////////////////////////////////////////
@js.native
trait IAngularStatic extends StObject {
  
  /**
    * Restores the pre-1.8 behavior of jqLite that turns XHTML-like strings like
    * `<div /><span />` to `<div></div><span></span>` instead of `<div><span></span></div>`.
    * The new behavior is a security fix so if you use this method, please try to adjust
    * to the change & remove the call as soon as possible.
    * Note that this only patches jqLite. If you use jQuery 3.5.0 or newer, please read
    * [jQuery 3.5 upgrade guide](https://jquery.com/upgrade-guide/3.5/) for more details
    * about the workarounds.
    */
  def UNSAFE_restoreLegacyJqLiteXHTMLReplacement(): Unit = js.native
  
  def bind(context: js.Any, fn: Function, args: js.Any*): Function = js.native
  
  /**
    * Use this function to manually start up angular application.
    *
    * @param element DOM element which is the root of angular application.
    * @param modules An array of modules to load into the application.
    *     Each item in the array should be the name of a predefined module or a (DI annotated)
    *     function that will be invoked by the injector as a config block.
    * @param config an object for defining configuration options for the application. The following keys are supported:
    *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
    */
  def bootstrap(element: String): IInjectorService = js.native
  def bootstrap(element: String, modules: js.Array[String | Function | js.Array[js.Any]]): IInjectorService = js.native
  def bootstrap(
    element: String,
    modules: js.Array[String | Function | js.Array[js.Any]],
    config: IAngularBootstrapConfig
  ): IInjectorService = js.native
  def bootstrap(element: String, modules: Unit, config: IAngularBootstrapConfig): IInjectorService = js.native
  def bootstrap(element: JQuery): IInjectorService = js.native
  def bootstrap(element: JQuery, modules: js.Array[String | Function | js.Array[js.Any]]): IInjectorService = js.native
  def bootstrap(
    element: JQuery,
    modules: js.Array[String | Function | js.Array[js.Any]],
    config: IAngularBootstrapConfig
  ): IInjectorService = js.native
  def bootstrap(element: JQuery, modules: Unit, config: IAngularBootstrapConfig): IInjectorService = js.native
  def bootstrap(element: Document): IInjectorService = js.native
  def bootstrap(element: Document, modules: js.Array[String | Function | js.Array[js.Any]]): IInjectorService = js.native
  def bootstrap(
    element: Document,
    modules: js.Array[String | Function | js.Array[js.Any]],
    config: IAngularBootstrapConfig
  ): IInjectorService = js.native
  def bootstrap(element: Document, modules: Unit, config: IAngularBootstrapConfig): IInjectorService = js.native
  def bootstrap(element: Element): IInjectorService = js.native
  def bootstrap(element: Element, modules: js.Array[String | Function | js.Array[js.Any]]): IInjectorService = js.native
  def bootstrap(
    element: Element,
    modules: js.Array[String | Function | js.Array[js.Any]],
    config: IAngularBootstrapConfig
  ): IInjectorService = js.native
  def bootstrap(element: Element, modules: Unit, config: IAngularBootstrapConfig): IInjectorService = js.native
  
  /**
    * Creates a deep copy of source, which should be an object or an array.
    *
    * - If no destination is supplied, a copy of the object or array is created.
    * - If a destination is provided, all of its elements (for array) or properties (for objects) are deleted and then all elements/properties from the source are copied to it.
    * - If source is not an object or array (inc. null and undefined), source is returned.
    * - If source is identical to 'destination' an exception will be thrown.
    *
    * @param source The source that will be used to make a copy. Can be any type, including primitives, null, and undefined.
    * @param destination Destination into which the source is copied. If provided, must be of the same type as source.
    */
  def copy[T](source: T): T = js.native
  def copy[T](source: T, destination: T): T = js.native
  
  /**
    * Wraps a raw DOM element or HTML string as a jQuery element.
    *
    * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
    */
  def element(element: String): JQLite = js.native
  def element(element: js.Function0[Unit]): JQLite = js.native
  def element(element: JQuery): JQLite = js.native
  def element(element: ArrayLike[Element]): JQLite = js.native
  def element(element: Document): JQLite = js.native
  def element(element: Element): JQLite = js.native
  def element(element: Window): JQLite = js.native
  /**
    * Wraps a raw DOM element or HTML string as a jQuery element.
    *
    * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
    */
  @JSName("element")
  var element_Original: JQueryStatic = js.native
  
  def equals(value1: js.Any, value2: js.Any): Boolean = js.native
  
  /**
    * Configure several aspects of error handling in AngularJS if used as a setter
    * or return the current configuration if used as a getter
    */
  def errorHandlingConfig(): IErrorHandlingConfig = js.native
  def errorHandlingConfig(config: IErrorHandlingConfig): Unit = js.native
  
  def extend(destination: js.Any, sources: js.Any*): js.Any = js.native
  
  /**
    * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
    *
    * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
    *
    * @param obj Object to iterate over.
    * @param iterator Iterator function.
    * @param context Object to become context (this) for the iterator function.
    */
  def forEach(obj: js.Any, iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* obj */ js.Any, Unit]): js.Any = js.native
  def forEach(
    obj: js.Any,
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* obj */ js.Any, Unit],
    context: js.Any
  ): js.Any = js.native
  /**
    * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
    *
    * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
    *
    * @param obj Object to iterate over.
    * @param iterator Iterator function.
    * @param context Object to become context (this) for the iterator function.
    */
  def forEach[T](
    obj: StringDictionary[T],
    iterator: js.Function3[/* value */ T, /* key */ String, /* obj */ StringDictionary[T], Unit]
  ): StringDictionary[T] = js.native
  def forEach[T](
    obj: StringDictionary[T],
    iterator: js.Function3[/* value */ T, /* key */ String, /* obj */ StringDictionary[T], Unit],
    context: js.Any
  ): StringDictionary[T] = js.native
  /**
    * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
    *
    * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
    *
    * @param obj Object to iterate over.
    * @param iterator Iterator function.
    * @param context Object to become context (this) for the iterator function.
    */
  def forEach[T, U /* <: ArrayLike[T] */](
    obj: U,
    iterator: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: U[number] */ /* value */ js.Any, 
      /* key */ Double, 
      /* obj */ U, 
      Unit
    ]
  ): U = js.native
  def forEach[T, U /* <: ArrayLike[T] */](
    obj: U,
    iterator: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: U[number] */ /* value */ js.Any, 
      /* key */ Double, 
      /* obj */ U, 
      Unit
    ],
    context: js.Any
  ): U = js.native
  
  def fromJson(json: String): js.Any = js.native
  
  def identity[T](): T = js.native
  def identity[T](arg: T): T = js.native
  
  def injector(): IInjectorService = js.native
  def injector(modules: js.Array[js.Any]): IInjectorService = js.native
  def injector(modules: js.Array[js.Any], strictDi: Boolean): IInjectorService = js.native
  def injector(modules: Unit, strictDi: Boolean): IInjectorService = js.native
  
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  
  def isDefined(value: js.Any): Boolean = js.native
  
  def isElement(value: js.Any): Boolean = js.native
  
  def isFunction(value: js.Any): /* is angular.angular.<global>.Function */ Boolean = js.native
  
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  def isObject(value: js.Any): /* is std.Object */ Boolean = js.native
  @JSName("isObject")
  def isObject_T[T](value: js.Any): /* is T */ Boolean = js.native
  
  def isString(value: js.Any): /* is string */ Boolean = js.native
  
  def isUndefined(value: js.Any): Boolean = js.native
  
  /**
    * Deeply extends the destination object dst by copying own enumerable properties from the src object(s) to dst. You can specify multiple src objects. If you want to preserve original objects, you can do so by passing an empty object as the target: var object = angular.merge({}, object1, object2).
    *
    * Unlike extend(), merge() recursively descends into object properties of source objects, performing a deep copy.
    *
    * @param dst Destination object.
    * @param src Source object(s).
    */
  def merge(dst: js.Any, src: js.Any*): js.Any = js.native
  
  /**
    * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
    *
    * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
    *
    * @param name The name of the module to create or retrieve.
    * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
    * @param configFn Optional configuration function for the module.
    */
  def module(name: String): IModule = js.native
  def module(name: String, requires: js.Array[String]): IModule = js.native
  def module(name: String, requires: js.Array[String], configFn: Injectable[Function]): IModule = js.native
  def module(name: String, requires: Unit, configFn: Injectable[Function]): IModule = js.native
  
  def noop(args: js.Any*): Unit = js.native
  
  def reloadWithDebugInfo(): Unit = js.native
  
  /**
    * If window.name contains prefix NG_DEFER_BOOTSTRAP! when angular.bootstrap is called, the bootstrap process will be paused until angular.resumeBootstrap() is called.
    * @param extraModules An optional array of modules that should be added to the original list of modules that the app was about to be bootstrapped with.
    */
  var resumeBootstrap: js.UndefOr[js.Function1[/* extraModules */ js.UndefOr[js.Array[String]], IInjectorService]] = js.native
  
  def toJson(obj: js.Any): String = js.native
  def toJson(obj: js.Any, pretty: Boolean): String = js.native
  def toJson(obj: js.Any, pretty: Double): String = js.native
  
  var version: CodeName = js.native
}
