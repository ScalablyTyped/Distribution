package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcConfigMod {
  type LoadChildren = java.lang.String | LoadChildrenCallback
  type LoadChildrenCallback = js.Function0[
    atAngularCoreLib.srcTypeMod.Type[js.Any] | atAngularCoreLib.coreMod.NgModuleFactory[js.Any] | stdLib.Promise[atAngularCoreLib.srcTypeMod.Type[js.Any]] | rxjsLib.rxjsMod.Observable[atAngularCoreLib.srcTypeMod.Type[js.Any]]
  ]
  type QueryParamsHandling = atAngularRouterLib.atAngularRouterLibStrings.merge | atAngularRouterLib.atAngularRouterLibStrings.preserve | atAngularRouterLib.atAngularRouterLibStrings.Empty
  type Routes = js.Array[Route]
  type RunGuardsAndResolvers = atAngularRouterLib.atAngularRouterLibStrings.paramsChange | atAngularRouterLib.atAngularRouterLibStrings.paramsOrQueryParamsChange | atAngularRouterLib.atAngularRouterLibStrings.always
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment], 
    /* group */ atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegmentGroup, 
    /* route */ Route, 
    UrlMatchResult
  ]
}
