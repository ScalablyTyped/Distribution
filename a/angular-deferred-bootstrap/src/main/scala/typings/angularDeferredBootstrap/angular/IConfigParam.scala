package typings.angularDeferredBootstrap.angular

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigParam extends js.Object {
  var element: js.UndefOr[Node] = js.undefined
  var module: js.UndefOr[String] = js.undefined
  var resolve: js.Any
}

object IConfigParam {
  @scala.inline
  def apply(resolve: js.Any, element: Node = null, module: String = null): IConfigParam = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigParam]
  }
}

