package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDrawActionProperties extends DrawActionProperties {
  /**
    * The drawing mode. It is only relevant when the action is first created. Its value cannot be changed during the action lifecycle.  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * freehand | Vertices are added while the pointer is dragged.
    * click | Vertices are added when the pointer is clicked. SegmentDrawActions are created from 2 vertices.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    *
    * @default freehand
    */
  var mode: js.UndefOr[freehand | click] = js.native
}

object SegmentDrawActionProperties {
  @scala.inline
  def apply(): SegmentDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDrawActionProperties]
  }
  @scala.inline
  implicit class SegmentDrawActionPropertiesOps[Self <: SegmentDrawActionProperties] (val x: Self) extends AnyVal {
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
    def setMode(value: freehand | click): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

