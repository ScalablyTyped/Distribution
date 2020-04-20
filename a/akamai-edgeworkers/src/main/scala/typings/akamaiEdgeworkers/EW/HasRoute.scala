package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasRoute extends js.Object {
  /**
    * If called, indicates that the request should be routed to a pre-specified origin
    * server,or have the path or query string modified.
    *
    * @param destination Object holding properties that will control route
    */
  def route(destination: Destination): Unit
}

object HasRoute {
  @scala.inline
  def apply(route: Destination => Unit): HasRoute = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction1(route))
    __obj.asInstanceOf[HasRoute]
  }
}

