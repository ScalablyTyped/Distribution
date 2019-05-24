package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/_util/type.Omit<antd.antd/lib/breadcrumb/Breadcrumb.Route, 'children'> */
trait OmitRoutechildren extends js.Object {
  var breadcrumbName: java.lang.String
  var path: java.lang.String
}

object OmitRoutechildren {
  @scala.inline
  def apply(breadcrumbName: java.lang.String, path: java.lang.String): OmitRoutechildren = {
    val __obj = js.Dynamic.literal(breadcrumbName = breadcrumbName, path = path)
  
    __obj.asInstanceOf[OmitRoutechildren]
  }
}

