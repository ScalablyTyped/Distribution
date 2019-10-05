package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApi.AMap.Marker
import typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ListElements extends js.Object {
  var listElements: js.Array[HTMLElement]
  var markers: js.Array[Marker[_]]
  var result: js.Array[SelectChangeEventData]
}

object Anon_ListElements {
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): Anon_ListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements, markers = markers, result = result)
  
    __obj.asInstanceOf[Anon_ListElements]
  }
}

