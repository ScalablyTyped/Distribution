package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options you can provide when performing a search.
  */
trait SearchOptions extends js.Object {
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: Coordinate
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: String
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: CoordinateRegion
}

object SearchOptions {
  @scala.inline
  def apply(coordinate: Coordinate, language: String, region: CoordinateRegion): SearchOptions = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

