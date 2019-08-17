package typings.amapDashJsDashApi.AMapNs.MapNs

import typings.amapDashJsDashApi.Anon_IdIsIndoorPOI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Event<N, {  lnglat  :amap-js-api.AMap.LngLat,   name  :string,   id  :string,   isIndoorPOI  :boolean}> */
trait HotspotEvent[N /* <: String */] extends js.Object {
  var `type`: N
  var value: Anon_IdIsIndoorPOI
}

object HotspotEvent {
  @scala.inline
  def apply[N /* <: String */](`type`: N, value: Anon_IdIsIndoorPOI): HotspotEvent[N] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotEvent[N]]
  }
}

