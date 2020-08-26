package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/breadcrumb/Breadcrumb.Route, 'children'> */
@js.native
trait OmitRoutechildren extends js.Object {
  var breadcrumbName: String = js.native
  var path: String = js.native
}

object OmitRoutechildren {
  @scala.inline
  def apply(breadcrumbName: String, path: String): OmitRoutechildren = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRoutechildren]
  }
  @scala.inline
  implicit class OmitRoutechildrenOps[Self <: OmitRoutechildren] (val x: Self) extends AnyVal {
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
  }
  
}

