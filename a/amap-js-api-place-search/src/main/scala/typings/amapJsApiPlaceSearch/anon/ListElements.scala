package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElements extends js.Object {
  var listElements: js.Array[HTMLElement] = js.native
  var markers: js.Array[Marker[_]] = js.native
  var result: js.Array[SelectChangeEventData] = js.native
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
  @scala.inline
  implicit class ListElementsOps[Self <: ListElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListElementsVarargs(value: HTMLElement*): Self = this.set("listElements", js.Array(value :_*))
    @scala.inline
    def setListElements(value: js.Array[HTMLElement]): Self = this.set("listElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkersVarargs(value: Marker[js.Any]*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[Marker[_]]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultVarargs(value: SelectChangeEventData*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[SelectChangeEventData]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

