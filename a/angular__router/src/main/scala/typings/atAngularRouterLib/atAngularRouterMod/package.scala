package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularRouterMod {
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DeprecatedLoadChildren = java.lang.String
  type DetachedRouteHandle = js.Object
  /**
    * @description
    *
    * Error handler that is invoked when a navigation errors.
    *
    * If the handler returns a value, the navigation promise will be resolved with this value.
    * If the handler throws an exception, the navigation promise will be rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  type LoadChildren = LoadChildrenCallback | DeprecatedLoadChildren
  type LoadChildrenCallback = js.Function0[
    atAngularCoreLib.atAngularCoreMod.Type[js.Any] | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[js.Any] | rxjsLib.rxjsMod.Observable[atAngularCoreLib.atAngularCoreMod.Type[js.Any]] | (js.Promise[
      atAngularCoreLib.atAngularCoreMod.NgModuleFactory[js.Any] | atAngularCoreLib.atAngularCoreMod.Type[js.Any] | js.Any
    ])
  ]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes = js.Array[Route]
  /* Rewritten from type alias, can be one of: 
    - atAngularRouterLib.atAngularRouterLibStrings.pathParamsChange
    - atAngularRouterLib.atAngularRouterLibStrings.pathParamsOrQueryParamsChange
    - atAngularRouterLib.atAngularRouterLibStrings.paramsChange
    - atAngularRouterLib.atAngularRouterLibStrings.paramsOrQueryParamsChange
    - atAngularRouterLib.atAngularRouterLibStrings.always
    - js.Function2[/ * from * / ActivatedRouteSnapshot, / * to * / ActivatedRouteSnapshot, scala.Boolean]
  */
  type RunGuardsAndResolvers = _RunGuardsAndResolvers | (js.Function2[/* from */ ActivatedRouteSnapshot, /* to */ ActivatedRouteSnapshot, scala.Boolean])
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[UrlSegment], 
    /* group */ UrlSegmentGroup, 
    /* route */ Route, 
    UrlMatchResult
  ]
}
