package typings.amapDashJsDashApi.AMap.Map

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.bg
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.point_
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.road
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.building
*/
trait Feature extends js.Object

object Feature {
  @scala.inline
  def bg: typings.amapDashJsDashApi.amapDashJsDashApiStrings.bg = this.cast("bg")
  @scala.inline
  def building: typings.amapDashJsDashApi.amapDashJsDashApiStrings.building = this.cast("building")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def road: typings.amapDashJsDashApi.amapDashJsDashApiStrings.road = this.cast("road")
}

