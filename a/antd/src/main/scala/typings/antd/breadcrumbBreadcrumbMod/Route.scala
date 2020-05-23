package typings.antd.breadcrumbBreadcrumbMod

import typings.antd.anon.OmitRoutechildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var breadcrumbName: String
  var children: js.UndefOr[js.Array[OmitRoutechildren]] = js.undefined
  var path: String
}

object Route {
  @scala.inline
  def apply(breadcrumbName: String, path: String, children: js.Array[OmitRoutechildren] = null): Route = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

