package typings.amapDashJsDashApi.AMap.LabelsLayer

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsLayerEvent[I] extends js.Object {
  var data: EventData
  var lnglat: LngLat
  var pixel: Pixel
  var target: I
}

object LabelsLayerEvent {
  @scala.inline
  def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
    val __obj = js.Dynamic.literal(data = data, lnglat = lnglat, pixel = pixel, target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelsLayerEvent[I]]
  }
}

