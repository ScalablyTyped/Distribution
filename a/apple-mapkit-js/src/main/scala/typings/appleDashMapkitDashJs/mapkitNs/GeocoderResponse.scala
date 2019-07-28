package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderResponse extends js.Object {
  var results: js.Array[Place]
}

object GeocoderResponse {
  @scala.inline
  def apply(results: js.Array[Place]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results)
  
    __obj.asInstanceOf[GeocoderResponse]
  }
}

