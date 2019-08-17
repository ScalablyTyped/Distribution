package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.Poi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[Poi]
  var id: String
  var index: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[Poi], id: String, index: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id, index = index)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

