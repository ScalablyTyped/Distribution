package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
  - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
  - typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.no_data = this.cast("no_data")
}

