package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcConfigMod {
  type LoadChildren = java.lang.String | LoadChildrenCallback
  type LoadChildrenCallback = js.Function0[
    atAngularCoreLib.srcTypeMod.Type[js.Any] | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[js.Any] | js.Promise[atAngularCoreLib.srcTypeMod.Type[js.Any]] | rxjsLib.rxjsMod.Observable[atAngularCoreLib.srcTypeMod.Type[js.Any]]
  ]
  type Routes = js.Array[Route]
  type RunGuardsAndResolvers = _RunGuardsAndResolvers | (js.Function2[
    /* from */ atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
    /* to */ atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
    scala.Boolean
  ])
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment], 
    /* group */ atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup, 
    /* route */ Route, 
    UrlMatchResult
  ]
}
