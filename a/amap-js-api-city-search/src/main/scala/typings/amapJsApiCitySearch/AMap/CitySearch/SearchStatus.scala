package typings.amapJsApiCitySearch.AMap.CitySearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
  - typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
  - typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.no_data = this.cast("no_data")
}

