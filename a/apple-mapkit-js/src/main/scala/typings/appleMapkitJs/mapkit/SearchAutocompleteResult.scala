package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of an autocomplete query, including display lines and a coordinate.
  */
trait SearchAutocompleteResult extends js.Object {
  /**
    * The coordinate of the result, provided when it corresponds to a single place.
    */
  var coordinate: Coordinate
  /**
    * Lines of text to display to the user in an autocomplete menu.
    */
  var displayLines: js.Array[String]
}

object SearchAutocompleteResult {
  @scala.inline
  def apply(coordinate: Coordinate, displayLines: js.Array[String]): SearchAutocompleteResult = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], displayLines = displayLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResult]
  }
}

