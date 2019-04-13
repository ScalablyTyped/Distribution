package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularMod {
  type FilterFactory = js.Function1[/* repeated */ js.Any, IFilterFunction]
  type HttpHeaderType = org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Function1[/* config */ IRequestConfig, java.lang.String])]
  type IAsyncModelValidators = org.scalablytyped.runtime.StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, IPromise[js.Any]]]
  type IAugmentedJQuery = angularLib.JQLite
  /**
    * These interfaces are kept for compatibility with older versions of these type definitions.
    * Actually, Angular doesn't create a special subclass of jQuery objects. It extends jQuery.prototype
    * like jQuery plugins do, that's why all jQuery objects have these Angular-specific methods, not
    * only those returned from angular.element.
    * See: http://docs.angularjs.org/api/angular.element
    */
  type IAugmentedJQueryStatic = angularLib.JQueryStatic
  type ICloneAttachFunction = js.Function2[
    /* clonedElement */ js.UndefOr[angularLib.JQLite], 
    /* scope */ js.UndefOr[IScope], 
    js.Any
  ]
  ///////////////////////////////////////////////////////////////////////////
  // CompileService
  // see http://docs.angularjs.org/api/ng.$compile
  // see http://docs.angularjs.org/api/ng.$compileProvider
  ///////////////////////////////////////////////////////////////////////////
  type ICompileService = js.Function3[
    /* element */ java.lang.String | stdLib.Element | angularLib.JQuery, 
    /* transclude */ js.UndefOr[ITranscludeFunction], 
    /* maxPriority */ js.UndefOr[scala.Double], 
    ITemplateLinkingFunction
  ]
  /**
    * Same as IController. Keeping it for compatibility with older versions of these type definitions.
    */
  type IComponentController = IController
  type IControllerConstructor = (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, IController]) | (js.Function1[/* repeated */ js.Any, scala.Unit | IController])
  type IDirectiveCompileFn[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function3[
    /* templateElement */ TElement, 
    /* templateAttributes */ TAttributes, 
    /* transclude */ ITranscludeFunction, 
    scala.Unit | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController]) | (IDirectivePrePost[TScope, TElement, TAttributes, TController])
  ]
  ///////////////////////////////////////////////////////////////////////////
  // Directive
  // see http://docs.angularjs.org/api/ng.$compileProvider#directive
  // and http://docs.angularjs.org/guide/directive
  ///////////////////////////////////////////////////////////////////////////
  type IDirectiveController = IController | js.Array[IController] | org.scalablytyped.runtime.StringDictionary[IController]
  type IDirectiveFactory[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function1[
    /* repeated */ js.Any, 
    (IDirective[TScope, TElement, TAttributes, TController]) | (IDirectiveLinkFn[TScope, TElement, TAttributes, TController])
  ]
  type IDirectiveLinkFn[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] = js.Function5[
    /* scope */ TScope, 
    /* instanceElement */ TElement, 
    /* instanceAttributes */ TAttributes, 
    /* controller */ js.UndefOr[TController], 
    /* transclude */ js.UndefOr[ITranscludeFunction], 
    scala.Unit
  ]
  ///////////////////////////////////////////////////////////////////////////
  // ExceptionHandlerService
  // see http://docs.angularjs.org/api/ng.$exceptionHandler
  ///////////////////////////////////////////////////////////////////////////
  type IExceptionHandlerService = js.Function2[/* exception */ stdLib.Error, /* cause */ js.UndefOr[java.lang.String], scala.Unit]
  type IFilterCurrency = js.Function3[
    /* amount */ scala.Double, 
    /* symbol */ js.UndefOr[java.lang.String], 
    /* fractionSize */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type IFilterDate = js.Function3[
    /* date */ stdLib.Date | scala.Double | java.lang.String, 
    /* format */ js.UndefOr[java.lang.String], 
    /* timezone */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type IFilterFilter = js.Function3[
    /* array */ js.Array[js.Any], 
    /* expression */ java.lang.String | IFilterFilterPatternObject | IFilterFilterPredicateFunc[js.Any], 
    /* comparator */ js.UndefOr[IFilterFilterComparatorFunc[js.Any] | scala.Boolean], 
    js.Array[js.Any]
  ]
  type IFilterFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, scala.Boolean]
  type IFilterFilterPatternObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type IFilterFilterPredicateFunc[T] = js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Boolean]
  type IFilterJson = js.Function2[/* object */ js.Any, /* spacing */ js.UndefOr[scala.Double], java.lang.String]
  type IFilterLowercase = js.Function1[/* value */ java.lang.String, java.lang.String]
  type IFilterNumber = js.Function2[
    /* value */ scala.Double | java.lang.String, 
    /* fractionSize */ js.UndefOr[scala.Double | java.lang.String], 
    java.lang.String
  ]
  type IFilterOrderBy = js.Function4[
    /* array */ js.Array[js.Any], 
    /* expression */ java.lang.String | (js.Function1[/* value */ js.Any, js.Any]) | (js.Array[(js.Function1[/* value */ js.Any, js.Any]) | java.lang.String]), 
    /* reverse */ js.UndefOr[scala.Boolean], 
    /* comparator */ js.UndefOr[IFilterOrderByComparatorFunc], 
    js.Array[js.Any]
  ]
  type IFilterOrderByComparatorFunc = js.Function2[
    /* left */ IFilterOrderByItem, 
    /* right */ IFilterOrderByItem, 
    angularLib.angularLibNumbers.`-1` | angularLib.angularLibNumbers.`0` | angularLib.angularLibNumbers.`1`
  ]
  type IFilterUppercase = js.Function1[/* value */ java.lang.String, java.lang.String]
  ///////////////////////////////////////////////////////////////////////////
  // HttpBackendService
  // see http://docs.angularjs.org/api/ng.$httpBackend
  // You should never need to use this service directly.
  ///////////////////////////////////////////////////////////////////////////
  type IHttpBackendService = js.Function7[
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    /* post */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[angularLib.angularMod.Global.Function], 
    /* headers */ js.UndefOr[js.Any], 
    /* timeout */ js.UndefOr[scala.Double], 
    /* withCredentials */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type IHttpInterceptorFactory = js.Function1[/* repeated */ js.Any, IHttpInterceptor]
  /**
    * $http params serializer that converts objects to strings
    * see https://docs.angularjs.org/api/ng/service/$httpParamSerializer
    */
  type IHttpParamSerializer = js.Function1[/* obj */ js.Object, java.lang.String]
  type IHttpPromise[T] = IPromise[IHttpResponse[T]]
  type IHttpPromiseCallback[T] = js.Function4[
    /* data */ T, 
    /* status */ scala.Double, 
    /* headers */ IHttpHeadersGetter, 
    /* config */ IRequestConfig, 
    scala.Unit
  ]
  /** @deprecated The old name of IHttpResponse. Kept for compatibility. */
  type IHttpPromiseCallbackArg[T] = IHttpResponse[T]
  // See the jsdoc for transformData() at https://github.com/angular/angular.js/blob/master/src/ng/http.js#L228
  type IHttpRequestTransformer = js.Function2[/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter, js.Any]
  // The definition of fields are the same as IHttpResponse
  type IHttpResponseTransformer = js.Function3[
    /* data */ js.Any, 
    /* headersGetter */ IHttpHeadersGetter, 
    /* status */ scala.Double, 
    js.Any
  ]
  type IInterpolationFunction = js.Function1[/* context */ js.Any, java.lang.String]
  // We define this as separate interface so we can reopen it later for
  // the ngMock module.
  type ILogCall = js.Function1[/* repeated */ js.Any, scala.Unit]
  type IModelFormatter = js.Function1[/* value */ js.Any, js.Any]
  type IModelParser = js.Function1[/* value */ js.Any, js.Any]
  type IModelValidators = /**
    * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
    */
  org.scalablytyped.runtime.StringDictionary[js.Function2[/* modelValue */ js.Any, /* viewValue */ js.Any, scala.Boolean]]
  type IModelViewChangeListener = js.Function0[scala.Unit]
  type IOnChangesObject = org.scalablytyped.runtime.StringDictionary[IChangesObject[js.Any]]
  ///////////////////////////////////////////////////////////////////////////
  // ParseService
  // see http://docs.angularjs.org/api/ng.$parse
  // see http://docs.angularjs.org/api/ng.$parseProvider
  ///////////////////////////////////////////////////////////////////////////
  type IParseService = js.Function3[
    /* expression */ java.lang.String, 
    /* interceptorFn */ js.UndefOr[
      js.Function3[/* value */ js.Any, /* scope */ IScope, /* locals */ js.Any, js.Any]
    ], 
    /* expensiveChecks */ js.UndefOr[scala.Boolean], 
    ICompiledExpression
  ]
  ///////////////////////////////////////////////////////////////////////////
  // RootElementService
  // see http://docs.angularjs.org/api/ng.$rootElement
  ///////////////////////////////////////////////////////////////////////////
  type IRootElementService = angularLib.JQLite
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
    angularLib.JQLite
  ]
  /**
    * xhrFactory
    * Replace or decorate this service to create your own custom XMLHttpRequest objects.
    * see https://docs.angularjs.org/api/ng/service/$xhrFactory
    */
  type IXhrFactory[T] = js.Function2[/* method */ java.lang.String, /* url */ java.lang.String, T]
  type Injectable[T /* <: angularLib.angularMod.Global.Function */] = T | (js.Array[java.lang.String | T])
}
