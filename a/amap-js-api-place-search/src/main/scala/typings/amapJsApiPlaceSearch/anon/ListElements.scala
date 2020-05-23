package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElements extends js.Object {
  var listElements: js.Array[HTMLElement]
  var markers: js.Array[Marker[_]]
  var result: js.Array[SelectChangeEventData]
}

object ListElements {
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): ListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElements]
  }
}

