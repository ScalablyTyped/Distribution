package typings.angular

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.JQuery
import typings.angular.JQueryStatic
import typings.angular.angularMod.Global.Function
import typings.angular.angularNumbers.`-1`
import typings.angular.angularNumbers.`0`
import typings.angular.angularNumbers.`1`
import typings.std.Date
import typings.std.Element
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularMod {
  type FilterFactory = js.Function1[/* repeated */ js.Any, IFilterFunction]
  type HttpHeaderType = StringDictionary[String | (js.Function1[/* config */ IRequestConfig, String])]
  type IAsyncModelValidators = StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, IPromise[js.Any]]]
  type IAugmentedJQuery = JQLite
  /**
    * These interfaces are kept for compatibility with older versions of these type definitions.
    * Actually, Angular doesn't create a special subclass of jQuery objects. It extends jQuery.prototype
    * like jQuery plugins do, that's why all jQuery objects have these Angular-specific methods, not
    * only those returned from angular.element.
    * See: http://docs.angularjs.org/api/angular.element
    */
  type IAugmentedJQueryStatic = JQueryStatic
  type ICloneAttachFunction = js.Function2[/* clonedElement */ js.UndefOr[JQLite], /* scope */ js.UndefOr[IScope], js.Any]
  ///////////////////////////////////////////////////////////////////////////
  // CompileService
  // see http://docs.angularjs.org/api/ng.$compile
  // see http://docs.angularjs.org/api/ng.$compileProvider
  ///////////////////////////////////////////////////////////////////////////
  type ICompileService = js.Function3[
    /* element */ String | Element | JQuery, 
    /* transclude */ js.UndefOr[ITranscludeFunction], 
    /* maxPriority */ js.UndefOr[Double], 
    ITemplateLinkingFunction
  ]
  /**
    * Same as IController. Keeping it for compatibility with older versions of these type definitions.
    */
  type IComponentController = IController
  type IControllerConstructor = (Instantiable1[/* args (repeated) */ js.Any, IController]) | (js.Function1[/* repeated */ js.Any, Unit | IController])
  type IDirectiveCompileFn[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function3[
    /* templateElement */ TElement, 
    /* templateAttributes */ TAttributes, 
    /* transclude */ ITranscludeFunction, 
    Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ]
  ///////////////////////////////////////////////////////////////////////////
  // Directive
  // see http://docs.angularjs.org/api/ng.$compileProvider#directive
  // and http://docs.angularjs.org/guide/directive
  ///////////////////////////////////////////////////////////////////////////
  type IDirectiveController = IController | js.Array[IController] | StringDictionary[IController]
  type IDirectiveFactory[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function1[
    /* repeated */ js.Any, 
    (IDirective[TScope, TElement, TAttributes, TController]) | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController])
  ]
  type IDirectiveLinkFn[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function5[
    /* scope */ TScope, 
    /* instanceElement */ TElement, 
    /* instanceAttributes */ TAttributes, 
    /* controller */ js.UndefOr[TController], 
    /* transclude */ js.UndefOr[ITranscludeFunction], 
    Unit
  ]
  ///////////////////////////////////////////////////////////////////////////
  // ExceptionHandlerService
  // see http://docs.angularjs.org/api/ng.$exceptionHandler
  ///////////////////////////////////////////////////////////////////////////
  type IExceptionHandlerService = js.Function2[/* exception */ Error, /* cause */ js.UndefOr[String], Unit]
  type IFilterCurrency = js.Function3[
    /* amount */ Double, 
    /* symbol */ js.UndefOr[String], 
    /* fractionSize */ js.UndefOr[Double], 
    String
  ]
  type IFilterDate = js.Function3[
    /* date */ Date | Double | String, 
    /* format */ js.UndefOr[String], 
    /* timezone */ js.UndefOr[String], 
    String
  ]
  type IFilterFilter = js.Function3[
    /* array */ js.Array[js.Any], 
    /* expression */ String | IFilterFilterPatternObject | IFilterFilterPredicateFunc[js.Any], 
    /* comparator */ js.UndefOr[IFilterFilterComparatorFunc[js.Any] | Boolean], 
    js.Array[js.Any]
  ]
  type IFilterFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, Boolean]
  type IFilterFilterPatternObject = StringDictionary[js.Any]
  type IFilterFilterPredicateFunc[T] = js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
  type IFilterJson = js.Function2[/* object */ js.Any, /* spacing */ js.UndefOr[Double], String]
  type IFilterLowercase = js.Function1[/* value */ String, String]
  type IFilterNumber = js.Function2[/* value */ Double | String, /* fractionSize */ js.UndefOr[Double | String], String]
  type IFilterOrderBy = js.Function4[
    /* array */ js.Array[js.Any], 
    /* expression */ String | (js.Function1[/* value */ js.Any, js.Any]) | (js.Array[(js.Function1[/* value */ js.Any, js.Any]) | String]), 
    /* reverse */ js.UndefOr[Boolean], 
    /* comparator */ js.UndefOr[IFilterOrderByComparatorFunc], 
    js.Array[js.Any]
  ]
  type IFilterOrderByComparatorFunc = js.Function2[/* left */ IFilterOrderByItem, /* right */ IFilterOrderByItem, `-1` | `0` | `1`]
  type IFilterUppercase = js.Function1[/* value */ String, String]
  ///////////////////////////////////////////////////////////////////////////
  // HttpBackendService
  // see http://docs.angularjs.org/api/ng.$httpBackend
  // You should never need to use this service directly.
  ///////////////////////////////////////////////////////////////////////////
  type IHttpBackendService = js.Function7[
    /* method */ String, 
    /* url */ String, 
    /* post */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[Function], 
    /* headers */ js.UndefOr[js.Any], 
    /* timeout */ js.UndefOr[Double], 
    /* withCredentials */ js.UndefOr[Boolean], 
    Unit
  ]
  type IHttpInterceptorFactory = js.Function1[/* repeated */ js.Any, IHttpInterceptor]
  /**
    * $http params serializer that converts objects to strings
    * see https://docs.angularjs.org/api/ng/service/$httpParamSerializer
    */
  type IHttpParamSerializer = js.Function1[/* obj */ js.Object, String]
  type IHttpPromise[T] = IPromise[IHttpResponse[T]]
  type IHttpPromiseCallback[T] = js.Function4[
    /* data */ T, 
    /* status */ Double, 
    /* headers */ IHttpHeadersGetter, 
    /* config */ IRequestConfig, 
    Unit
  ]
  /** @deprecated The old name of IHttpResponse. Kept for compatibility. */
  type IHttpPromiseCallbackArg[T] = IHttpResponse[T]
  // See the jsdoc for transformData() at https://github.com/angular/angular.js/blob/master/src/ng/http.js#L228
  type IHttpRequestTransformer = js.Function2[/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter, js.Any]
  // The definition of fields are the same as IHttpResponse
  type IHttpResponseTransformer = js.Function3[/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter, /* status */ Double, js.Any]
  type IInterpolationFunction = js.Function1[/* context */ js.Any, String]
  // We define this as separate interface so we can reopen it later for
  // the ngMock module.
  type ILogCall = js.Function1[/* repeated */ js.Any, Unit]
  type IModelFormatter = js.Function1[/* value */ js.Any, js.Any]
  type IModelParser = js.Function1[/* value */ js.Any, js.Any]
  type IModelValidators = /**
    * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
    */
  StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, Boolean]]
  type IModelViewChangeListener = js.Function0[Unit]
  type IOnChangesObject = StringDictionary[IChangesObject[js.Any]]
  ///////////////////////////////////////////////////////////////////////////
  // ParseService
  // see http://docs.angularjs.org/api/ng.$parse
  // see http://docs.angularjs.org/api/ng.$parseProvider
  ///////////////////////////////////////////////////////////////////////////
  type IParseService = js.Function3[
    /* expression */ String, 
    /* interceptorFn */ js.UndefOr[
      js.Function3[/* value */ js.Any, /* scope */ IScope, /* locals */ js.Any, js.Any]
    ], 
    /* expensiveChecks */ js.UndefOr[Boolean], 
    ICompiledExpression
  ]
  ///////////////////////////////////////////////////////////////////////////
  // RootElementService
  // see http://docs.angularjs.org/api/ng.$rootElement
  ///////////////////////////////////////////////////////////////////////////
  type IRootElementService = JQLite
  type IScope = IRootScopeService
  type IServiceProviderFactory = js.Function1[/* repeated */ js.Any, IServiceProvider]
  ///////////////////////////////////////////////////////////////////////////
  // TemplateCacheService
  // see http://docs.angularjs.org/api/ng.$templateCache
  ///////////////////////////////////////////////////////////////////////////
  type ITemplateCacheService = ICacheObject
  // This corresponds to the "publicLinkFn" returned by $compile.
  type ITemplateLinkingFunction = js.Function3[
    /* scope */ IScope, 
    /* cloneAttachFn */ js.UndefOr[ICloneAttachFunction], 
    /* options */ js.UndefOr[ITemplateLinkingFunctionOptions], 
    JQLite
  ]
  /**
    * xhrFactory
    * Replace or decorate this service to create your own custom XMLHttpRequest objects.
    * see https://docs.angularjs.org/api/ng/service/$xhrFactory
    */
  type IXhrFactory[T] = js.Function2[/* method */ String, /* url */ String, T]
  type Injectable[T /* <: Function */] = T | (js.Array[String | T])
}
