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

object Route {
  @scala.inline
  def apply(
    canActivate: js.Array[_] = null,
    canActivateChild: js.Array[_] = null,
    canDeactivate: js.Array[_] = null,
    canLoad: js.Array[_] = null,
    children: Routes = null,
    component: atAngularCoreLib.srcTypeMod.Type[_] = null,
    data: Data = null,
    loadChildren: LoadChildren = null,
    matcher: UrlMatcher = null,
    outlet: java.lang.String = null,
    path: java.lang.String = null,
    pathMatch: java.lang.String = null,
    redirectTo: java.lang.String = null,
    resolve: ResolveData = null,
    runGuardsAndResolvers: RunGuardsAndResolvers = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (canActivate != null) __obj.updateDynamic("canActivate")(canActivate)
    if (canActivateChild != null) __obj.updateDynamic("canActivateChild")(canActivateChild)
    if (canDeactivate != null) __obj.updateDynamic("canDeactivate")(canDeactivate)
    if (canLoad != null) __obj.updateDynamic("canLoad")(canLoad)
    if (children != null) __obj.updateDynamic("children")(children)
    if (component != null) __obj.updateDynamic("component")(component)
    if (data != null) __obj.updateDynamic("data")(data)
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(loadChildren.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (outlet != null) __obj.updateDynamic("outlet")(outlet)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathMatch != null) __obj.updateDynamic("pathMatch")(pathMatch)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (runGuardsAndResolvers != null) __obj.updateDynamic("runGuardsAndResolvers")(runGuardsAndResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

