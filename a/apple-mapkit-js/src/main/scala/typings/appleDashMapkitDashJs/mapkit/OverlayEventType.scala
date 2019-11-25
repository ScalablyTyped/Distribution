package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.select
  - typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.deselect
*/
trait OverlayEventType extends js.Object

object OverlayEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def select: typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.select = this.cast("select")
}

