package typings.angular.angular

import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents either a component type (`type` is `component`) or a loader function
  * (`type` is `loader`).
  *
  * See also {@link RouteDefinition}.
  */
trait ComponentDefinition extends js.Object {
  var component: js.UndefOr[Type] = js.undefined
  var loader: js.UndefOr[Function] = js.undefined
  var `type`: String
}

object ComponentDefinition {
  @scala.inline
  def apply(`type`: String, component: Type = null, loader: Function = null): ComponentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDefinition]
  }
}

