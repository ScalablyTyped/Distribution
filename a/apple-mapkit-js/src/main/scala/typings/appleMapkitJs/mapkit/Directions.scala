package typings.appleMapkitJs.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a directions object with options that you may provide.
  */
@js.native
trait Directions extends js.Object {
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  def cancel(id: Double): Boolean = js.native
  /**
    * Retrieves directions and estimated travel time for the specified start
    * and end points.
    *
    * @param request DirectionsRequest object that specifies details for the
    * directions you want to retrieve.
    * @param callback A callback function that receives the directions,
    * returned asynchronously.
    * @return A request ID, which you can pass to cancel to abort a pending request.
    */
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]
  ): Double = js.native
}

object Directions {
  @scala.inline
  def apply(
    cancel: Double => Boolean,
    route: (DirectionsRequest, js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]) => Double
  ): Directions = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[Directions]
  }
  @scala.inline
  implicit class DirectionsOps[Self <: Directions] (val x: Self) extends AnyVal {
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
    def setCancel(value: Double => Boolean): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setRoute(
      value: (DirectionsRequest, js.Function2[/* error */ Error | Null, /* data */ DirectionsResponse, Unit]) => Double
    ): Self = this.set("route", js.Any.fromFunction2(value))
  }
  
}

