package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.miter
  - typings.amapJsApi.amapJsApiStrings.round
  - typings.amapJsApi.amapJsApiStrings.bevel
*/
trait StrokeLineJoin extends js.Object

object StrokeLineJoin {
  @scala.inline
  def bevel: typings.amapJsApi.amapJsApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.amapJsApi.amapJsApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.amapJsApi.amapJsApiStrings.round = this.cast("round")
}

