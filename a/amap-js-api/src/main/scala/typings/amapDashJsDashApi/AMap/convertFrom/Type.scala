package typings.amapDashJsDashApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.gps
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.baidu
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.mapbar
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def baidu: typings.amapDashJsDashApi.amapDashJsDashApiStrings.baidu = this.cast("baidu")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typings.amapDashJsDashApi.amapDashJsDashApiStrings.gps = this.cast("gps")
  @scala.inline
  def mapbar: typings.amapDashJsDashApi.amapDashJsDashApiStrings.mapbar = this.cast("mapbar")
}

