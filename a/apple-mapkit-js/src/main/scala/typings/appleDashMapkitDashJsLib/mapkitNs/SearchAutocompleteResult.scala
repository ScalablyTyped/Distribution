package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAutocompleteResult extends js.Object {
  var coordinate: Coordinate
  var displayLines: js.Array[java.lang.String]
}

object SearchAutocompleteResult {
  @scala.inline
  def apply(coordinate: Coordinate, displayLines: js.Array[java.lang.String]): SearchAutocompleteResult = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, displayLines = displayLines)
  
    __obj.asInstanceOf[SearchAutocompleteResult]
  }
}

