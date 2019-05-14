package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsResponse extends js.Object {
  var request: DirectionsRequest
  var routes: js.Array[Route]
}

object DirectionsResponse {
  @scala.inline
  def apply(request: DirectionsRequest, routes: js.Array[Route]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(request = request, routes = routes)
  
    __obj.asInstanceOf[DirectionsResponse]
  }
}

