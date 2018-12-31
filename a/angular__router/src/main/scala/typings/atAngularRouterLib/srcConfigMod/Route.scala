package typings
package atAngularRouterLib.srcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var canActivate: js.UndefOr[js.Array[_]] = js.undefined
  var canActivateChild: js.UndefOr[js.Array[_]] = js.undefined
  var canDeactivate: js.UndefOr[js.Array[_]] = js.undefined
  var canLoad: js.UndefOr[js.Array[_]] = js.undefined
  var children: js.UndefOr[Routes] = js.undefined
  var component: js.UndefOr[atAngularCoreLib.srcTypeMod.Type[_]] = js.undefined
  var data: js.UndefOr[Data] = js.undefined
  var loadChildren: js.UndefOr[LoadChildren] = js.undefined
  var matcher: js.UndefOr[UrlMatcher] = js.undefined
  var outlet: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathMatch: js.UndefOr[java.lang.String] = js.undefined
  var redirectTo: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[ResolveData] = js.undefined
  var runGuardsAndResolvers: js.UndefOr[RunGuardsAndResolvers] = js.undefined
}

