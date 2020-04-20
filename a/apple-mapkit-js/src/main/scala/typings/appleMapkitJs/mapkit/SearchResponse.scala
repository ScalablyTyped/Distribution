package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a search, including the original search query, the bounding
  * region, and a list of places that match the query.
  */
trait SearchResponse extends js.Object {
  /**
    * The region that encloses the places included in the search results.
    */
  var boundingRegion: CoordinateRegion
  /**
    * A list of places that match the search query.
    */
  var places: js.Array[Place]
  /**
    * The query string used to perform the search.
    */
  var query: String
}

object SearchResponse {
  @scala.inline
  def apply(boundingRegion: CoordinateRegion, places: js.Array[Place], query: String): SearchResponse = {
    val __obj = js.Dynamic.literal(boundingRegion = boundingRegion.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
}

