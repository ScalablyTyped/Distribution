package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonDrawActionProperties extends DrawActionProperties {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged.
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#mode)
    *
    * @default hybrid
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}

object PolygonDrawActionProperties {
  @scala.inline
  def apply(): PolygonDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonDrawActionProperties]
  }
  @scala.inline
  implicit class PolygonDrawActionPropertiesOps[Self <: PolygonDrawActionProperties] (val x: Self) extends AnyVal {
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
    def setMode(value: hybrid | freehand | click): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

