package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRouteOutput extends js.Object {
  /**
    * A full description of the route that was updated.
    */
  var route: RouteData = js.native
}

object UpdateRouteOutput {
  @scala.inline
  def apply(route: RouteData): UpdateRouteOutput = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteOutput]
  }
  @scala.inline
  implicit class UpdateRouteOutputOps[Self <: UpdateRouteOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoute(value: RouteData): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

