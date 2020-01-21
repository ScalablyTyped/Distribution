package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var children: js.UndefOr[js.Array[Route]] = js.undefined
  var loadChildren: js.UndefOr[String | Type | js.Any] = js.undefined
}

object Route {
  @scala.inline
  def apply(children: js.Array[Route] = null, loadChildren: String | Type | js.Any = null): Route = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(loadChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

