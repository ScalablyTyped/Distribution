package typings.amapJsApiGeolocation.AMap.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
  - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.error = this.cast("error")
}

