package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// AngularStatic
// see http://docs.angularjs.org/api
///////////////////////////////////////////////////////////////////////////
@js.native
trait IAngularStatic extends js.Object {
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  @JSName("element")
  var element_Original: angularLib.JQueryStatic = js.native
  /**
           * If window.name contains prefix NG_DEFER_BOOTSTRAP! when angular.bootstrap is called, the bootstrap process will be paused until angular.resumeBootstrap() is called.
           * @param extraModules An optional array of modules that should be added to the original list of modules that the app was about to be bootstrapped with.
           */
  var resumeBootstrap: js.UndefOr[
    js.Function1[
      /* extraModules */ js.UndefOr[js.Array[java.lang.String]], 
      angularLib.angularMod.angularNs.autoNs.IInjectorService
    ]
  ] = js.native
  var version: angularLib.Anon_Dot = js.native
  def bind(context: js.Any, fn: angularLib.angularMod.Global.Function, args: js.Any*): angularLib.angularMod.Global.Function = js.native
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
  def bootstrap(element: angularLib.JQuery): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: angularLib.JQuery,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]]
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: angularLib.JQuery,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]],
    config: IAngularBootstrapConfig
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(element: java.lang.String): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: java.lang.String,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]]
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: java.lang.String,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]],
    config: IAngularBootstrapConfig
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(element: stdLib.Document): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: stdLib.Document,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]]
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: stdLib.Document,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]],
    config: IAngularBootstrapConfig
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(element: stdLib.Element): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: stdLib.Element,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]]
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def bootstrap(
    element: stdLib.Element,
    modules: js.Array[java.lang.String | angularLib.angularMod.Global.Function | js.Array[_]],
    config: IAngularBootstrapConfig
  ): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
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
  def copy[T](source: T, destination: T): T = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: angularLib.JQuery): angularLib.JQLite = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: java.lang.String): angularLib.JQLite = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: js.Function0[scala.Unit]): angularLib.JQLite = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: stdLib.ArrayLike[stdLib.Element]): angularLib.JQLite = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: stdLib.Document): angularLib.JQLite = js.native
  /**
           * Wraps a raw DOM element or HTML string as a jQuery element.
           *
           * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
           */
  def element(element: stdLib.Element): angularLib.JQLite = js.native
  def equals(value1: js.Any, value2: js.Any): scala.Boolean = js.native
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
  def forEach(
    obj: js.Any,
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* obj */ js.Any, scala.Unit]
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
  def forEach(
    obj: js.Any,
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* obj */ js.Any, scala.Unit],
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
    obj: ScalablyTyped.runtime.StringDictionary[T],
    iterator: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* obj */ ScalablyTyped.runtime.StringDictionary[T], 
      scala.Unit
    ]
  ): ScalablyTyped.runtime.StringDictionary[T] = js.native
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
    obj: ScalablyTyped.runtime.StringDictionary[T],
    iterator: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* obj */ ScalablyTyped.runtime.StringDictionary[T], 
      scala.Unit
    ],
    context: js.Any
  ): ScalablyTyped.runtime.StringDictionary[T] = js.native
  /**
           * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
           *
           * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
           *
           * @param obj Object to iterate over.
           * @param iterator Iterator function.
           * @param context Object to become context (this) for the iterator function.
           */
  def forEach[T, U /* <: stdLib.ArrayLike[T] */](
    obj: U,
    iterator: js.Function3[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(U))),List()),Left(TsIdentSimple(number))) *//* value */ js.Any, 
      /* key */ scala.Double, 
      /* obj */ U, 
      scala.Unit
    ]
  ): U = js.native
  /**
           * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
           *
           * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
           *
           * @param obj Object to iterate over.
           * @param iterator Iterator function.
           * @param context Object to become context (this) for the iterator function.
           */
  def forEach[T, U /* <: stdLib.ArrayLike[T] */](
    obj: U,
    iterator: js.Function3[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(U))),List()),Left(TsIdentSimple(number))) *//* value */ js.Any, 
      /* key */ scala.Double, 
      /* obj */ U, 
      scala.Unit
    ],
    context: js.Any
  ): U = js.native
  def fromJson(json: java.lang.String): js.Any = js.native
  def identity[T](): T = js.native
  def identity[T](arg: T): T = js.native
  def injector(): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
  def injector(modules: js.Array[_]): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
  def injector(modules: js.Array[_], strictDi: scala.Boolean): angularLib.angularMod.angularNs.autoNs.IInjectorService = js.native
  def isArray(value: js.Any): /* is Array */scala.Boolean = js.native
  def isDate(value: js.Any): /* is Date */scala.Boolean = js.native
  def isDefined(value: js.Any): scala.Boolean = js.native
  def isElement(value: js.Any): scala.Boolean = js.native
  def isFunction(value: js.Any): /* is Function */scala.Boolean = js.native
  def isNumber(value: js.Any): /* is number */scala.Boolean = js.native
  def isObject(value: js.Any): /* is Object */scala.Boolean = js.native
  @JSName("isObject")
  def isObject_T[T](value: js.Any): /* is T */scala.Boolean = js.native
  def isString(value: js.Any): /* is string */scala.Boolean = js.native
  def isUndefined(value: js.Any): scala.Boolean = js.native
  def lowercase(str: java.lang.String): java.lang.String = js.native
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
  def module(name: java.lang.String): IModule = js.native
  /**
           * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
           *
           * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
           *
           * @param name The name of the module to create or retrieve.
           * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
           * @param configFn Optional configuration function for the module.
           */
  def module(name: java.lang.String, requires: js.Array[java.lang.String]): IModule = js.native
  /**
           * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
           *
           * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
           *
           * @param name The name of the module to create or retrieve.
           * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
           * @param configFn Optional configuration function for the module.
           */
  def module(
    name: java.lang.String,
    requires: js.Array[java.lang.String],
    configFn: Injectable[angularLib.angularMod.Global.Function]
  ): IModule = js.native
  def noop(args: js.Any*): scala.Unit = js.native
  def reloadWithDebugInfo(): scala.Unit = js.native
  def toJson(obj: js.Any): java.lang.String = js.native
  def toJson(obj: js.Any, pretty: scala.Boolean): java.lang.String = js.native
  def toJson(obj: js.Any, pretty: scala.Double): java.lang.String = js.native
  def uppercase(str: java.lang.String): java.lang.String = js.native
}

