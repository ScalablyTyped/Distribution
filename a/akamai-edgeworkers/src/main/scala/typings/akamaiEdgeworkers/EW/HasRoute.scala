package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasRoute extends js.Object {
  /**
    * If called, indicates that the request should be routed to a pre-specified origin
    * server,or have the path or query string modified.
    *
    * @param destination Object holding properties that will control route
    */
  def route(destination: Destination): Unit = js.native
}

object HasRoute {
  @scala.inline
  def apply(route: Destination => Unit): HasRoute = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction1(route))
    __obj.asInstanceOf[HasRoute]
  }
  @scala.inline
  implicit class HasRouteOps[Self <: HasRoute] (val x: Self) extends AnyVal {
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
    def setRoute(value: Destination => Unit): Self = this.set("route", js.Any.fromFunction1(value))
  }
  
}

