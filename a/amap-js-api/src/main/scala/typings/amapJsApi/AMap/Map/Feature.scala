package typings.amapJsApi.AMap.Map

import typings.amapJsApi.amapJsApiStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.bg
  - typings.amapJsApi.amapJsApiStrings.point_
  - typings.amapJsApi.amapJsApiStrings.road
  - typings.amapJsApi.amapJsApiStrings.building
*/
trait Feature extends js.Object

object Feature {
  @scala.inline
  def bg: typings.amapJsApi.amapJsApiStrings.bg = this.cast("bg")
  @scala.inline
  def building: typings.amapJsApi.amapJsApiStrings.building = this.cast("building")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def road: typings.amapJsApi.amapJsApiStrings.road = this.cast("road")
}

