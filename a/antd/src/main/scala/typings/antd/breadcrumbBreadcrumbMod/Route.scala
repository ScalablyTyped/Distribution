package typings.antd.breadcrumbBreadcrumbMod

import typings.antd.anon.OmitRoutechildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var breadcrumbName: String = js.native
  var children: js.UndefOr[js.Array[OmitRoutechildren]] = js.native
  var path: String = js.native
}

object Route {
  @scala.inline
  def apply(breadcrumbName: String, path: String): Route = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreadcrumbName(value: String): Self = this.set("breadcrumbName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: OmitRoutechildren*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[OmitRoutechildren]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

