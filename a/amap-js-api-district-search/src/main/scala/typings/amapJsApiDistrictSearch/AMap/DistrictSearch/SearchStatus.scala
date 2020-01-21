package typings.amapJsApiDistrictSearch.AMap.DistrictSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.no_data = this.cast("no_data")
}

