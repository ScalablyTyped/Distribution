package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse extends js.Object {
  var boundingRegion: CoordinateRegion
  var places: js.Array[Place]
  var query: String
}

object SearchResponse {
  @scala.inline
  def apply(boundingRegion: CoordinateRegion, places: js.Array[Place], query: String): SearchResponse = {
    val __obj = js.Dynamic.literal(boundingRegion = boundingRegion, places = places, query = query)
  
    __obj.asInstanceOf[SearchResponse]
  }
}

