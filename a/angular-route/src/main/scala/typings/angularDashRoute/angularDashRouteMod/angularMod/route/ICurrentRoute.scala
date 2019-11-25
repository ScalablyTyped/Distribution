package typings.angularDashRoute.angularDashRouteMod.angularMod.route

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.Injectable
import typings.angularDashRoute.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see http://docs.angularjs.org/api/ng.$route#current
trait ICurrentRoute extends IRoute {
  var locals: Anon_Index
  var params: js.Any
}

object ICurrentRoute {
  @scala.inline
  def apply(
    locals: Anon_Index,
    params: js.Any,
    caseInsensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    controller: String | InlineAnnotatedFunction = null,
    controllerAs: String = null,
    redirectTo: String | (js.Function3[
      /* $routeParams */ js.UndefOr[IRouteParamsService], 
      /* $locationPath */ js.UndefOr[String], 
      /* $locationSearch */ js.UndefOr[js.Any], 
      String
    ]) = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    reloadOnUrl: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[js.Any] = null,
    resolveAs: String = null,
    resolveRedirectTo: Injectable[
      js.Function1[/* repeated */ _, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
    ] = null,
    template: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String]) = null,
    templateUrl: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String]) = null
  ): ICurrentRoute = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(caseInsensitiveMatch)) __obj.updateDynamic("caseInsensitiveMatch")(caseInsensitiveMatch.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnUrl)) __obj.updateDynamic("reloadOnUrl")(reloadOnUrl.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolveAs != null) __obj.updateDynamic("resolveAs")(resolveAs.asInstanceOf[js.Any])
    if (resolveRedirectTo != null) __obj.updateDynamic("resolveRedirectTo")(resolveRedirectTo.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRoute]
  }
}

