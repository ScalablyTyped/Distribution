package typings
package atAngularRouterLib.srcRouterUnderscoreStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_state", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def advanceActivatedRoute(route: ActivatedRoute): scala.Unit = js.native
  def createEmptyState(urlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): RouterState = js.native
  def createEmptyState(
    urlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    rootComponent: atAngularCoreLib.srcTypeMod.Type[_]
  ): RouterState = js.native
  def createEmptyStateSnapshot(urlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): RouterStateSnapshot = js.native
  def createEmptyStateSnapshot(
    urlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    rootComponent: atAngularCoreLib.srcTypeMod.Type[_]
  ): RouterStateSnapshot = js.native
  def equalParamsAndUrlSegments(a: ActivatedRouteSnapshot, b: ActivatedRouteSnapshot): scala.Boolean = js.native
}

