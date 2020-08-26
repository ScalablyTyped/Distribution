package typings.angularRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DeprecatedLoadChildren = java.lang.String
  type DetachedRouteHandle = js.Object
  /**
    * Error handler that is invoked when a navigation error occurs.
    *
    * If the handler returns a value, the navigation Promise is resolved with this value.
    * If the handler throws an exception, the navigation Promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  type LoadChildren = typings.angularRouter.mod.LoadChildrenCallback | typings.angularRouter.mod.DeprecatedLoadChildren
  type LoadChildrenCallback = js.Function0[
    typings.angularCore.mod.Type[js.Any] | typings.angularCore.mod.NgModuleFactory[js.Any] | typings.rxjs.mod.Observable_[typings.angularCore.mod.Type[js.Any]] | (js.Promise[
      typings.angularCore.mod.NgModuleFactory[js.Any] | typings.angularCore.mod.Type[js.Any] | js.Any
    ])
  ]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes = js.Array[typings.angularRouter.mod.Route]
  /* Rewritten from type alias, can be one of: 
    - typings.angularRouter.angularRouterStrings.pathParamsChange
    - typings.angularRouter.angularRouterStrings.pathParamsOrQueryParamsChange
    - typings.angularRouter.angularRouterStrings.paramsChange
    - typings.angularRouter.angularRouterStrings.paramsOrQueryParamsChange
    - typings.angularRouter.angularRouterStrings.always
    - js.Function2[
  / * from * / typings.angularRouter.mod.ActivatedRouteSnapshot, 
  / * to * / typings.angularRouter.mod.ActivatedRouteSnapshot, 
  scala.Boolean]
  */
  type RunGuardsAndResolvers = typings.angularRouter.mod._RunGuardsAndResolvers | (js.Function2[
    /* from */ typings.angularRouter.mod.ActivatedRouteSnapshot, 
    /* to */ typings.angularRouter.mod.ActivatedRouteSnapshot, 
    scala.Boolean
  ])
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[typings.angularRouter.mod.UrlSegment], 
    /* group */ typings.angularRouter.mod.UrlSegmentGroup, 
    /* route */ typings.angularRouter.mod.Route, 
    typings.angularRouter.mod.UrlMatchResult | scala.Null
  ]
}
