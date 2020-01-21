package typings.amapJsApi.AMap.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.left
  - typings.amapJsApi.amapJsApiStrings.right
  - typings.amapJsApi.amapJsApiStrings.center
*/
trait TextAlign extends js.Object

object TextAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.amapJsApi.amapJsApiStrings.center = this.cast("center")
  @scala.inline
  def left: typings.amapJsApi.amapJsApiStrings.left = this.cast("left")
  @scala.inline
  def right: typings.amapJsApi.amapJsApiStrings.right = this.cast("right")
}

