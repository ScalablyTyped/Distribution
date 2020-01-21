package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.dashed
  - typings.amapJsApi.amapJsApiStrings.solid
*/
trait StrokeStyle extends js.Object

object StrokeStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.amapJsApi.amapJsApiStrings.dashed = this.cast("dashed")
  @scala.inline
  def solid: typings.amapJsApi.amapJsApiStrings.solid = this.cast("solid")
}

