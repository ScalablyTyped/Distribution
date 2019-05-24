package typings
package antdLib.libBreadcrumbBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var breadcrumbName: java.lang.String
  var children: js.UndefOr[js.Array[antdLib.OmitRoutechildren]] = js.undefined
  var path: java.lang.String
}

object Route {
  @scala.inline
  def apply(
    breadcrumbName: java.lang.String,
    path: java.lang.String,
    children: js.Array[antdLib.OmitRoutechildren] = null
  ): Route = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName, path = path)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Route]
  }
}

