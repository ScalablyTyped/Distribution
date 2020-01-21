package typings.amapJsApiDriving.AMap.Driving

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiDriving.amapJsApiDrivingStrings.error
  - typings.amapJsApiDriving.amapJsApiDrivingStrings.no_data
  - typings.amapJsApiDriving.amapJsApiDrivingStrings.complete
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiDriving.amapJsApiDrivingStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiDriving.amapJsApiDrivingStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiDriving.amapJsApiDrivingStrings.no_data = this.cast("no_data")
}

