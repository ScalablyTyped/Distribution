package typings.amapJsApi.AMap

import typings.amapJsApi.AnonLnglat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Event<N, {  lnglat  :amap-js-api.AMap.LngLat,   pixel  :amap-js-api.AMap.Pixel,   target  :I}> */
trait MapsEvent[N /* <: String */, I] extends js.Object {
  var `type`: N
  var value: AnonLnglat[I]
}

object MapsEvent {
  @scala.inline
  def apply[N /* <: String */, I](`type`: N, value: AnonLnglat[I]): MapsEvent[N, I] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEvent[N, I]]
  }
}

