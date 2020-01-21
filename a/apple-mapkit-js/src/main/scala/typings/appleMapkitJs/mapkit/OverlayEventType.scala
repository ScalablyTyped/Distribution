package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.appleMapkitJs.appleMapkitJsStrings.select
  - typings.appleMapkitJs.appleMapkitJsStrings.deselect
*/
trait OverlayEventType extends js.Object

object OverlayEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typings.appleMapkitJs.appleMapkitJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def select: typings.appleMapkitJs.appleMapkitJsStrings.select = this.cast("select")
}

