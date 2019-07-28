package typings.atAngularRouter

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.atAngularCoreMod.NgModuleFactory
import typings.atAngularCore.atAngularCoreMod.Type
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularRouterMod {
  type Data = StringDictionary[js.Any]
  type DeprecatedLoadChildren = String
  type DetachedRouteHandle = js.Object
  /**
    * Error handler that is invoked when a navigation error occurs.
    *
    * If the handler returns a value, the navigation promise is resolved with this value.
    * If the handler throws an exception, the navigation promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  type LoadChildren = LoadChildrenCallback | DeprecatedLoadChildren
  type LoadChildrenCallback = js.Function0[
    Type[js.Any] | NgModuleFactory[js.Any] | Observable[Type[js.Any]] | (js.Promise[NgModuleFactory[js.Any] | Type[js.Any] | js.Any])
  ]
  type Params = StringDictionary[js.Any]
  type ResolveData = StringDictionary[js.Any]
  type Routes = js.Array[Route]
  /* Rewritten from type alias, can be one of: 
    - typings.atAngularRouter.atAngularRouterStrings.pathParamsChange
    - typings.atAngularRouter.atAngularRouterStrings.pathParamsOrQueryParamsChange
    - typings.atAngularRouter.atAngularRouterStrings.paramsChange
    - typings.atAngularRouter.atAngularRouterStrings.paramsOrQueryParamsChange
    - typings.atAngularRouter.atAngularRouterStrings.always
    - js.Function2[
  / * from * / typings.atAngularRouter.atAngularRouterMod.ActivatedRouteSnapshot, 
  / * to * / typings.atAngularRouter.atAngularRouterMod.ActivatedRouteSnapshot, 
  scala.Boolean]
  */
  type RunGuardsAndResolvers = _RunGuardsAndResolvers | (js.Function2[/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot, Boolean])
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[UrlSegment], 
    /* group */ UrlSegmentGroup, 
    /* route */ Route, 
    UrlMatchResult
  ]
}
