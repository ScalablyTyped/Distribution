package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The requested start and end points for a route, as well as the planned mode of transportation.
  */
trait DirectionsRequest extends js.Object {
  /**
    * The end point for routing directions.
    */
  var destination: String | Coordinate | Place
  /**
    * The start point for routing directions.
    */
  var origin: String | Coordinate | Place
  /**
    * A Boolean value that indicates whether the server should return multiple
    * routes when they are available.
    */
  var requestsAlternateRoutes: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode of transportation to which directions should apply.
    */
  var transportType: js.UndefOr[String] = js.undefined
}

object DirectionsRequest {
  @scala.inline
  def apply(
    destination: String | Coordinate | Place,
    origin: String | Coordinate | Place,
    requestsAlternateRoutes: js.UndefOr[Boolean] = js.undefined,
    transportType: String = null
  ): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsAlternateRoutes)) __obj.updateDynamic("requestsAlternateRoutes")(requestsAlternateRoutes.get.asInstanceOf[js.Any])
    if (transportType != null) __obj.updateDynamic("transportType")(transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
}

