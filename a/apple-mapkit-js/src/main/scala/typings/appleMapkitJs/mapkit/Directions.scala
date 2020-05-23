package typings.appleMapkitJs.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a directions object with options that you may provide.
  */
trait Directions extends js.Object {
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  def cancel(id: Double): Boolean
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
  ): Double
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
}

