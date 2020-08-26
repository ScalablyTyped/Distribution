package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The directions and estimated travel time returned for a route.
  */
@js.native
trait DirectionsResponse extends js.Object {
  var request: js.Any = js.native
  var routes: js.Array[Route] = js.native
}

object DirectionsResponse {
  @scala.inline
  def apply(request: js.Any, routes: js.Array[Route]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  @scala.inline
  implicit class DirectionsResponseOps[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
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
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Route]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

