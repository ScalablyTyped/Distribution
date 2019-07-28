package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/breadcrumb/Breadcrumb.Route, 'children'> */
trait OmitRoutechildren extends js.Object {
  var breadcrumbName: String
  var path: String
}

object OmitRoutechildren {
  @scala.inline
  def apply(breadcrumbName: String, path: String): OmitRoutechildren = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName, path = path)
  
    __obj.asInstanceOf[OmitRoutechildren]
  }
}

