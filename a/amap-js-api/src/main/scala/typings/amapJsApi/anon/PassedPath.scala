package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassedPath extends js.Object {
  var passedPath: js.Array[LngLat]
}

object PassedPath {
  @scala.inline
  def apply(passedPath: js.Array[LngLat]): PassedPath = {
    val __obj = js.Dynamic.literal(passedPath = passedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassedPath]
  }
}

