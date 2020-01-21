package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TMCsPath]
  }
}

