package typings.angularDashRoute.angularDashRouteMod.angularMod.route

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.Injectable
import typings.angularDashRoute.Anon_Index
import typings.angularDashRoute.Fn_LocationPath
import typings.angularDashRoute.Fn_RouteParams
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
    redirectTo: String | Fn_LocationPath = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    reloadOnUrl: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[js.Any] = null,
    resolveAs: String = null,
    resolveRedirectTo: Injectable[
      js.Function1[/* repeated */ _, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
    ] = null,
    template: String | Fn_RouteParams = null,
    templateUrl: String | Fn_RouteParams = null
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

