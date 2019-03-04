package typings
package angularDashRouteLib.angularDashRouteMod.angularMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see http://docs.angularjs.org/api/ng.$route#current
trait ICurrentRoute extends IRoute {
  var locals: angularDashRouteLib.Anon_Index
  var params: js.Any
}

object ICurrentRoute {
  @scala.inline
  def apply(
    locals: angularDashRouteLib.Anon_Index,
    params: js.Any,
    caseInsensitiveMatch: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String | InlineAnnotatedFunction = null,
    controllerAs: java.lang.String = null,
    redirectTo: java.lang.String | angularDashRouteLib.Anon_LocationPath = null,
    reloadOnSearch: js.UndefOr[scala.Boolean] = js.undefined,
    reloadOnUrl: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    resolveAs: java.lang.String = null,
    resolveRedirectTo: angularLib.angularMod.angularNs.Injectable[
      js.Function1[
        /* repeated */ _, 
        js.UndefOr[
          angularLib.angularMod.angularNs.IPromise[js.UndefOr[java.lang.String]] | java.lang.String
        ]
      ]
    ] = null,
    template: java.lang.String | angularDashRouteLib.Anon_RouteParams = null,
    templateUrl: java.lang.String | angularDashRouteLib.Anon_RouteParams = null
  ): ICurrentRoute = {
    val __obj = js.Dynamic.literal(locals = locals, params = params)
    if (!js.isUndefined(caseInsensitiveMatch)) __obj.updateDynamic("caseInsensitiveMatch")(caseInsensitiveMatch)
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch)
    if (!js.isUndefined(reloadOnUrl)) __obj.updateDynamic("reloadOnUrl")(reloadOnUrl)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (resolveAs != null) __obj.updateDynamic("resolveAs")(resolveAs)
    if (resolveRedirectTo != null) __obj.updateDynamic("resolveRedirectTo")(resolveRedirectTo.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRoute]
  }
}

