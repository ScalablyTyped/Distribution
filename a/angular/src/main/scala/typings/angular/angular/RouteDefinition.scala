package typings.angular.angular

import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `RouteDefinition` defines a route within a {@link RouteConfig} decorator.
  *
  * Supported keys:
  * - `path` or `aux` (requires exactly one of these)
  * - `component`, `loader`,  `redirectTo` (requires exactly one of these)
  * - `name` or `as` (optional) (requires exactly one of these)
  * - `data` (optional)
  *
  * See also {@link Route}, {@link AsyncRoute}, {@link AuxRoute}, and {@link Redirect}.
  */
trait RouteDefinition extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var aux: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Type | ComponentDefinition | String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var loader: js.UndefOr[Function] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var redirectTo: js.UndefOr[js.Array[_]] = js.undefined
  var useAsDefault: js.UndefOr[Boolean] = js.undefined
}

object RouteDefinition {
  @scala.inline
  def apply(
    as: String = null,
    aux: String = null,
    component: Type | ComponentDefinition | String = null,
    data: js.Any = null,
    loader: Function = null,
    name: String = null,
    path: String = null,
    redirectTo: js.Array[_] = null,
    useAsDefault: js.UndefOr[Boolean] = js.undefined
  ): RouteDefinition = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (aux != null) __obj.updateDynamic("aux")(aux.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(useAsDefault)) __obj.updateDynamic("useAsDefault")(useAsDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteDefinition]
  }
}

