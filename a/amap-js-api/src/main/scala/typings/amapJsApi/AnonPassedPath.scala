package typings.amapJsApi

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassedPath extends js.Object {
  var passedPath: js.Array[LngLat]
}

object AnonPassedPath {
  @scala.inline
  def apply(passedPath: js.Array[LngLat]): AnonPassedPath = {
    val __obj = js.Dynamic.literal(passedPath = passedPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassedPath]
  }
}

