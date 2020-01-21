package typings.amapJsApiToolBar

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLnglat extends js.Object {
  var lnglat: LngLat
}

object AnonLnglat {
  @scala.inline
  def apply(lnglat: LngLat): AnonLnglat = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLnglat]
  }
}

