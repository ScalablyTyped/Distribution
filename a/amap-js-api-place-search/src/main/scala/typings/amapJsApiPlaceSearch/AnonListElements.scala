package typings.amapJsApiPlaceSearch

import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListElements extends js.Object {
  var listElements: js.Array[HTMLElement]
  var markers: js.Array[Marker[_]]
  var result: js.Array[SelectChangeEventData]
}

object AnonListElements {
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): AnonListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListElements]
  }
}

