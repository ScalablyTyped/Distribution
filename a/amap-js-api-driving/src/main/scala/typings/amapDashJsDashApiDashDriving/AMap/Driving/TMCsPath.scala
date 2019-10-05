package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMCsPath extends js.Object {
  var path: js.Array[LngLat]
  var status: String
}

object TMCsPath {
  @scala.inline
  def apply(path: js.Array[LngLat], status: String): TMCsPath = {
    val __obj = js.Dynamic.literal(path = path, status = status)
  
    __obj.asInstanceOf[TMCsPath]
  }
}

