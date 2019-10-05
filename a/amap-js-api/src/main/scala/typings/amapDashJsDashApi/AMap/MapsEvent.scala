package typings.amapDashJsDashApi.AMap

import typings.amapDashJsDashApi.Anon_Lnglat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Event<N, {  lnglat  :amap-js-api.AMap.LngLat,   pixel  :amap-js-api.AMap.Pixel,   target  :I}> */
trait MapsEvent[N /* <: String */, I] extends js.Object {
  var `type`: N
  var value: Anon_Lnglat[I]
}

object MapsEvent {
  @scala.inline
  def apply[N /* <: String */, I](`type`: N, value: Anon_Lnglat[I]): MapsEvent[N, I] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEvent[N, I]]
  }
}

